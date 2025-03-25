package homework;

public class Test3_24_3 {
    public static void main(String[] args) {
        Week week = Week.FRIDAY;
        switch (week) {
            case SUNDAY:
                System.out.println("今天好心情。");
                break;
            default:
                System.out.println("今天坏心情。");
        }
    }
}
