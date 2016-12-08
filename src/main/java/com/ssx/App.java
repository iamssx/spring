package com.ssx;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Hello world!
 */
//@Component
public class App implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyComponet bean = applicationContext.getBean(MyComponet.class);
        bean.print();

        MyComponent2 bean1 = applicationContext.getBean(MyComponent2.class);
        bean1.print();

        MyBean bean2 = applicationContext.getBean(MyBean.class);
        System.out.println(bean2);
        bean2 = applicationContext.getBean(MyBean.class);
        System.out.println(bean2);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

