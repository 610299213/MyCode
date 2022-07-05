package Preparation;

import java.math.BigDecimal;

/**
 * @author: 郑伟鹏
 * @mail 610299213@qq.com
 * @description: 责任链-主任
 * @date: 2022/07/05 19:13
 */
public class DirectorHandler implements Handler{


    @Override
    public Boolean process(Request request) {

        if (request.getAmount().compareTo(BigDecimal.valueOf(10000)) > 0) {
           return null;
        }

        return true;
    }
}
