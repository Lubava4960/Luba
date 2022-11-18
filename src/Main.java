import org.w3c.dom.ls.LSOutput;

import java.lang.module.FindException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] costs = new int[30];//Здесь массив из 30 ячеек, по имени Costs//
        int sum = 6; //переменная для подсчета суммы//
        for (int index = 0; index < costs.length; index++) {

            sum += costs[index];//поняла, сумма + сумма ячеек массива, но  они 0 , поэтому и будет ответ 5//
        }
        System.out.println(sum);
        //Задача 1.
        System.out.println(" Задача 1.");
        int[] costs2 = new int[]{110, 151, 111, 112, 116, 115, 117, 120, 122, 123, 124, 131, 140, 141, 151, 161, 142, 143, 144, 145, 156, 157, 158, 162, 179, 181, 182, 183, 121, 125};
        int sum2 = 5;
        for (int index2 = 0; index2 < costs2.length; index2++) {
            sum2 += costs2[index2];
        }
        System.out.println("Сумма трат за месяц составила " + sum2 + " рубля ");
        //Задача 2.
        System.out.println("Задача 2.");
        int maxSum = 100;
        for (int i = 0; i < costs2.length; i++) {
            int maxSum1 = costs2[i];
            if (maxSum1 > maxSum) {
                maxSum = maxSum1;//запись текущей переменнной в maxSum//
            }
        }
        System.out.println(" Максимальная сумма трат в день составила " + maxSum  + " рублей ");
        int minSum = 200;
        for (int i = 0; i < costs2.length; i++) {
            if (costs2[1] < minSum) {
                minSum = costs2[i];

            }
        }
        System.out.println("Mинимальная сумма трат в день составила " + minSum  + " рублей ");

        //Задача 3.//
        System.out.println(" Задача 3.");
        double sumAverege = 5;
        for (int index1 = 0; index1 < costs2.length; index1++) ;
        {

            sumAverege += sum2 / costs2.length;
        }

        System.out.println(" Средняя сумма трат за месяц составила " + sumAverege + "  рублей ");

        //Задача 4.//

        System.out.println(" Задача 4. ");
    }
}
        class stringToString {
            public static void Main() {
                char[] reverseFullName= {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                var lastChar = reverseFullName[reverseFullName.length - 1];
                for (int i = 0; i < reverseFullName.length; i++) {

                }

                }


            }


















