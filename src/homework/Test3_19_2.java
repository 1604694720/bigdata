package homework;

public class Test3_19_2 {
    public static void main(String[] args) {
        String[] name = {"张三","李四","王五","赵六"};
        do {
            int one = (int)(Math.random()*4);
            int twe = (int)(Math.random()*4);
//            抽取的2次名字不重复才输出。
            if (one!=twe){
                System.out.println(name[one]+" "+name[twe]);
                break;
            }
        }while (true);
    }
}
