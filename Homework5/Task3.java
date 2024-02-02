package Part1.Homework5;

public class Task3 {

//    Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
//    Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
//300$ в месяц Ваня тратит на еду и развлечения.
//10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
//    Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
//    Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты

    public static void main(String[] args) {
        int salary = 600;
        int upgrade = 400;
        int spendings = 300;
        double invest;
        double investments = 0;
        double result = 0;

        for (int i = 1; i < 38; i++) {
            invest = 0.1*salary;
            result += salary - spendings - invest;
            investments = (investments * 1.02) + invest;
            if (i%6==0){
                salary = salary + upgrade;
            }
        }
        result+= investments;
        System.out.println(result);
    }
}
