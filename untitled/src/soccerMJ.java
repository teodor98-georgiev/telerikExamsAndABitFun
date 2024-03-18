import java.util.Scanner;
public class soccerMJ {
    public static void main(String[] args){
        // given some countries Bulgaria 5 4; Belgium 3 8 ecc the number on the left is maximal Goals, on right the autogoals
        // find the winner if:
        // there are same values of the difference between them take the maximal goal of country
        // if there are no same values take the team with maximal goal

        // WORKS, but, according to text the program is quite buggy because if there is a maximal difference,
        //  some equal differences and some equal maximal goals, program will print the team from duplicate difference
        //  and with maximal goal (which is tracked) instead of team with maximal difference

        // The input section lists the number of teams followed by each team's name and their respective goals scored and conceded in a match.
        // The output section shows the team with the highest goal difference, which is the number of goals scored minus the number of goals conceded.
        // If there is a tie in goal difference, the team that scored more goals is given priority.

        Scanner sc = new Scanner(System.in);
        int numberCountries = sc.nextInt();
        sc.nextLine();
        String countryScore = "";
        String[] countryScoreSplit = new String[3];
        int[] accDiffs = new int[numberCountries];
        int Goals = 0;
        int autoGoal = 0;
        int difference = 0;
        String[] countries = new String [numberCountries];
        int[] maxGoals = new int[numberCountries];
        int[] autoGoals = new int[numberCountries];

        // ording numbers and countries in arrays;
        for (int e = 0; e < numberCountries; e++) {
            countryScore = sc.nextLine();
            countryScoreSplit = countryScore.split(" ");
            countries[e] = countryScoreSplit[0];
            Goals = Integer.parseInt(countryScoreSplit[1]);
            autoGoal = Integer.parseInt(countryScoreSplit[2]);
            difference = Goals - autoGoal;
            accDiffs[e] = difference;
            maxGoals[e] = Goals;
            autoGoals[e] = autoGoal;
        }

        // finding out if there are duplicates in difference
        boolean IsDuplicate = false;
        for (int up = 0; up < accDiffs.length; up++){
            for (int down = up + 1; down < accDiffs.length; down++){
                if (accDiffs[up] == accDiffs[down]){
                    IsDuplicate = true;
                    break;
                }
            }
            if (IsDuplicate){
                break;
            }
        }

        int MaxNumGoals = 0;
        int trackCountries = -1;
        // finding maximal number in goals based on condition if there are duplicates in difference and print out country.
        if (IsDuplicate){
            for (int y = 0; y < maxGoals.length; y++) {
                if (maxGoals[y] > MaxNumGoals) {
                    MaxNumGoals = maxGoals[y];
                    trackCountries++;
                }
            }
            System.out.print(countries[trackCountries] + " " + MaxNumGoals + " " + autoGoals[trackCountries]);
        }
        // print out country if there are no duplicates in difference based on maximal goal
        if (!IsDuplicate){
            for (int y = 0; y < maxGoals.length; y++) {
                if (maxGoals[y] > MaxNumGoals) {
                    MaxNumGoals = maxGoals[y];
                    trackCountries++;
                }
            }
            System.out.print(countries[trackCountries] + " " + MaxNumGoals + " " + autoGoals[trackCountries]);
        }
    }
}
