package com.example.ssm.rental.common.util;

import io.github.biezhi.ome.OhMyEmail;

import javax.mail.MessagingException;
import java.util.Properties;

/**
 * 发送邮件工具类
 *
 * @author 言曌
 * @date 2021/3/15 9:57 上午
 */

public class MailUtil {

    /**
     * 配置邮件
     *
     * @param smtpHost smtpHost
     * @param userName 邮件地址
     * @param password password
     */
    public static void configMail(String smtpHost, String userName, String password) {
        Properties properties = OhMyEmail.defaultConfig(false);
        properties.setProperty("mail.smtp.host", smtpHost);
        OhMyEmail.config(properties, userName, password);
    }


    private static final String host = "smtp.qq.com";

    private static final String fromName = "verio";

    // 代理邮箱账号
    private static final String username = "847064370@qq.com";

    // 授权码
    private static final String password = "iddfhbnnfpxwbcjc";


    /**
     * 发送邮件
     *
     * @param to      to 接收者
     * @param title   subject 标题
     * @param content content 内容
     */
    public static void sendMail(String to, String title, String content) throws MessagingException {
        //配置邮件服务器
        configMail(host, username, password);
        OhMyEmail.subject(title)
                .from(fromName)
                .to(to)
                .html(content)
                .send();
    }
}
