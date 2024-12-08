package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1 {

    public static void main(String[] args) {
        List<Integer> part2 = part2();
        int sum = part2.stream().reduce(0, Integer::sum);

        System.out.println(sum);
    }

    public static List<Integer> part2() {
        List<List<Integer>> input = ReadInputFile.readInputFile();
        List<Integer> outputList = new ArrayList<>();

        for(int i = 0; i < input.get(1).size(); i++) {
            outputList.add(part2MultiplierCounter(input));
            input.get(0).remove(0);
        }

        return outputList;
    }

    public static int part2MultiplierCounter(List<List<Integer>> input) {
        List<Integer> left = input.get(0);
        List<Integer> right = input.get(1);
        int multiplier = 0;

        for(int num : right) {
            if(num == left.get(0)) {
                multiplier++;
            }
        }

        return left.get(0) * multiplier;
    }

    public static int part1() {
        List<List<Integer>> input = ReadInputFile.readInputFile();

        List<Integer> distances = new ArrayList<>();
        for(List<Integer> list : input) {
            Collections.sort(list);
        }

        for(int i = 0; i < input.get(0).size(); i++) {
            int left = input.get(0).get(i);
            int right = input.get(1).get(i);
            int distance = left > right ? (left-right) : (right-left);
            distances.add(distance);
        }

        return distances.stream().reduce(0, Integer::sum);
    }
}
