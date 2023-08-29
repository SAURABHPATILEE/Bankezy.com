////package com.bankezy.config;
////
////import org.springframework.context.annotation.Bean;
////import org.springframework.mail.javamail.JavaMailSenderImpl;
////
////import java.util.Properties;
////
////public class MailConfig {
////
////    @Bean
////    public static JavaMailSenderImpl getMailConfig(){
////        JavaMailSenderImpl emailConfig = new JavaMailSenderImpl();
////
////        // Set Properties:
////        Properties props = emailConfig.getJavaMailProperties();
////        props.put("mail.transport.protocol", "smtp");
////        props.put("mail.smtp.auth", "true");
////        props.put("mail.smtp.starttls.enable", "true");
////        props.put("mail.debug", "true");
////
////        // Set Mail Credentials:
////        emailConfig.setHost("localhost");
////        emailConfig.setPort(25);
////        emailConfig.setUsername("no-reply@somecompany.com");
////        emailConfig.setPassword("password123");
////
////        return emailConfig;
////    }
////    // End Of Email Config Method.
////}
//
//
//
//
//package com.bankezy.config;
//
//        import org.springframework.context.annotation.Bean;
//        import org.springframework.context.annotation.Configuration;
//        import org.springframework.mail.javamail.JavaMailSenderImpl;
//
//        import java.util.Properties;
////@Configuration
//public class MailConfig {
//
//    @Bean
//    public static JavaMailSenderImpl getMailConfig(){
//        JavaMailSenderImpl emailConfig = new JavaMailSenderImpl();
//
//        // Set Properties:
//        Properties props = emailConfig.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        //props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.ssl.enable","true");
//        props.put("mail.debug", "true");
//
//        // Set Mail Credentials:
//        emailConfig.setHost("smtp.gmail.com");
//        emailConfig.setPort(587);
//        emailConfig.setProtocol("smtps");
//        emailConfig.setUsername("psaurabhp877@gmail.com");
//        emailConfig.setPassword("SaurabhPatil@4321");
//
//        return emailConfig;
//    }
//    // End Of Email Config Method.
//}
//
