# beanfactory-factroybean-objectfactroy
了解什么是BeanFactory、FactorhyBean、ObjectFactory的练习Demo

# 结论性的理解一下
## 第一、什么是BeanFactory?
BeanFactory是Spring利于工厂模式设计的一个管理SpringBean的一个工厂接口（哇，这句话我写的太有水平了），一般我们最最最常见的使用肯定是
```
 BeanFactory  beanFactory = new ClassPathXmalApplicationContext("此处配置xml");
```
怎么管理呢，其中beanFactory提供了一系列的api，方便我们去管理SpringBean, 简单来说四个东西
- 一、 一个属性 String FACTORY_BEAN_PREFIX = "&"; ,主要用在获取一个Bean的时候判断该类是否获取到的是一个FactoryBean还是说获取到的是由Factorybean创建出来的一个类
- 二、 getBean()——获取bean\getBeanProvider()——延时加载一个bean
- 三、 获取Bean的特性,例如：BeanFactory中是否包含某个给定名称或者别名的类、BeanFactory中某个类是否是单例的、是否是给定类型
- 四、 获取一个类的类型-getType
总的可以理解为BeanFactory是一个最基本的容器，Spring依赖注入功能是使用BeanFactory接口及其子接口实现的。

## 第二、什么是FactoryBean?
FactoryBean，名字就可以看出来，它是一个Bean，更直白的说，它就是一个<bean></bean>标签中的SpringBean,只不过这个bean继承了FactoryBean/或实现了其子类smartFoctoryBean接口
FactoryBean的接口有3个方法，1个属性
- getObject()方法  获取Bean
- getObjectType()方法   获取Bean类型
- isSingleton()方法  判断是否单例
- 属性  和BeanFactory中“&”类似，都有一个属性，可以一起记忆，String OBJECT_TYPE_ATTRIBUTE = "factoryBeanObjectType";
##### 其子接口smartBeanFactory对其进行了扩展,  新增
- isPrototype()  FactoryBean管理的对象是否为prototype（原型）
- isEagerInit()方法   如果为true的话，Spring容器会在初始化的时候加载该类
## 第三、什么是ObjectBean?
ObjectFactory是一个工厂，在调用时可以返回对象的一个实例，Spring懒加载的时候可以通过ObjectFactory实现
源码详细分析可以参考看看
https://www.yuque.com/docs/share/b983942b-428a-4d8e-99b8-2d3b003293ad?#（密码：if1g） 《BeanFactory、FactoryBean、ObjectFactory》
