package Part1.Homework6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 {

//    Дан одномерный массив символов.
//    Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
//    Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
//
//    Далее определить среднее арифметическое всех элементов целочисленного массива и вывести
//    на консоль только те элементы, которые больше этого среднего арифметического.


    public static void main(String[] args) {
        char[] array = {'a','6','y','P','T','q','9','+'};

        System.out.println(Arrays.toString(charCode(array)));
        System.out.println(Arrays.toString(moreAvg(charCode(array))));
    }

    public static int[] charCode(char[] array){
        int[] result = new int[array.length];
        for (int i = 0; i < array.length ; i++) result[i] =Character.getNumericValue(array[i]);
        return result;
    }
    public static int[] moreAvg(int[] array){
        int[] result = new int[array.length];
        int avg;
        int k = 0;
        int summ = 0;
        for (int j : array) {
            summ += j;
        }

        avg = summ/array.length;

        for (int j : array) {
            if (j > avg) result[k++] = j;
        }

        return result;
    }
}
