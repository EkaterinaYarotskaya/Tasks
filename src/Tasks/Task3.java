package Tasks;

import java.util.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");

        String line = sc.nextLine();
        List<String> allWords = Arrays.asList(line.split(" "));
        Map<Integer, List<String>> sortedWordsAndVowelsCount = new TreeMap<>(Collections.reverseOrder());

        Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюя]");
        allWords.forEach(word -> {
            int vowelsCount = 0;
            Matcher matcher = vocals.matcher(word);
            while (matcher.find()) {
                vowelsCount++;
            }
            if (!sortedWordsAndVowelsCount.containsKey(vowelsCount)) {
                sortedWordsAndVowelsCount.put(vowelsCount, new ArrayList<>());
            }
            sortedWordsAndVowelsCount.get(vowelsCount).add(word.substring(0, 1).toUpperCase()+word.substring(1));
        });
        System.out.println(" Количество гласных букв -- Слово ");
        sortedWordsAndVowelsCount.forEach((k, v) -> System.out.println(k + " -- " + v));
    }
}

