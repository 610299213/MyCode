package Preparation;

import java.math.BigDecimal;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 经理-责任链中的一个
 * @date: 2022/07/05 19:09
 */
public class ManagerHandler implements Handler{

    public Boolean process(Request request) {

        // 如果超过1000元，处理不了，交下一个处理:
        if (request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
            return null;
        }
        // 对Bob有偏见:如果是bob的话就不让他花钱
        return !request.getName().equalsIgnoreCase("bob");
    }
}
