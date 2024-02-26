package com.itheima_14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*工具类
 * 构造方法私有
 * 成员方法静态
 * */
public class DateUtils {
    private DateUtils(){};

    public static String datetoString(Date date,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    public static Date Stringtodate(String s,String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(s);
    }

}
