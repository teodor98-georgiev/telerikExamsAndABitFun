import java.util.Scanner;
public class f03_18_24_TwoMaxNumbers {
    public static void main(String[] args){
        // identify from a given array the first and 2nd maximal number
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max1){
                max1 = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++){
            if ((numbers[i] < max1) && (numbers[i] > max2)){
                max2 = numbers[i];
            }
        }
        System.out.print("two max numbers are " + max1 + " " + max2);
    }
}
