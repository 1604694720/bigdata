package homework;

import java.util.Stack;

public class Test3_27_7 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("王生安");
        stack.push("李鑫灏");
        stack.push("薛佛世");
        stack.push("蔡壮保");
        stack.push("钱勤堃");
        stack.push("潘恩依");
        stack.push("陈国柏");
        stack.push("魏皑虎");
        stack.push("周卓浩");
        stack.push("汤辟邦");
        System.out.println(stack.peek());
        System.out.println(stack.size());
        while(stack.size()!=1){
            stack.pop();
        }
        System.out.println(stack.peek());
    }
}
