import java.util.Scanner;

public class soccerMJ_2 {
    public static void main(String[] args){

        // The input section lists the number of teams followed by each team's name and their respective goals scored
        // and conceded in a match.
        // The output section shows the team with the highest goal difference, which is the number of goals scored
        // minus the number of goals conceded.
        // If there is a tie in goal difference, the team that scored more goals is given priority.

        Scanner sc = new Scanner(System.in);
        int numberCountries = sc.nextInt();
        sc.nextLine();
        String[] inputItems = new String[3];
        int[] goalsDiffs = new int[numberCountries];
        String[] countryNames = new String [numberCountries];
        int[] goalsScored = new int[numberCountries];
        int[] goalsConceded = new int[numberCountries];

        // TODO 1 DONE - remove non-used variables - 5 min
        // TODO 2 DONE- rename non-explanatory variables - 4 min
        // TODO 3 - find diff MAX as a temp winner - 10 min
        // TODO 4 - check all other diff - are they diff-MAX? If they are max - who has score-MAX?
        // score max becomes new temp winner
        // print output

        // ording numbers and countryNames in arrays;
        for (int i = 0; i < numberCountries; i++) {
            inputItems = sc.nextLine().split(" ");
            countryNames[i] = inputItems[0];
            goalsScored[i] = Integer.parseInt(inputItems[1]);
            goalsConceded[i] = Integer.parseInt(inputItems[2]);
            goalsDiffs[i] = goalsScored[i] - goalsConceded[i];
        }
        // finding out the maximal value of difference and if there is a duplicate of this difference

        /*int maxDiffIdx = 0;
        for (int i = 0; i < goalsDiffs.length; i++) {
            if (goalsDiffs[i] >= goalsDiffs[maxDiffIdx]) {
                maxDiffIdx = i;
            }
        }*/
        // TODO declare = maxIdxFinal
        // TODO declare = maxIdxFinalCurrScoredGoals
        // TODO new FOR = until maxDiffIdx
        // TODO .... ?
        // TODO find maxIdxFinal

        int maxDifference = Integer.MIN_VALUE;
        int maxNumTrack = 0;
        for (int i = 0; i < goalsDiffs.length; i++){
            if (goalsDiffs[i] > maxDifference){
                maxDifference = goalsDiffs[i];
                maxNumTrack = i;
            }
        }
        boolean diffDuplicate = false;
        for (int i = 0; i < goalsDiffs.length; i++){
            for (int k = i + 1; k < goalsDiffs.length; k++){
                if (goalsDiffs[i] == goalsDiffs[k]){
                    if (maxDifference == goalsDiffs[i]){
                        diffDuplicate = true;
                        break;
                    }
                }
            }
            if (diffDuplicate){
                break;
            }
        }
        if (diffDuplicate){
            int maxGoal = 0;
            int maxGoalIndex = -1;
            for (int i = 0; i < goalsScored.length; i++){
                if (goalsScored[i] > maxGoal){
                    maxGoal = goalsScored[i];
                    maxGoalIndex++;
                }
            }
            System.out.print(countryNames[maxGoalIndex] + " " + maxGoal + " " + goalsConceded[maxGoalIndex]);
        }
        if (!diffDuplicate){
            System.out.print(countryNames[maxNumTrack] + " " + goalsScored[maxNumTrack] + " " + goalsConceded[maxNumTrack]);
        }
    }
}
