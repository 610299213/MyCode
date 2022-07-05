package Pojo;

import Pojo.Observer;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 具体的被观察者2
 * @date: 2022/07/05 18:09
 */
public class ConcreteObserver2 implements Observer {

    @Override
    public void update(String msg) {

        System.out.println("观察者1收到了消息, 开始处理");
    }
}
