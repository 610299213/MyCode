package Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 水果接口
 * @date: 2022/07/05 01:23
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fruit {

   /**
    * 水果名称
    */
   private String name;

   /**
    * 水果颜色
    */
   private String color;
}
