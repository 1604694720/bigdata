package com.yang.J2SE.testinterface.usb;
/*
* 接口中只有抽象方法 单出的一个标准*/
public interface USB {
    public abstract void supportPower(int power);

//    默认public abstract
    void transfer(String data);
}
