package Preparation;

import java.math.BigDecimal;
import java.util.Vector;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 责任链
 * @date: 2022/07/05 19:17
 */
public class HandlerChain {

    private Vector<Handler> handlers = new Vector<>();

    public void addHandler(Handler handler) {

        this.handlers.add(handler);
    }

    public Boolean process(Request request) {

        for (Handler x: handlers) {

            Boolean p = x.process(request);
            if (null != p) {
                System.out.println(request + ", " + (p ? "is approved by:" : "is denied by:") + x.getClass().getSimpleName());
                return p;
            }
        }
        // 如果handler完成了 扔没有返回就说明没有能够对这个请求进行处理的。
        throw new RuntimeException("这个请求无法被处理:" + request);
    }


    public static void main(String[] args) {

        // 构建责任链
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new ManagerHandler());
        handlerChain.addHandler(new DirectorHandler());

        // 利用责任链处理请求
        // 处理请求:
        handlerChain.process(new Request("Bob", new BigDecimal("123.45")));
        handlerChain.process(new Request("cat", new BigDecimal("12.45")));
        handlerChain.process(new Request("bob", new BigDecimal("9999")));
        // 这个请求没有 > 10000且没有人能处理
        handlerChain.process(new Request("Bob", new BigDecimal("12333.45")));
    }
}
