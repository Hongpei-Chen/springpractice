package org.jeff.chen.sc.xmldemo;

/**
 * @author jeff
 * <p>Date 2018/4/27 15:54</p>
 */
public class BeanComponet {

    private BeanOne beanOne;

    private int i;

    public void setBeanOne(BeanOne beanOne) {
        this.beanOne = beanOne;
    }

    public void setIntegerI(int i) {
        this.i = i;
    }

    public int getI(){
        return i;
    }
}
