package com.yang.J2SE.testinterface.usb;

public class Computer {
    int display = 1;
    int keyboard = 1;
    int power = 15;

//    传参数为USB接口，只要实现了USB接口就能使用。
    public void insterUSB(USB usb){
        usb.supportPower(power);
        usb.transfer("识别中......");
    }

}
