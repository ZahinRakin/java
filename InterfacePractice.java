interface A{
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("In method show.");
    }
    public void config(){
        System.out.println("In method config.");
    }
}

public class InterfacePractice {
    public static void main(String []args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
    }
}
