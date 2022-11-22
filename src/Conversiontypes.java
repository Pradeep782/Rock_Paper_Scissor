public class Conversiontypes {
    public static void main(String[] args) {
//        String str = "789";
//        int num = Integer.parseInt(str);
//        System.out.println((num));
        int num = 345;
        String str = Integer.toString(num);
        System.out.println(str);
        System.out.println(str.getClass().getSimpleName());
    }
}
