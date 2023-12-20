public class Probability_of_sum {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        int totalCombinations = array1.length * array2.length;

        int[] sumCount = new int[13]; 

        for (int face1 : array1) {
            for (int face2 : array2) {
                int sum = face1 + face2;
                sumCount[sum]++;
            }
        }

        for (int i = 2; i <= 12; i++) {
            double probability = (double) sumCount[i] / totalCombinations;
            System.out.printf("P(Sum %d) = %.2f\n", i, probability);
        }
    }
}
