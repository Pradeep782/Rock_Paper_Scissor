class Employee{
  public void tasksDo(){
      System.out.println("Does the tasks given by the teamlead");
  }
}

class Supervisor extends  Employee{
    public  void tasksDo(){
        System.out.println("gives the tasks to the team lead");
    }

}

class Teamlead extends Employee{
    public void tasksDo(){
        System.out.println("Takes the task from supervisor and gives to the employees");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pradeep!");
        Employee e1 = new Teamlead();
        e1.tasksDo();
        e1 = new Supervisor();
        e1.tasksDo();

    }
}