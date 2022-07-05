import Pojo.ConcreteObserver2;
import Pojo.ConcreteObserver3;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 观察者模式的通知端
 * @date: 2022/07/05 18:13
 */
public class Client {

    public static void main(String[] args) {

        BeObservered beObservered = new ConcreteObserver();

        // 注册两个
        beObservered.RegisterObserver(new ConcreteObserver2());
        beObservered.RegisterObserver(new ConcreteObserver3());

        //通知
        beObservered.doSomething();
    }
}
