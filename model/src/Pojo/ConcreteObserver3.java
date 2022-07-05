package Pojo;

import Pojo.Observer;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 具体被观察者3
 * @date: 2022/07/05 18:11
 */
public class ConcreteObserver3 implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("观察者2收到了消息开始进行改变");
    }
}
