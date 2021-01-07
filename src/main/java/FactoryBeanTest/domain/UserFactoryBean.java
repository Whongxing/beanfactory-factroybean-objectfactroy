package FactoryBeanTest.domain;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.SmartFactoryBean;

public class UserFactoryBean implements SmartFactoryBean<User> {
    public User getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }

    public boolean isSingleton() {
        return true;
    }

    public boolean isPrototype() {
        return false;
    }

    //是否再容器初始化的时候对FactoryBean管理的对象进行初始化
    public boolean isEagerInit() {
        return true;
    }
}
