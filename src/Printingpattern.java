public class Printingpattern {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
           for (int j=0; j<=5; j++){
                 if((i%2) == 0){
                     System.out.print(" ");
                     System.out.print("*");
                 }else{
                     System.out.print("*");
                 }


           }
            System.out.println(" ");
        }
    }
}
