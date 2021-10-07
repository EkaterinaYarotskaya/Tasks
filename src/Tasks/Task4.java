package Tasks;

import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        printer(95126);
    }

    public static void printer(Integer number) {

        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        Collections.reverse(digits);


        List<Integer> sortedNumbers = new ArrayList<>(digits);
        Collections.sort(sortedNumbers);
        Collections.reverse(sortedNumbers);
        int maxValue = sortedNumbers.get(0);

        List<List<String>> bigSizeDigits = new ArrayList();
        digits.forEach(digit -> bigSizeDigits.add(bigSizeDigitsContainer(digit)));

        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) == maxValue) {
                for (int x = 0; x < bigSizeDigits.get(i).size(); x++) {
                    bigSizeDigits.get(i).set(x, bigSizeDigits.get(i).get(x).replace('*', (char) (maxValue + '0')));

                }
            }
        }

        StringBuilder lineBuilder = new StringBuilder();
        for (int line = 0; line < bigSizeDigits.get(0).size(); line++) {
            for (int digitNumber = 0; digitNumber < bigSizeDigits.size(); digitNumber++) {
                lineBuilder.append(bigSizeDigits.get(digitNumber).get(line));
            }
            System.out.println(lineBuilder);
            lineBuilder.setLength(0);

        }

    }

    private static List<String> bigSizeDigitsContainer(int digit) {

        List<List<String>> allNumbers = new ArrayList<>();

        allNumbers.add(Arrays.asList(
                ("  ***  "),
                (" *   * "),
                (" *   * "),
                (" *   * "),
                (" *   * "),
                (" *   * "),
                ("  ***  ")
        ));

        allNumbers.add(Arrays.asList(
                ("   *   "),
                ("  **   "),
                ("   *   "),
                ("   *   "),
                ("   *   "),
                ("   *   "),
                ("   *   ")
        ));

        allNumbers.add(Arrays.asList(
                ("  ***  "),
                (" *   * "),
                ("    *  "),
                ("   *   "),
                ("  *    "),
                (" *     "),
                (" ***** ")
        ));

        allNumbers.add(Arrays.asList(
                ("  ***  "),
                (" *   * "),
                ("     * "),
                ("  ***  "),
                ("     * "),
                (" *   * "),
                ("  ***  ")
        ));

        allNumbers.add(Arrays.asList(
                ("     *  "),
                ("    **  "),
                ("   * *  "),
                ("  *  *  "),
                (" ****** "),
                ("     *  "),
                ("     *  ")
        ));

        allNumbers.add(Arrays.asList(
                (" ***** "),
                (" *     "),
                (" *     "),
                (" ****  "),
                ("     * "),
                (" *   * "),
                ("  ***  ")
        ));

        allNumbers.add(Arrays.asList(
                ("   **  "),
                ("  *    "),
                (" *     "),
                (" ****  "),
                (" *   * "),
                (" *   * "),
                ("  ***  ")
        ));

        allNumbers.add(Arrays.asList(
                (" ***** "),
                ("     * "),
                ("    *  "),
                ("   *   "),
                ("  *    "),
                (" *     "),
                (" *     ")
        ));

        allNumbers.add(Arrays.asList(
                ("  ***  "),
                (" *   * "),
                (" *   * "),
                ("  ***  "),
                (" *   * "),
                (" *   * "),
                ("  ***  ")
        ));

        allNumbers.add(Arrays.asList(
                ("  ***  "),
                (" *   * "),
                (" *   * "),
                ("  **** "),
                ("     * "),
                ("    *  "),
                ("  **   ")
        ));
        return allNumbers.get(digit);
    }
}
