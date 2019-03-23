package cn.z201.io.api;

/**
 *
 * @author z201.coding@gmail.com
 */
public interface DefaultEmailServiceI {

    /**
     * 发送邮件
     * @param to
     * @param subject
     */
    void sendSimpleMail(String to, String subject);
}
