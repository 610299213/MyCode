package Preparation;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 处理器
 * @date: 2022/07/05 19:06
 */
public interface Handler {

    // 返回Boolean.TRUE = 成功
    // 返回Boolean.FALSE = 拒绝
    // 返回null = 交下一个处理
    Boolean process(Request request);
}
