import java.util.Scanner;
public class f03_18_24_MaxNumPosition {
    public static void main(String[] args){
        // from a given array take the position of the maximal number
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++){
            numbers[i] = sc.nextInt();
        }
        int maxValue = Integer.MIN_VALUE;
        int position = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxValue){
                maxValue = numbers[i];
                position = i;
            }
        }
        System.out.print("max is " + maxValue + " and position is " + position);
    }
}
