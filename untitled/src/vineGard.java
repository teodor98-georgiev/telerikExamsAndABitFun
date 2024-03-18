import java.util.Scanner;
public class vineGard {
    public static void main (String[] args){
        // copied in tel IDE
        Scanner sc = new Scanner(System.in);
        int nColleagues = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        String vineRep = sc.nextLine();
        sc.close();
        int perfectGr = 0;
        int avrG = 0;
        for (char vine : vineRep.toCharArray()) {
            if (vine == 'X'){
                perfectGr += 7;
            }
            else if (vine == 'X'){
                avrG += 7;
            }
        }
        int wineB = perfectGr;
        int rakiaB = avrG / 5;
        int needWineB = (nColleagues * 2)/5;
        double checkNumb = (nColleagues * 2) % 5;
        if (checkNumb > 0) {
            needWineB++;
        }
        int needRakiaB = nColleagues/14;
        if ((nColleagues % 14) > 0) {
            needRakiaB++;
        }
        if ((wineB >= needWineB) && (rakiaB >= needRakiaB)){
            int wineSuperfluos = wineB - needWineB;
            int rakiaSuperfluos = rakiaB - needRakiaB;
            System.out.println("Yes " + wineSuperfluos + "bottles of wine and " + rakiaSuperfluos + " bottles of rakia remaining");
        }
        else {
            int wineMissing = needWineB - wineB;
            if (wineMissing < 0){
                wineMissing = 0;
            }
            int rakiaMissing = needRakiaB - rakiaB;
            if (rakiaMissing < 0) {
                rakiaMissing = 0;
            }
            System.out.println("No " + wineMissing + "more bottles of wine and " + rakiaMissing + "more bottles of rakia required");
        }
    }
}
