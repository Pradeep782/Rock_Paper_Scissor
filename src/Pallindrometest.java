import java.io.*;
import java.util.*;


public class Pallindrometest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char ch;
        String nstr = "";
        for(int i=0; i<A.length(); i++){
            ch = A.charAt(i);
            nstr = ch+nstr;
        }
        boolean b = A.equals(nstr);
        if(b == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
