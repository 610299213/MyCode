package Pojo;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 实现装饰者模式
 * @date: 2022/07/05 10:59
 */
public class DecoratoredImpl implements Decoratored{


    @Override
    public void method() {
        System.out.println("这个是正常的集成接口以及被使用的过程。");
    }
}
