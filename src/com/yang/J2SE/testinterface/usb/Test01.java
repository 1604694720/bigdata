package com.yang.J2SE.testinterface.usb;

public class Test01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        UDisk uDisk = new UDisk();
        computer.insterUSB(uDisk);
    }
}
