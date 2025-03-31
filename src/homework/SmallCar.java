package homework;

public class SmallCar {
    boolean isRun = false;
    int speed = 0;
    public void start(){
        if (!isRun){
            isRun=true;
            System.out.println("已启动");
        }
    }
    public void addSpeed(){
        if (isRun){
            speed+=10;
            System.out.println("速度已到"+speed);
        }else System.out.println("请先启动赛车");
    }
}
