package com.ssx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by iamssx on 2016/12/6.
 */
@Component
//@Scope("prototype")
public class MyComponet {

    //spEl获取其他组件的方法返回值
    @Value("#{myComponent2.hashCode()}")
    private int mhashcode;

    //如果那个属性没有共有的getter，就只能直接获取public权限的属性
    @Value("#{myComponent2.name}")
    private String name;

    //获取类的静态变量和方法，以及运算
    @Value("#{T(java.lang.Math).random() + T(java.lang.Math).PI}")
    private double rand;

    public double getRand() {
        return rand;
    }

    public void setRand(double rand) {
        this.rand = rand;
    }

    @Autowired
    private MyComponent2 myComponent2;

    @Inject //与Autowire不同的是没有require，所以一定要存在
    @Named("myComponent2")
    private MyComponent2 myComponent22;

    //获取集合类
    @Value("#{myCompoets}")
    private List<MyComponet> myCompoets;



    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    //public String name = "compo" + atomicInteger.getAndIncrement();

    public void print() {
        System.out.println(toString());
        myComponent2.print();
    }

    @Override
    public String toString() {
        return "MyComponet{" +
                "mhashcode=" + mhashcode +
                ", name='" + name + '\'' +
                ", rand=" + rand +
                ", myComponent2=" + myComponent2 + ",myComponent22=" + myComponent22.getName() +
                ", myCompoets=" + myCompoets.get(0).getName()
                + " " + myCompoets.get(2).getName()
                +'}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
