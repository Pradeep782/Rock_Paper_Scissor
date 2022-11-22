
interface Animal1{
    void sound();
}

interface Human1{
    void sleep();
}

class Action implements Animal1, Human1{
    @Override
    public void sound() {
        System.out.println("Animal sounds zzz");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps for 7-8 hours");
    }
}



public class Multipleinheritanceininterface {
    public static void main(String[] args) {
        Action a = new Action();
        a.sleep();
        a.sound();
    }
}
