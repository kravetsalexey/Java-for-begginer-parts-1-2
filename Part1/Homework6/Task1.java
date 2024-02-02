package Part1.Homework6;

import java.util.Arrays;

public class Task1 {

//    Дан одномерный массив целых чисел.
//    Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
//    После удаления - умножить каждый элемент массива на его длину.
//            Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
//
//    Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала


    public static void main(String[] args) {
        int[] array = {3,5,-6,3,2,-9,0};
        System.out.println(Arrays.toString(positiveArray(array)));
    }

    public static int[] positiveArray(int[] array){
        int k=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= -1) {
                continue;
            } else {
                k += 1;
            }
        }
        int[] result = new int[k];
        k=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= -1){
            continue;
            } else {
                result[k++] = array[i];
            }
        }
        for (int j = 0; j < k; j++) {
            result[j] = result[j] * k;
        }
        return result;
    }
}
