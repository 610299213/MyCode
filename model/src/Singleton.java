/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 单例设计模式
 * @date: 2022/07/04 14:17
 */
public class Singleton {

    /**
     * 这是一个单例模式
     */
    private volatile static Singleton singletonModel = null;

    private static Singleton getSingletonModel() {

        if ( null == singletonModel){
            synchronized (Singleton.class){
                if (null == singletonModel){
                    singletonModel = new Singleton();
                }
            }
        }
        return singletonModel;
    }

    public static void main(String[] args) {

        Singleton singletonModel = Singleton.getSingletonModel();
        System.out.println(singletonModel);
    }

}
