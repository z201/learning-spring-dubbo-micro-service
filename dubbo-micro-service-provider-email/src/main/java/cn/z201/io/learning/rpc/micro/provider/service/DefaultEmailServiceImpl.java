package cn.z201.io.learning.rpc.micro.provider.service;

import cn.z201.io.api.DefaultEmailServiceI;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


/**
 * @author z201.coding@gmail.com
 **/
@Service(version = "1.0.0",group = "email")
@Slf4j
public class DefaultEmailServiceImpl implements DefaultEmailServiceI {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private TemplateEngine templateEngine;

    @Value("${mail.from-mail-addr}")
    private String from;

    @Override
    public void sendSimpleMail(String to, String subject) {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "1");
        String emailContent = templateEngine.process("emailTemplate", context);
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(emailContent, true);
            mailSender.send(message);
            log.info("html邮件发送成功");
        } catch (MessagingException e) {
            log.error("发送html邮件时发生异常！", e);
        }
    }
}
