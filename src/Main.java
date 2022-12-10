public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i=i+1;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 2");
        int a = 0;
        while (a < 10){
            a++;
            System.out.print(a+" ");
        }
        System.out.println();
        for (int b = 10 ;b > 0; b = b - 1){
            System.out.print(b + " ");
        }
        System.out.println("Задание 3");
        int y = 12_000_000;
        int years = 0;
        while (years < 10) {
            years = years + 1;
            int h = (y / 1000) * 17;
            int d = (y / 1000) * 8;
            y = y + h - d;
            System.out.println("Год " + years + ", численность населения составляет " + y);
        }
        System.out.println("Задание 4");
        int salary1 = 15_000;
        int total1 = 0;
        int i1 = 0;
        int l1 = (salary1/100)*7;
        while (total1 < 12_000_000) {
            i1= i1 + 1;
            total1 = total1 + salary1 + l1;
            System.out.println("Месяц " + i1 + ", сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("Задание 5");
        int salary2 = 15_000;
        int total2 = 0;
        int i2 = 0;
        int l2 = (salary1/100)*7;
        while (total2 < 12_000_000) {
            i2= i2 + 1;
            total2 = total2 + salary2 + l2;
            if (i2 % 6 == 0) {
                System.out.println("Месяц " + i2 + ", сумма накоплений равна " + total2 + " рублей");
            }
        }
        System.out.println("Задание 6");
        int salary3 = 15_000;
        int total3 = 0;
        int i3 = 0;
        int l3 = (salary1/100)*7;
        while (i3 < 108) {//108 это всего месяцев за 9 лет
            i3 = i3 + 1;
            total3 = salary3 + total3 + l3;
            if (i3 % 6 == 0) {
                System.out.println("Месяц " + i3 + ", сумма накоплений равна " + total3 + " рублей");
            }
        }
        System.out.println("Задание 7");

        for (int p = 2;p<31;p=p+7){
            System.out.println("Сегодня пятница, "+ p + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задание 8");
        int  years1 = 2022-200;
        int years2 = 2022+100;
        for(int g = 0;g < 2122;g=g+79){
            if ((g>years1) && (g < years2)){
                System.out.println(g);
            }
        }
    }
}