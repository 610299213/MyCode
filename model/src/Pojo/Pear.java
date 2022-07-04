package Pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 测试类B
 * @date: 2022/07/04 14:10
 */
@ToString
public class Pear extends Fruit{

    private String name;
    private String color;

    public Pear() {

        this.name = "梨";
        this.color = "黄色";
    }
}
