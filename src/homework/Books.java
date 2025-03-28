package homework;

public class Books {
    String id;
    String name;
    int  money;
    String out;

    public Books(String id, String name, int money, String out) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.out = out;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", out='" + out + '\'' +
                '}';
    }
}
