package com.ssx;

/**
 * Created by iamssx on 2016/12/8.
 */
public class MyBean {

    private static int count;
    private int id;
    private int randId;

    public MyBean(MyBeanFactory myBeanFactory) {
        this.id = count++;
        this.randId = myBeanFactory.rand();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "id=" + id +
                ", randId=" + randId +
                '}';
    }
}
