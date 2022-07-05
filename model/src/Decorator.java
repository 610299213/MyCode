import Pojo.Decoratored;
import Pojo.DecoratoredImpl;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 装饰者模式
 * @date: 2022/07/05 10:49
 */
public class Decorator implements Decoratored {

    /**
     * 私有化实现的成员方法
     */
    private DecoratoredImpl decoratored;

    public Decorator (DecoratoredImpl decoratored) {
        super();
        this.decoratored = decoratored;
    }


    @Override
    public void method() {

        System.out.println("被装饰方法方法前面进行增强");
        decoratored.method();
        System.out.println("被装饰方法方法后面进行增强");
    }

    public static void main(String[] args) {

        // 没有被装饰的时候,
        DecoratoredImpl decoratored = new DecoratoredImpl();
        decoratored.method();

        System.out.println("------------------------------");
        // 被装饰的时候
        Decorator decorator = new Decorator(new DecoratoredImpl());
        decorator.method();
    }
}
