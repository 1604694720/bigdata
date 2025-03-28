package com.yang.J2SE.jcf.collection.list;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class TestAarryBlockQueue01 {
    public static void main(String[] args) throws InterruptedException {
//        创建队列，需要定义长度。
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
//        添加
        queue.add("李湘东");
        queue.add("是");
        queue.add("傻逼！");
//        超出报异常
//        queue.add("大煞笔");
//        取 如果没了就等待
        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());

//        等待5秒，超时返回null
        System.out.println(queue.poll(5, TimeUnit.SECONDS));
    }
}
