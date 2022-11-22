public class Binaryvalid {
    public static void main(String[] args) {
        String str = "2342";
        boolean valid = true;
        for (int i = 0; i<str.length(); i++){
            if(!(str.charAt(i)== 0 || str.charAt(i) == 1)){
                valid = false;
                break;
            }
        }
        System.out.println("The entered value is "+(valid? "valid": "Not a valid number"));

    }
}
