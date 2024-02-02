package Part1.Homework5;

public class Task1 {

//      Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
//      Для решения написать 2 функции, которые будут принимать введенное целое число,
//      а возвращать количество четных цифр (вторая функция - нечетных).
//      Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
    public static void main(String[] args) {
        int gain = 11114286;
        int number = gain;
        int temp;
        int countEven = 0;
        int countOdd = 0;
        while (number >= 1){
            temp = number%10;
            if (temp%2==0){
                countEven++;
            } else {
                countOdd++;
            }
            number = number/10;
        }
        System.out.println("У числа " + gain + " " + countEven + " четных цифры, а нечетных - " + countOdd);
    }
}
