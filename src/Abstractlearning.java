abstract class Employee1{
    abstract void role();
    public void hours(){
        System.out.println("Employee works for the 8 hours");
    }
}

class Manger1 extends  Employee1{
    public void role(){
        System.out.println("Manager role is to give the tasks to Employees");
    }
    public void hours(){
        System.out.println("Manager works for the 11 hours");
    }
}

public class Abstractlearning {
    public static void main(String[] args) {
        Manger1 m = new Manger1();
        m.role();
        m.hours();
    }
}
