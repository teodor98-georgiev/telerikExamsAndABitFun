import java.util.Scanner;
public class f03_18_24_BalancedNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quantNumbers = sc.nextInt();
        String[] numberSplit = new String[3];
        sc.nextLine();
        int[] numsToSum = new int[quantNumbers];
        int[] number = new int[3];
        for (int i = 0; i < quantNumbers; i++) {
            String numberStr = sc.nextLine();
            numberSplit = numberStr.split("");
            for (int k = 0; k < numberSplit.length; k++) {
                number[k] = Integer.parseInt(numberSplit[k]);
                if (number[0] + number[2] == number[1]) {
                    numsToSum[i] = Integer.parseInt(numberStr);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < numsToSum.length; i++){
            if (numsToSum[i] != 0){
                sum = sum + numsToSum[i];
            }
        }
        System.out.print(sum);
    }
}
