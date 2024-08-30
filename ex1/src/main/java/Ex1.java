public class Ex1 {
    /**
     * Calculate the sum of an arithmetic progression.
     *
     * @param start The first term of the progression
     * @param step The common difference between consecutive terms
     * @param count The number of terms to sum
     * @return The sum of the arithmetic progression
     */
    public static long calculateGaussSum(long start, long step, int count) {
        int sum = 0;
          for(int i = 0; i < count; i++) {
             sum += (i * step) + start;
          }
        return sum;
    }

    public static void main(String[] args) {
        // TODO: Call the calculateGaussSum method with the correct parameters
        // and print the result
        // Parameters for the problem: start = 81297, step = 198, count = 100
        System.out.println(calculateGaussSum(81297, 198, 100));
    }
}
