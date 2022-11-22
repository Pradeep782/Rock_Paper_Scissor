import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to see it's revers form");
        String str = sc.nextLine();
        String res = " ";
        for (int i=str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }
        System.out.println(res);
    }
}
