//import java.io.IOException;
//import java.util.Scanner;
//
//public class Triager {
//    public static void main(String[] args) throws IOException {
//        String word = new String();
//        String newWord;
//        char newlitter;
//        char litter;
//        int ascii;
//        int asii1;
//        int i = 0;
//
//
//        do {
//            System.out.println("Введите слово на англ.");
//            Scanner scanner = new Scanner(System.in);
//            if (scanner.hasNextLine()) {
//                word = scanner.nextLine();
//            }
////            System.out.println(word);
//            char[] litters = word.toCharArray();
//            litter = litters[0];
//            ascii = (int) litter;
//
//            if (ascii > 64 && ascii < 91) {
//                asii1 = ascii + 32;
//
//                newlitter = (char) asii1;
////                System.out.println(newlitter);
//                i++;
//                litter = newlitter;
//            }
//            if (ascii > 97 && ascii < 123) {
//                asii1 = ascii - 32;
//                newlitter = (char) asii1;
////                System.out.println(newlitter);
//                i++;
//                litter = newlitter;
//            }
//           litters[0] = litter;
//            word =String.valueOf(litters) ;
//           System.out.println(word);
//        }
//
//        while (ascii != 46);
//        System.out.println("Количество замен: " + i);
//
//
//    }
//}