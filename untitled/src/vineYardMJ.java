import java.util.Scanner;
public class vineYardMJ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int colleagues = sc.nextInt();
        int lengthVineYard = sc.nextInt();
        sc.nextLine();
        String[] vineQuality = sc.nextLine().split("");
        // the game starts
        char[] vineQ = new char [vineQuality.length];
        // sorting quality of vine
        int indexPerfect = 0;
        int indexAverage = 0;
        // input data
        int mlWine = 300;
        int mlRakia = 50;
        int bottleWine = 750;
        int bottleRakia = 700;
        // how many bottles I require for n colleagues.
        int reqBottWine = (mlWine * colleagues)/bottleWine;
        int reqBottRakia = (mlRakia * colleagues)/bottleRakia;
        // how many I really have
        for (int q = 0; q < vineQuality.length; q++){
            vineQ[q] = vineQuality[q].charAt(0);
            if (vineQ[q] == 'X'){
                indexPerfect++;
            }
            else if (vineQ[q] == 'x'){
                indexAverage++;
            }
        }
        int XKg = 7;
        int outWineKg = indexPerfect * XKg;
        int outMlWine = outWineKg * bottleWine;
        int bottlesWineOut = outMlWine/bottleWine;

        int xKg  = 7;
        int outRakiaKg = indexAverage * xKg;
        int outMlRakia = (outRakiaKg * bottleRakia)/5;
        int bottlesRakiaOut = outMlRakia/bottleRakia;
        // verdict for next party
        int DifferenceWine = bottlesWineOut - reqBottWine;
        int DifferenceRakia = bottlesRakiaOut - reqBottRakia;
        if (indexPerfect != 0 && indexAverage != 0){
            if (DifferenceWine > 0 && DifferenceRakia > 0){
                System.out.print("Yes! " + DifferenceWine +  " bottles of wine and " + DifferenceRakia + " bottles of rakia remaining for the next party!");
            }
            else if (DifferenceWine < 0 || DifferenceRakia > 0){
                System.out.print("No! " + -DifferenceWine + " more bottles of wine and " + (DifferenceRakia) + " more bottles of rakia required!");
            }
            else if (DifferenceWine > 0 || DifferenceRakia < 0){
                System.out.print("No! " + (DifferenceWine) + " more bottles of wine and " + -DifferenceRakia + " more bottles of rakia required!");
            }
        }
        else {
            System.out.print("I'm sorry guys, no party at the horizont");
        }
    }
}
