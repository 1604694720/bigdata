package homework;

public class User {
    String name;
    String phone;
    String sid;
    String address;

    public User(String name, String phone, String sid, String address) {
        this.name = name;
        this.phone = phone;
        this.sid = sid;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", sid='" + sid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
