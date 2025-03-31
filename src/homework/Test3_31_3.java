package homework;

import java.util.ArrayList;

public class Test3_31_3 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("AAA","13532398911","430621389299991028","湖南"));
        list.add(new User("BBB","13632398911","430621389299991028","广东"));
        list.add(new User("CCC","13532398911","430622389299991028","北京"));
        list.add(new User("EEE","13832398911","430622389299991028","湖南"));
        list.add(new User("FFF","13032398911","430624389299991028","广东"));
        list.add(new User("GGG","13532398911","430623389299991028","北京"));
        System.out.println(getUser(list, (user) -> user.sid.startsWith("430621")));
        System.out.println(getUser(list, (user) -> user.phone.startsWith("135")));
        System.out.println(getUser(list, (user) -> user.address.contains("湖南")));
    }
    public static ArrayList<User> getUser(ArrayList<User> list, RandomUser randomUser){
        ArrayList<User> userlist = new ArrayList<>();
        for(User user:list){
            if (randomUser.get(user)){
                userlist.add(user);
            }
        }return userlist;
    }
}
