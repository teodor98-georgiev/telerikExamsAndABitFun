import java.util.Scanner;
public class f03_18_24_maxNumUncle {
    // from a given array take the maximal number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++){
            numbers[i] = sc.nextInt();
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        System.out.print(maxValue);
    }
}
