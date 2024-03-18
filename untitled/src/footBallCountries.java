import java.util.Scanner;

public class footBallCountries {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // Number of teams

        String teamWithMaxDifference = "";
        int maxDifference = Integer.MIN_VALUE;
        int maxGoalsForMaxDifference = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String teamName = parts[0];
            int goalsFor = Integer.parseInt(parts[1]);
            int goalsAgainst = Integer.parseInt(parts[2]);

            int difference = goalsFor - goalsAgainst;

            // Update if current team has a larger difference, or if it's a tie and the team has more goals for.
            if (difference > maxDifference || (difference == maxDifference && goalsFor > maxGoalsForMaxDifference)) {
                maxDifference = difference;
                maxGoalsForMaxDifference = goalsFor;
                teamWithMaxDifference = teamName;
            }
        }

        System.out.println(teamWithMaxDifference + " " + maxDifference);
        scanner.close();

    }
}
