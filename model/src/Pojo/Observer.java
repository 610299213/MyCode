package Pojo;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 观察者模式的接口, 定义了对象之间的一对多的依赖，这样一来，当一个对象改变时，它的所有的依赖者都会收到通知并自动更新。
 * @date: 2022/07/05 12:53
 */
public interface Observer {


    /**
     * 更新
     * @param msg 更新的消息
     */
    public void update(String msg);
}
