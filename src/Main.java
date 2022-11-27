public class Main {
    public static void main(String[] args) {

        //      ДЗ 1
        //  " Задание" 1
        System.out.println("Задание 1");

        for (int i = 1; i < 11; i++) {
            System.out.println(+i);
        }
        //   " Задание" 2
        System.out.println(" Задание 2");

        for (int i = 10; i > 0; i--) {
            System.out.println(+i);
        }
        //   " Задание" 3
        System.out.println(" Задание 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(+i);
        }

        //    "Задание" 4
        System.out.println(" Задание 4");

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        //      ДЗ 2
        //     "Задание" 1
        System.out.println("Задание 1 ДЗ 2");

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

        //     "Задание" 2
        System.out.println("Задание 2");

        for (int i = 7; i < 98; i = i + 7) {
            System.out.println(i);
        }
        //     "Задание"3
        System.out.println("Задание 3");

        for (int i = 1; i <= 512; i = i + 2) {
            System.out.println(i);
        }
        //          ДЗ2
        //     "Задание"4
        System.out.println("Задание 4");

        int contribution = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {

            total = total + contribution;
            System.out.println(total);
        }

        // "Задание" 5
        System.out.println("Задание 5");
        int contribution = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {

            total = total + total / 100;
            total = total + contribution;
            System.out.println("Месяц" + i + " Итого" = total);
        }


        {
        }
    }
}
















