package FactoryBeanTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanMain {
    public static void main(String[] args) {
        System.out.println("程序启动....,准备初始化beanFactory");
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-factory.xml");
        System.out.println("beanFactory启动完成");
        Object user = beanFactory.getBean("&user");
        System.out.println(user.getClass().getName());
        //FactoryBean创建的默认是单例bean
        //Object user1 = beanFactory.getBean("user1");
        //System.out.println(user1.getClass().getName());
        //Object user2 = beanFactory.getBean("user");
        //System.out.println(user2.getClass().getName());
        //Class<?> userFactoryBeanType = beanFactory.getType("&user");
        //Class<?> userType = beanFactory.getType("user");


    }
}
