public class CB7_MonteCarlo {
    public static void main(String[] args) {
        final int TOTAL_THROWS = 1_000_000;
        int oddCount = 0;

        for (int i = 0; i < TOTAL_THROWS; i++) 
        {
            // randomly generate 2 coordinates between -1 to 1
            double x = Math.random() * 2 - 1;    
            double y = Math.random() * 2 - 1;

            // Check odd-numbered regions (1 and 3)
            if (((-1<x && x<0) && (-1<y && y<1)) || (x+y==1)) 
            {
                oddCount++;
            }
        }

        double probability = (double) oddCount / TOTAL_THROWS;

        System.out.println("Probability of landing in an odd-numbered region: " + probability);
    }
    
}
