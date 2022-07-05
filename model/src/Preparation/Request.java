package Preparation;

import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 责任链模式:
 * 责任链模式的定义：使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理他为止。
 * --------------------------------------
 * 标准的责任链模式，个人总结下来有如下几个特点：
 * 链上的每个对象都有机会处理请求
 * 链上的每个对象都持有下一个要处理对象的引用
 * 链上的某个对象无法处理当前请求，那么它会把相同的请求传给下一个对象
 * --------------------------------------
 *
 *
 * 在实际场景中，财务审批就是一个责任链模式。假设某个员工需要报销一笔费用，审核者可以分为：
 *
 * Manager：只能审核1000元以下的报销；
 * Director：只能审核10000元以下的报销；
 * CEO：可以审核任意额度。
 * 用责任链模式设计此报销流程时，每个审核者只关心自己责任范围内的请求，并且处理它。
 * 对于超出自己责任范围的，扔给下一个审核者处理，这样，将来继续添加审核者的时候，不用改动现有逻辑。
 *
 * @date: 2022/07/05 18:53
 */
@ToString
public class Request {

    private String name;
    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
