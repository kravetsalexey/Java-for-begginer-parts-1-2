package Part1.Homework5;

public class Task2 {

//     Дано целое число.
//    Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
//    Результат вывести на консоль.
//    Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
//    Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)

    public static void main(String[] args) {
        System.out.println(reverse(7400));
    }

    public static int reverse(int gain){
        int result =0;
        int temp;
        while (gain>=1){
            temp = gain%10;
            gain = gain/10;
            result = result*10 + temp;
        }
        return result;
    }
}
