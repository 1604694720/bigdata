package com.yang.J2SE.operation;

public class TestBit02 {
    public static void main(String[] args) {
//        用户管理1000 财务管理0100 人事管理0010 行政管理
        int a=15;
        if((a&8)==8){
            System.out.println("用户管理1000");
        }
        if((a&4)==4){
            System.out.println("财务管理0100");
        }
        if((a&2)==2){
            System.out.println("用户管理0010");
        }
        if((a&1)==1){
            System.out.println("用户管理0001");
        }
    }
}
