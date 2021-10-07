package Tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task5 {
    public static void main(String[] args) {
        Characteristic ingot = new Characteristic("Слиток ", 7, 15);
        Characteristic writwath = new Characteristic("Часы ", 6, 20);
        Characteristic ring = new Characteristic("Кольцо ", 1, 4);
        Characteristic gun = new Characteristic("Пистолет", 10, 9);
        Characteristic document = new Characteristic("Документы", 1, 2);
        Characteristic safe = new Characteristic("Сейф", 10, 0);
        int i = 0;
        int j = 1 + safe.size / writwath.size;
        int k = 1 + safe.size / ring.size;
        int l = 1 + safe.size / gun.size;
        int m = 1 + safe.size / document.size;
        ArrayList variant = new ArrayList();

        for (; i <= safe.size / ingot.size; i++) {
            j--;
            j = j - safe.size / writwath.size;
            for (; j <= safe.size / writwath.size; j++) {
                k--;
                k = k - safe.size / ring.size;
                for (; k <= safe.size / ring.size; k++) {
                    l = l - safe.size / gun.size;
                    l--;
                    for (; l <= safe.size / gun.size; l++) {
                        m = m - safe.size / document.size;
                        ;
                        m--;
                        for (; m <= safe.size / document.size; m++) {
                            Object c1 = safe.size;
                            Object c = ingot.size * i + writwath.size * j + ring.size * k + gun.size * l + document.size * m;
                            if (c1.equals(c)) {
                                safe.cost = ingot.cost * i + writwath.cost * j + ring.cost * k + gun.cost * l + document.cost * m;
                                variant.add(safe.cost);
                            }

                        }
                    }
                }

            }

            System.out.println("Максимальная стоимость содержимого сейфа:" + Collections.max(variant));

        }

    }

}

class Characteristic {
    String name;
    int size;
    int cost;

    public Characteristic(String name, int size, int cost) {
        this.name = name;
        this.size = size;
        this.cost = cost;
    }
}
