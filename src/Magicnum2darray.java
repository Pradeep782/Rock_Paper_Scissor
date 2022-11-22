
import java.util.Scanner;
public class Magicnum2darray {
    public static void main(String[] args) {
        int[][]someArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        } ;
        System.out.println("Enter the Guessed number");
        Scanner sc = new Scanner(System.in);
        int magicNumber = sc.nextInt();
//        final int magicNumber = 8;
        boolean found = false;
        for(int row = 0; row< someArray.length; row++ ){
            for(int col =0; col<someArray[row].length; col++){
                if(someArray[row][col] == magicNumber){
                    found = true;
                    break;
                }
            }
        }
        System.out.println("the magic number is "+ (found? "found": "Not found"));
    }
}
