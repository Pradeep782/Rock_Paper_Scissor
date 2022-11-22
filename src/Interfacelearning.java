


interface  Animal{
    void madeSound();
    void sleep();
    private void moveTo(){
        System.out.println("Animals will move as soon than humans");
    }
    default  void say(){
        moveTo();
    }
}

interface Human extends Animal{
    private void think(){
        System.out.println("humans have the capacity to think");
    }

}

class Pig implements  Animal{
    public  void madeSound(){
        System.out.println("Pig says hmm hmm");
    }
    public  void sleep(){
        System.out.println("Pig sleeps for 15 hours");
    }
//    public void think(){
//        System.out.println("Human thinks better than the animals");
//    }



}






public class Interfacelearning {
    public static void main(String[] args) {


        Pig mypig = new Pig();
        mypig.madeSound();
        mypig.sleep();

        Animal a = new Pig();
        a.say();

    }
}
