import Pojo.Observer;
import lombok.Data;

import java.util.Vector;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 观察者中的 被观察者
 * @date: 2022/07/05 13:07
 * ---------------------
 * Subject（目标）：
 * 被观察者，它是指被观察的对象。 类中有一个用来存放观察者对象的Vector
 * 容器（之所以使用Vector而不使用List，是因为多线程操作时，Vector在是安全的，而List则是不安全的）
 * 这个Vector容器是被观察者类的核心，
 * 另外还有三个方法：attach方法是向这个容器中添加观察者对象；
 * detach方法是从容器中移除观察者对象；
 * notify方法是依次调用观察者对象的对应方法。这个角色可以是接口，也可以是抽象类或者具体的类，因为很多情况下会与其他的模式混用，所以使用抽象类的情况比较多。
 *
 * ConcreteSubject（具体目标）：
 * 具体目标是目标类的子类，通常它包含经常发生改变的数据，当它的状态发生改变时，
 * 向它的各个观察者发出通知。同时它还实现了在目标类中定义的抽象业务逻辑方法（如果有的话）。如果无须扩展目标类，则具体目标类可以省略。
 *
 * Observer（观察者）：
 * 观察者将对观察目标的改变做出反应，观察者一般定义为接口，该接口声明了更新数据的方法 update()，因此又称为抽象观察者。
 *
 * ConcreteObserver（具体观察者）：
 * 在具体观察者中维护一个指向具体目标对象的引用，它存储具体观察者的有关状态，这些状态需要和具体目标的状态保持一致；
 * 它实现了在抽象观察者 Observer 中定义的 update()方法。
 * 通常在实现时，可以调用具体目标类的 attach() 方法将自己添加到目标类的集合中或通过 detach() 方法将自己从目标类的集合中删除。
 */
public abstract class BeObservered {

    /**
     * 观察者:之所以使用Vector是为了保证线程安全
     */
    private static Vector<Observer> observers = new Vector<>();
    private String msg;

    /**
     * 添加一个被观察的
     * @param observer
     */
    public void RegisterObserver(Observer observer) {

        observers.add(observer);
    }

    /**
     * 移除一个观察者
     * @param observer
     */
    public void removeObserver(Observer observer) {

        int i = observers.indexOf(observer);
        if (0 <= i) {
            observers.remove(observer);
        }
    }

    /**
     * 通知所有的被观察的
     */
    public void notifyAllObserver() {

        observers.forEach(x -> {
            x.update(msg);
        });
    }

    /**
     * 具体要做的工作
     */
    public abstract void doSomething();

}
