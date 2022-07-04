/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 单例设计模式
 * @date: 2022/07/04 14:17
 */
public class Singleton {


    /**
     * 单例设计模式之饿汉式,有需要才创建
     * 这个使用的双重校验锁 所以是线程安全的
     */

    /**
     * volatile 防止指令重排序
     */
    private volatile static Singleton singletonModel = null;

    public static Singleton getSingletonModel() {

        if ( null == singletonModel){
            synchronized (Singleton.class){
                if (null == singletonModel){
                    singletonModel = new Singleton();
                }
            }
        }
        return singletonModel;
    }

    /**
     * 饿汉式,使用前就创建好。
     * 线程安全,但是浪费内存
     */
    // private static Singleton singletonModel1 = new Singleton();
    //
    // public static Singleton getInstance(){
    //     return singletonModel1;
    // }


    public static void main(String[] args) {

        System.out.println("懒汉式 双重校验锁: " + Singleton.getSingletonModel());
        // System.out.println("饿汉式 使用前就创建好: " + Singleton.getInstance());
    }

}
