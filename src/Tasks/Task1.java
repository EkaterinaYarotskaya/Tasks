package Tasks;

public class Task1 {
    public static void main(String[] args) {
        String string = "1kij7";
        int sum = 0;

        String numberOnly = string.replaceAll("\\D+", "");
        if (!string.isEmpty()) {

            int i = Integer.parseInt(numberOnly);
            System.out.println(i);
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            System.out.println("Сумма элементов строки равна:" + sum);

        } else System.out.println("Сумма элементов строки равна:" + sum);

    }
}

