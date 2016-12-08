package com.ssx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by iamssx on 2016/12/6.
 */
@Component
public class MyComponent2  {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("wang")
    private String name;

    @Value("test")
    private String test;

    @Value("#{myComponet.rand}") //只有public的getter方法，才可以直接使用这种spel获取，不限注解和xml
    private double rand;

//    获取集合元素, 使用.?[] .^[] .$[] .![]
    @Value("#{myCompoets[3]}")
    private MyComponet myComponet;

    public void print() {
        System.out.println("jjjkjk" + myComponet.getName());
        System.out.println(rand);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
