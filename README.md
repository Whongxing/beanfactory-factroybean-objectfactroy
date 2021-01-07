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

## 第三、什么是ObjectBean?
源码详细分析可以看看
