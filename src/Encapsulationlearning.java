class Student{
   private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public  void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return  age;
    }
}


public class Encapsulationlearning {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Pradeep Reddy");
        s.setAge(20);
        System.out.println("My name is "+ s.getName()+" and My age is "+ s.getAge());
    }
}
