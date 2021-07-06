package cn.godfery.util;


import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class JavaMailUtil {
  //参考：https://www.cnblogs.com/ysocean/p/7666061.html
    // 发件人 账号和密码
   public static final String MY_EMAIL_ACCOUNT = "china_by@yeah.net";
   public static final String MY_EMAIL_PASSWORD = "SIZLAIRBSTOESJID";// 密码,是你自己的设置的授权码
   // SMTP服务器(这里用的163 SMTP服务器)
   public static final String MEAIL_163_SMTP_HOST = "smtp.yeah.net";
   public static final String SMTP_163_PORT = "25";// 端口号,这个是163使用到的;QQ的应该是465或者875

   public static void main(String[] args) {
       // 收件人
       String receiver = "china_by@yeah.net";
       //标题
       String subject="测试邮件发送";
       //内容
       String content="<h1>miaotianbao@163.com接受邮件成功</h1><a href='http://www.baidu.com'>激活</a>";
       try{
           sendMessage(receiver, subject, content);
       }catch(Exception e){
           throw new RuntimeException("邮件发送失败！"+e);
       }

   }
   //发送邮件方法：参数：接收方、邮箱标题 邮箱内容
   public static void sendMessage(String receiver,String subject,String content)throws Exception {
       //属性集
       Properties p = new Properties();
       p.setProperty("mail.smtp.host", MEAIL_163_SMTP_HOST);
       p.setProperty("mail.smtp.port", SMTP_163_PORT);
       p.setProperty("mail.smtp.socketFactory.port", SMTP_163_PORT);
       p.setProperty("mail.smtp.auth", "true");//是否需要认证
       p.setProperty("mail.smtp.socketFactory.class", "SSL_FACTORY");
       //获取连接
       Session session = Session.getInstance(p, new Authenticator() {
           // 设置认证账户信息
           protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(MY_EMAIL_ACCOUNT, MY_EMAIL_PASSWORD);
           }
       });
       session.setDebug(true);//设置debug测试
       System.out.println("创建邮件");
       MimeMessage message = new MimeMessage(session);
       // 发件人
       message.setFrom(new InternetAddress(MY_EMAIL_ACCOUNT));
       // 收件人和抄送人
       message.setRecipients(Message.RecipientType.TO, receiver);
       // 内容(这个内容还不能乱写,有可能会被SMTP拒绝掉;多试几次吧)
       message.setSubject(subject);
       message.setContent(content, "text/html;charset=UTF-8");
       message.setSentDate(new Date());
       message.saveChanges();//保存设置
       System.out.println("准备发送");
       Transport.send(message);
       System.out.println("发送成功！");
   }
}
