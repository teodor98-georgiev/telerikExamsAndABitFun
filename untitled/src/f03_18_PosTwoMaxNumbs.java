import java.util.Scanner;

public class f03_18_PosTwoMaxNumbs {
    public static void main(String[] args){
        // from a given array identify 1st and 2nd maximal number and its position respectively
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int pos1 = 0;
        int max2 = Integer.MIN_VALUE;
        int pos2 = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max1){
                max1 = numbers[i];
                pos1 = i;

            }
        }
        // why in the 1st for if doesn't work ??
        for (int i = 0; i < numbers.length; i++){
            if ((numbers[i] < max1) && (numbers[i] > max2)){
                max2 = numbers[i];
                pos2 = i;
            }
        }
        System.out.printf("two max numbers are %d %d at position %d %d respectively", max1,max2,pos1,pos2);
    }
}
