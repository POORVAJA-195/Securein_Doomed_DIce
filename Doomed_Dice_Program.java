import java.util.*;

public class Doomed_Dice_Program {
    public static void main(String[] args) {
        int[] number1 = {1,2,3,4};
        int[] number2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int placesToFill = 6;
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6);
        List<List<Integer>> p1 = new ArrayList<>();
        List<List<Integer>> p2 = new ArrayList<>();
        
        Map<Integer, Integer> originalProbability = probabilityFinding(list1, list2);
        p1 = generateCombinations1(number1,placesToFill);
        p2 = generateCombinations2(number2,placesToFill);

        int flag = 0;
        for(List<Integer> l1 : p1)
        {
            for(List<Integer> l2 : p2)
            {
                if(compareProbabilities(l1,l2,originalProbability))
                {
                    System.out.println("Doomed dice1: " + l1);
                    System.out.println("Doomed dice2: " + l2);
                    flag = 1;
                    break;
                }
                if(flag==1)
                break;
            }
        }
        

        
    }

    public static List<List<Integer>> generateCombinations2(int[] numbers, int placesToFill) {
        List<List<Integer>> result = new ArrayList<>();

        int n = numbers.length;

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    combination.add(numbers[j]);
                }
            }
            if (combination.size() == placesToFill) {
                result.add(combination);
            }
        }

        return result;
    }
    
    public static List<List<Integer>> generateCombinations1(int[] numbers, int placesToFill) {
        List<List<Integer>> result = new ArrayList<>();

        int n = numbers.length;

        for (int i = 0; i < Math.pow(n, placesToFill); i++) {
            List<Integer> combination = new ArrayList<>();

            int temp = i;
            for (int j = 0; j < placesToFill; j++) {
                int index = temp % n;
                combination.add(numbers[index]);
                temp /= n;
            }

            result.add(combination);
        }

        return result;
    }
    
    public static boolean compareProbabilities(List<Integer> p1, List<Integer> p2, Map<Integer, Integer> originalProbability) {
        Map<Integer, Integer> generatedProbability = probabilityFinding(p1, p2);
        return originalProbability.equals(generatedProbability);
    }

    public static Map<Integer, Integer> probabilityFinding(List<Integer> list1, List<Integer> list2) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer num1 : list1) {
            for (Integer num2 : list2) {
                int sum = num1 + num2;
                result.put(sum, result.getOrDefault(sum, 0) + 1);
            }
        }
        return result;
    }
}
