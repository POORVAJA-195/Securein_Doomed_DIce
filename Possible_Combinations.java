public class Possible_Combinations{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        printDiceCombinations(array1, array2);
    }

    private static void printDiceCombinations(int[] array1, int[] array2) {
        for (int face1 : array1) {
            for (int face2 : array2) {
                System.out.printf("[%d, %d] ", face1, face2);
            }
            System.out.println();
        }
    }
}