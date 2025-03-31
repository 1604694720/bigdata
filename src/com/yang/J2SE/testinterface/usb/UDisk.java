package com.yang.J2SE.testinterface.usb;

/*
* 实现类
* 必须实现接口中所有的抽象方法
* 可以实现多个接口*/
public class UDisk implements USB {
    @Override
    public void supportPower(int power) {
        System.out.println("供电成功："+power);
    }

    @Override
    public void transfer(String data) {
        System.out.println("正在传输="+data);
    }
}
