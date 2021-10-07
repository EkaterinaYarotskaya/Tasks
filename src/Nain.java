//import java.io.*;
//public class Nain {
//public static void main(String[] args) throws IOException {
//    File f = new File("/Users/Андрей/Desktop/ZZ.txt");
//   getFileContent(f);
//}
//    public static String getFileContent(File file) throws IOException {
//        StringBuilder sb = new StringBuilder();
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),
//                "UTF8"))) {
//
//            String sCurrentLine;
//
//            while ((sCurrentLine = br.readLine()) != null) {
//
//                System.out.println(sCurrentLine);
//                sb.append(sCurrentLine);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return sb.toString();
//    }
//
//}
//
