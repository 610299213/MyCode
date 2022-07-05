package Pojo;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 静态工厂,这个最常见经常使用的Utils就是
 * @date: 2022/07/05 11:19
 */
public class StaticFactory {

    /**
     * 控制台回响, word | 静态方法
     * @param word
     */
    public static void echo(String word){

        System.out.println(word);
    }

    /**
     * 静态方法2,打印 Hello World!
     */
    public static void print(){

        System.out.println("Hello World!");
    }

    public static void main(String[] args) {

        StaticFactory.echo("Love and Peace");
        StaticFactory.print();
    }
}
