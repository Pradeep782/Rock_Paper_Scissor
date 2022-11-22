class Employee321{
    Employee321(){
        System.out.println("I am a trusted employee of this company");
    }
}


public class Instanceof {
    public static void main(String[] args) {
        Employee321 c1= new Employee321();
        System.out.println(c1 instanceof Employee321);
        if(c1 instanceof  Employee321){
            System.out.println("Really it is proved by the company also");
        }
    }
}
