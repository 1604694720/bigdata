public class List {
    List head = null;
    String data=null;
    List next = null;
    static List index = null;
    public void adddata(String str){
        List list = new List();
        if(index==null){
            this.data = str;
            this.next=list;
            list.head=index;
            index = list;
        }else{
            index.data = str;
            index.next=list;
            list.head=index;
            index = list;
        }
    }

    @Override
    public String toString() {
        if (this.next!=null){
            return "List{" +
                    "data='" + data + '\'' +
                    "}"+ this.next.toString();
        }else {
            return "List{" +
                    "data='" + data + '\'' +
                    "}";
        }
    }
}
