package homework.ewmvc.model;

import homework.ewmvc.box.Box;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxModel {
    public void addBox(Box box){
        Box.boxes[box.x-1][box.y-1] = box;
    }
    public ArrayList<String> findEmptyBox(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i<Box.boxes.length; i++){
            for (int j = 0; j < Box.boxes[i].length; j++) {
                if ((Box.boxes[i][j]!=null)&&(Box.boxes[i][j].status==0)){
                    list.add(Box.boxes[i][j].code);
                }
            }
        }
        return list;
    }
    public int storeBox(int x,int y){
        if (Box.boxes[x-1][y-1]!=null){
            if (Box.boxes[x-1][y-1].status==0){
                updateBoxStatus(Box.boxes[x-1][y-1]);
                return Box.boxes[x-1][y-1].getPassword();
            }else return Box.boxes[x-1][y-1].status;
        }else return 3;
    }
    public String resetBox(int password){
        for (int i = 0; i < Box.boxes.length; i++) {
            for (int j = 0; j < Box.boxes[i].length; j++) {
                if (Box.boxes[i][j]!=null){
                    if ((password==Box.boxes[i][j].getPassword())&&(Box.boxes[i][j].status==1)){
                        updateBoxStatus(Box.boxes[i][j]);
                        updateBoxPassword(Box.boxes[i][j]);
                        return Box.boxes[i][j].code;
                    }
                }
            }
        }
        return null;
    }
    public static String getBoxList(){
        return Arrays.deepToString(Box.boxes);
    }
    public static void updateBoxStatus(Box box){
        if (box.status==1){
            box.status=0;
        }
        if (box.status==0){
            box.status=1;
        }
    }
    public static void updateBoxPassword(Box box){
        box.setPassword((int)(Math.random()*10000));
    }
}
