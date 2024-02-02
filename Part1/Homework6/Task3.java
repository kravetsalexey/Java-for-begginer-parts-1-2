package Part1.Homework6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

//    Дан одномерный массив целых чисел.
//    Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
//    Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
//    Возвращает функция эти три массива в виде одного двумерного.
//            Пример:
//                                        [-4, -18]
//            [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
//                                        [1, 9, 3]

    public static void main(String[] args) {
        int[] array = {-4,0,1,9,0,-18,3};
        System.out.println(Arrays.toString(array));
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();
        for (int j : array) {
            if (j > 0) {
                positive.add(j);
            } else if (j < 0) {
                negative.add(j);
            } else {
                zero.add(j);
            }
        }
//        int[] positive = new int[p];
//        int[] negative = new int[n];
//        int[] zero = new int[z];
//        p=0;
//        n=0;
//        z=0;
//        for (int j : array) {
//            if (j > 0) {
//                positive[p++] = j;
//            } else if (j < 0) {
//                negative[n++] = j;
//            } else {
//                zero[z++] = j;
//            }
//        }
        System.out.println(positive.toString());
        System.out.println(negative.toString());
        System.out.println(zero.toString());
    }
}
