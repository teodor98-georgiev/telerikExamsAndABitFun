public class maxMinSort {
    public static void main(String[] args){
        // calculating max and min number;
        int[] numbers = {2,5,10,1,3,12,-1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int y = 0; y < numbers.length; y++){
            if (numbers[y] > max){
                max = numbers[y];
            }
            if (numbers[y] < min){
                min = numbers[y];
            }
        }

        // sorting from min to max (buble algorithm used)
        int[] numbersToSort = {2,5,10,1,3,12,-1};
        for (int e = 0; e < numbersToSort.length; e++){
            for (int f = e + 1; f < numbersToSort.length; f++){
                if (numbersToSort[e] > numbersToSort[f]){
                    int ToMove = numbersToSort[e];
                    numbersToSort[e] = numbersToSort[f];
                    numbersToSort[f] = ToMove; // remember, I substitute with a random variable the element which is appropriated
                    //beacuse once is appropriated, its initial value disappears but I need to store it to reuse.

                }
            }
        }
    }
}
