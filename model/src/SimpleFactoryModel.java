import Pojo.Apple;
import Pojo.Pear;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 简单工厂模式
 * @date: 2022/07/04 11:35
 */
public class SimpleFactoryModel {

    /**
     * 创建对象的名称
     */
    private String ObjectName;

    public static Object getObject(String objectName){

        if (objectName.equals("Apple")) {
            return new Apple();
        }

        if (objectName.equals("Pear")) {
            return new Pear();
        }

        // if not catch the object name
        return null;
    }

    public static void main(String[] args) {

        String objName = "Apple";
        Apple apple = (Apple) SimpleFactoryModel.getObject(objName);
        System.out.println("通过工厂模式创建了" + objName + "类 : " + apple);
        objName = "Pear";
        Pear pear = (Pear) SimpleFactoryModel.getObject(objName);
        System.out.println("通过工厂模式创建了" + objName + "类 : " + pear);
    }
}
