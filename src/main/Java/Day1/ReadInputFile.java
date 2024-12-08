package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInputFile {

    public static List<List<Integer>> readInputFile() {
        String filePath = "src/main/Java/Day1/input.txt";

        List<List<Integer>> columns = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] numbers = line.trim().split("\\s+");

                // Process each number and assign it to its column list
                for (int i = 0; i < numbers.length; i++) {
                    int num = Integer.parseInt(numbers[i]);

                    // Ensure the list for the column exists
                    while (columns.size() <= i) {
                        columns.add(new ArrayList<>());
                    }

                    columns.get(i).add(num);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return columns;
    }
}
