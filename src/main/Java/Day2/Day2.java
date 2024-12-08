package Day2;

import Day1.ReadInputFile;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Day2 {
    private static String filePath = "src/main/Java/Day2/input.txt";
    List<Integer> input;

    public static void main(String[] args) {
        List<List<Integer>> input = ReadInputFile.readInputByRows(filePath);

        ArrayList<String> safeOrUnsafe = new ArrayList<>();
        for (List<Integer> list : input) {
            for (int i = 0; i < list.size(); i++) {
                if(i == list.size() - 1) {
                    safeOrUnsafe.add("Safe");
                    break;
                }

                int value1 = Math.abs(list.get(i));
                int value2 = Math.abs(list.get(i+1));

                if (Math.abs((value1 - value2)) > 3) {
                    safeOrUnsafe.add("Unsafe");
                    break;
                }
            }
        }


        System.out.println("stop");
    }
}
