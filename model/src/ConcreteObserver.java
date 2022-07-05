/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 具体的被观察者
 * @date: 2022/07/05 18:05
 */
public class ConcreteObserver extends BeObservered {


    @Override
    public void doSomething() {

        System.out.println("被观察的事件改变了");
        this.notifyAllObserver();
    }
}
