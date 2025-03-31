package com.yang.J2SE.testinterface.car;

public class Test01 {

    public static void main(String[] args) {
        BYBus bus=new BYBus();
        Worker worker = new Worker();
        worker.worker(bus);
    }
}
