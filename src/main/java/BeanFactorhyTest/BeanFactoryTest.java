package BeanFactorhyTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryTest {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("");
    }
}
