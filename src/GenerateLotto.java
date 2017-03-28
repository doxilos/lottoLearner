import java.util.Random;

/**
 *
 */

public class GenerateLotto {

    int TotalNumber;
    int RaffleNum;

    /** Random lotto raffle
     *
     * @param TotalNumber Number of balls that will be chosen from
     * @param RaffleNum How many balls will be chosen?
     * @return Chosen Numbers
     */
    public static int[] generateLotto(int TotalNumber, int RaffleNum, double prediction){

        //Random object
        Random random = new Random();

        //Creates an int array for result
        int[] chosen = new int[RaffleNum];

        //This loop will go for given pool number
        for(int i = 0; i<chosen.length;i++){
            chosen[i] = random.nextInt(TotalNumber+1);
        }

        return chosen;
    }


}
