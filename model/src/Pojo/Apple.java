package Pojo;

import lombok.ToString;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 测试类A
 * @date: 2022/07/04 14:10
 */
@ToString
public class Apple extends Fruit{

    private String name;
    private String color;

    public Apple() {

        this.name = "苹果";
        this.color = "红色";
    }
}
