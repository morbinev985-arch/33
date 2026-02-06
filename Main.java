//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("задание 1");

        int firstFriday = 3;
        int totalMessages = 0;
        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0 && day >= firstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                totalMessages++;
            }
        }
        if (totalMessages >= 4 && totalMessages <= 5) {
            System.out.println("Количество напоминаний в месяце: " + totalMessages);
        } else {
            System.out.println("Количество напоминаний: " + totalMessages + ". Проверьте правильность первого дня пятницы.");
        }

        System.out.printf("задание 2");

        int distance = 0;
        int totalDistance = 42195;
        int step = 500;
        do {
            distance += step;
            if (distance <= totalDistance) {
                int remaining = totalDistance - distance;
                System.out.println("Держитесь! Осталось " + remaining + " метров.");
            }
        } while (distance < totalDistance);

        System.out.printf("задание 3");

        int totalMoney = 1000;
        int days = 0;
        while (totalMoney >= 100) {
            if (days % 5 == 0) {
                days++;
                continue;
            }
            totalMoney -= 100;
            days++;
        }

        System.out.println("Количество дней, на которые хватит бюджета (while): " + days);

        int totalMoney1 = 1000;
        int days1 = 0;

        for (; totalMoney1 >= 100; days1++) {
            if (totalMoney1 < 0) {
                break;
            }
            if (days % 5 == 0) {
                //
                days++;
                continue;
            }
            totalMoney1 -= 100;
            days1++;

        }


        System.out.println("Количество дней, на которые хватит бюджета (for): "+days);

        System.out.printf("задание 4");
        int month = 0;
        double total = 0;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.printf("Месяц %d: сумма накоплений = %.2f ₽\n", month, total);
            if (total >= 12000000) {
                System.out.println("Цель достигнута за " + month + " месяцев!");
                break;
            }

            System.out.printf("задание 5");
            int charge = 20;
            int minute = 0;
            int overheats = 0;

            while (charge < 100 && overheats <= 3) {
                minute++;
                if (minute % 10 == 0) {
                    overheats++;
                    System.out.println("Произошел перегрев! Количество перегревов: " + overheats);
                    if (overheats > 3) {
                        break;
                    }
                    minute += 2;
                    continue;
                }
                charge += 2;
                if (charge > 100) {
                    charge = 100;
                }
            }
            if (overheats > 3) {
                System.out.println("Зарядка прекращена досрочно. Текущий заряд: " + charge + "%");
            } else {
                System.out.println("Зарядка завершена. Текущий заряд: " + charge + "%");
            }
            System.out.println("Общее время зарядки: " + minute + " минут");
        }
    }
}
