package Part1.Homework4;

public class Task2 {

    //Даны 3 переменные:
    //    //- operand1 (double)
    //    //- operand2 (double)
    //    //- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
    //    //Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
    //    //Протестировать функцию в main.
    //    //Например:
    //    //Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
    //    //Результат: 34.5 (24.4 + 10.1)

    public static void main(String[] args) {
        System.out.println(task2(24.3,10.1, '%'));
    }
    public static double task2(double operand1, double operand2, char operation){
        double result = 0;
        if (operation== '+'){
            result = operand1 + operand2;
        }
        if (operation== '-'){
            result = operand1 - operand2;
        }
        if (operation== '*'){
            result = operand1 * operand2;
        }
        if (operation== '/'){
            result = operand1 / operand2;
        }
        if (operation== '%'){
            result = operand1 % operand2;
        }
        return result;
    }
}
