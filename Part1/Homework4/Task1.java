package Part1.Homework4;

public class Task1 {

    //В переменной minutes лежит число от 0 до 59.
    //Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
    //Протестировать функцию в main.
    //
    //
    public static void main(String[] args) {
        System.out.println(task1(30));
    }
    public static String task1(int minutes) {
        int result = 0;
        int max = 15;
        int min = 0;
        if (minutes ==0 ){
            result = 1;
        }else {
            for (int i = 1; i < 4; i++) {
            if (min<=minutes && max>=minutes){
                result = i;
            }
                min = min +15;
                max = max +15;
            }
        }
        if (result == 3) {
            return (minutes + "ая минута попадает в " + result + "ую четверть часа.");
        } else {
            return (minutes + "ая минута попадает в " + result + "ью четверть часа.");
        }
    }
}
