package homework.ewmvc.box;

public class Box {
    public String code;
    public int x;
    public int y;
    public int status=0;
    private int password;
    public static Box[][] boxes;
    static {
        boxes = new Box[4][3];
    }
    public Box(int x,int y){
        this.x=x;
        this.y=y;
        code = "code"+x+0+y;
        password=(int)(Math.random()*10000);
    }
    public int getPassword(){
        return this.password;
    }
    public void setPassword(int password){
        this.password=password;
    }

    @Override
    public String toString() {
        return code+"{x:"+x+",y:"+y+",status"+status+",password:"+password+'}';
    }
}
