package com.ssx;

import java.util.Random;

/**
 * Created by iamssx on 2016/12/8.
 */
public class MyBeanFactory {

    private final static Random rand = new Random();

    public int rand() {
        return rand.nextInt();
    }
}
