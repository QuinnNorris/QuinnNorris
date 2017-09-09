package com.quinnnorris.ssm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Title: DataFormat
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/9 下午3:01 星期六
 * @author: quinn_norris
 * @version: 1.0
 */
public class DataFormat {

    private static final String normal = "yyyy-MM-dd HH:mm:ss";

    public static String dataToFormat(Date date) throws ParseException {
        return new SimpleDateFormat(normal).format(date);
    }

}
