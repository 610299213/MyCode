import Utils.ObjectA;
import Utils.ObjectB;

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

        if (objectName == "ObjectA") {
            return new ObjectA();
        }

        if (objectName == "ObjectB") {
            return new ObjectB();
        }

        // if not catch the object name
        return null;
    }

    public static void main(String[] args) {

        String objName = "ObjectA";
        ObjectA objectA = (ObjectA) SimpleFactoryModel.getObject(objName);
        System.out.println(objectA);
    }
}
