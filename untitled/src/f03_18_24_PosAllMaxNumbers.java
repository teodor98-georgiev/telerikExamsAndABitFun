import java.util.Scanner;

public class f03_18_24_PosAllMaxNumbers {
    public static void main(String[] args){
        // from a given array identify duplicates of a maximal number and its positions
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++){
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int[] positions = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] >= max){
                max = numbers[i];
                positions[i] = i;
            }
        }
        System.out.print("positions of max number is");
        for (int i = 0; i < positions.length; i++){
            if (positions[i] != 0){
                System.out.println(positions[i]);
            }
        }
    }
}
