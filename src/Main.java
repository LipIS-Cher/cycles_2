public class Main {
    public static void main(String[] args) {
        //razdel 1
        //zadanie 1
        int sumDep = 15000;
        int total = 0;
        int rate = 12;
        int month = 0;

        while (total < 2495000){
            total = total + sumDep;
            total = total + (total / 100 * rate / 12);
            month = month + 1;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println(" ");
        //zadanie 2
        int z = 1;
        while (z <= 10){
            System.out.print(z + " ");
            z += 1;
        }
        System.out.println(" ");
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }

        System.out.println(" ");
        //zadanie 3
        int totalPeople = 12000000;
        for (int i = 1; i <= 10; i++){
            totalPeople = totalPeople + (totalPeople / 1000 * 12) - (totalPeople / 1000 * 8);
            System.out.println("Год " + i + ", численность населения составляет " + totalPeople);
        }

        System.out.println(" ");
        //razdel 2
        //zadanie 1
        int total2 = 15000;
        int rate2 = 7;
        int month2 = 0;

        while (total2 < 12000000){
            total2 = total2 + (total2 / 100 * rate2 / 12);
            month2 = month2 + 1;

            System.out.println("Месяц " + month2 + ", сумма накоплений равна " + total2 + " рублей.");
        }

        System.out.println(" ");
        //zadanie 2
        int total3 = 15000;
        int rate3 = 7;
        int month3 = 0;
        while (total3 < 12000000){
            total3 = total3 + (total3 / 100 * rate3 / 12);
            month3 = month3 + 1;
            if (month3 % 6 == 0){
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + total3 + " рублей.");
            }
        }

        System.out.println(" ");
        //zadanie 3
        int total4 = 15000;
        int rate4 = 7;
        int month4 = 0;
        while (total4 < 12000000){
            total4 = total4 + (total4 / 100 * rate4 / 12);
            month4 = month4 + 1;
            if ((month4 % 6 == 0) && (month4 < 9 * 12)){
                System.out.println("Месяц " + month4 + ", сумма накоплений равна " + total4 + " рублей.");
            }
        }

        System.out.println(" ");
        //zadanie 4
        int friday = 5;
        for (int i = 1; i <= 31; i++){
            if (i == friday){
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                friday = friday + 7;
            }
        }

        System.out.println(" ");
        //razdel 3
        //zadanie 1
        for (int i = 0; i <= 2300; i = i + 79){
            if ((i >= 2022 - 200) && (i <= 2022 + 200)){
                System.out.println(i);
            }
        }

        System.out.println(" ");
        //zadanie 2
        for (int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}