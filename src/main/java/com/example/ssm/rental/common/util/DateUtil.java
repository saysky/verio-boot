package com.example.ssm.rental.common.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 *
 * @author 言曌
 * @date 2021/3/13 4:15 下午
 */

public class DateUtil {
    /**
     * 获取startDate日期后month月的日期
     *
     * @param startDate 开始日期
     * @param month     几个月后
     * @return
     */
    public static Date getMonthDate(Date startDate, int month) {
        LocalDateTime localDateTime = startDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime().plusMonths(month);
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        return date;
    }

    /**
     * 计算两个日期之间相差的天数
     */
    public static int daysBetween(Date sendDate, Date startDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sendDate = sdf.parse(sdf.format(sendDate));
            startDate = sdf.parse(sdf.format(startDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(sendDate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(startDate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }

}
