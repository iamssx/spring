package com.ssx;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by iamssx on 2016/12/8.
 */
@Configuration
public class MyBeanConfiguration {

    @Bean
    @Scope("prototype")
    public MyBean mybean(MyBeanFactory myBeanFactory) {
        return new MyBean(myBeanFactory);
    }

    @Bean
    public MyBeanFactory myBeanFactory() {
        return new MyBeanFactory();
    }
}
