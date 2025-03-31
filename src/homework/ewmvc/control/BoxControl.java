package homework.ewmvc.control;

import homework.ewmvc.box.Box;
import homework.ewmvc.model.BoxModel;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxControl {
    static BoxModel boxModel = new BoxModel();
    private static int root = 6666;
    public static void addBox(Box box){
        boxModel.addBox(box);
    }
    public static void findEmptyBox(){
        ArrayList<String> list = boxModel.findEmptyBox();
        list.forEach(System.out::println);
    }
    public static void storeBox(int x,int y){
        int status = boxModel.storeBox(x,y);
        if (status==3){
            System.out.println("不存在该柜子");
        }else System.out.println(status);
    }
    public static void resetBox(int password){
        String code = boxModel.resetBox(password);
        if (code==null){
            System.out.println("密码错误");
            return;
        }
        System.out.println("柜子"+code+"已取出");
    }
    public static void getBoxList(int pass){
        if (root ==pass ){
            System.out.println(BoxModel.getBoxList());
        }else System.out.println("root密码错误！");
    }
}
