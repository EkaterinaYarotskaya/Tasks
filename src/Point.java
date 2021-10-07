import java.util.Scanner;

public class Point {
    public int x;
    public  int y;

    public void setPoint() {
        System.out.println("Введите координату х = ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
        }
        System.out.println("Введите координату y = ");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            y = scanner.nextInt();
        }

    }
    public String toString() {
        return "( " + x + "," + y + " )";
    }

    public void chetdtrt() {
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else {
            if (x > 0 && y < 0) {
                System.out.println("2");
            } else {
                if (x < 0 && y > 0) {
                    System.out.println("4");
                } else {
                    if (x < 0 && y < 0) {
                        System.out.println("3");
                    } else {
                        System.out.println("Точка лежитна оси координат");
                    }
                }
            }
        }
    }

    public void simmetria(Point B) {
        if (Math.abs(x) == Math.abs(B.x) && Math.abs(y) == Math.abs(B.y)) {
            System.out.println("Симметричны");
        } else {
            System.out.println("Не симметничны");
        }
    }

    public boolean kollonialn(Point B, Point C) {
        double distx1 = x - B.x;
        double disty1 = y - B.y;
        double distx2 = B.x - C.x;
        double disty2 = B.y - C.y;
        double k1 = distx1 / distx2;
        double k2 = disty1 / disty2;
        double c1 = y - k2 * x;
        double c2 = C.y - k2 * C.x;
        if (k1 == k2) {
            return true;
        } else {
            return false;
        }
    }
}

