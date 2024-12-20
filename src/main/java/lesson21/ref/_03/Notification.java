package lesson21.ref._03;

public class Notification {

    String msg;

    private Notification() {

    }

    public Notification(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void getMessage(){
        System.out.println(msg);
    }

    public void getMessage(String msg){
        System.out.println(msg);
    }
}
