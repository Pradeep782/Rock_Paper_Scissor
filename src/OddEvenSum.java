public class OddEvenSum {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int sumEven = 0;
        int sumOdd = 0;
        int absDiff = 0;
        while(start <= end){
            if(start%2 == 0){
                sumEven += start;
            }
            else{
                sumOdd += start;
            }
            start++;
        }
        if(sumEven > sumOdd){
            absDiff = sumEven - sumOdd;
        }
        else {
            absDiff = sumOdd - sumEven;
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
        System.out.println(absDiff);
    }
}
