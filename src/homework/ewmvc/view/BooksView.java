package homework.ewmvc.view;

import homework.ewmvc.box.Box;

import java.util.Scanner;

import static homework.ewmvc.control.BoxControl.*;

public class BooksView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tep1:
        while(true){
            System.out.println("""
                    1:添加柜子
                    2:查找空柜子
                    3:选择柜子存物 展示四位密码
                    4:输入密码取物 展示柜子 重置密码
                    5:展示所有柜子【需要管理员密码】
                    6:exit
                    """);
            int system = sc.nextInt();
            switch (system){
                case 1:
                    System.out.println("第几行");
                    int x = sc.nextInt();
                    System.out.println("第几列");
                    int y = sc.nextInt();
                    addBox(new Box(x,y));
                    break;
                case 2:
                    findEmptyBox();
                    break;
                case 3:
                    System.out.println("第几行");
                    int m = sc.nextInt();
                    System.out.println("第几列");
                    int n = sc.nextInt();
                    storeBox(m,n);
                    break;
                case 4:
                    System.out.println("请输入密码");
                    int password = sc.nextInt();
                    resetBox(password);
                    break;
                case 5:
                    System.out.println("请输入密码");
                    int pass = sc.nextInt();
                    getBoxList(pass);
                    break;
                case 6:
                    break tep1;
            }
        }
    }
}
