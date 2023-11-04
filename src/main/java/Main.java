import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Dana jest tablica 10 elementowa typu int:
//        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
//        Przy użyciu jednej z pętli, napisz fragment kodu, który wypisze:
//
//        wszystkie cyfry
//
//        6 pierwszych cyfr
//
//        6 ostatnich cyfr
//
//        wszystkie parzyste cyfry
//
//        wszystkie cyfry na nieparzystych indeksach
//
//        wszystkie cyfry od tyłu
//
//        wszystkie cyfry oprócz cyfry 5
//
//        wszystkie cyfry do cyfry 7 włącznie
//
//        wszystkie cyfry podzielne przez 3
//
//        sumę wszystkich cyfr
//
//        sumę cyfr większych lub równych 4
//
//        najmniejszą i największą cyfrę

        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};

        System.out.println(Arrays.toString(integers));

        for (int i :
                integers) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.println(integers[i]);
        }

        System.out.println();

        for (int i = integers.length - 1; i > integers.length - 7; i--) {
            System.out.println(integers[i]);
        }

        System.out.println();

        for (int i :
                integers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        for (int i = 0; i < integers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(integers[i]);
            }
        }

        System.out.println();

        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.println(integers[i]);
        }

        System.out.println();

        for (int integer : integers) {
            if (integer != 5) {
                System.out.println(integer);
            }
        }

        System.out.println();

        for (int integer : integers) {
            System.out.println(integer);
            if (integer == 7) {
                break;
            }
        }

        System.out.println();

        for (int integer : integers) {
            if (integer % 3 == 0) {
                System.out.println(integer);
            }
        }

        System.out.println();

        int sum = 0;
        for (int integer : integers) {
            sum += integer;
        }
        System.out.println(sum);

        System.out.println();

        sum = 0;
        for (int integer : integers) {
            if (integer >= 4) {
                sum += integer;
            }
        }
        System.out.println(sum);

        System.out.println();

        int max = integers[0];
        int min = integers[0];

        for (int integer : integers) {
            if (integer >= max) {
                max = integer;
            }
            if (integer <= min) {
                min = integer;
            }
        }

        System.out.println(max);
        System.out.println(min);


//        Dana jest tablica przechowująca nominały pieniędzy:
//        int[] money = {1, 2, 5, 10, 20};

//        oraz przykład kodu, który losuje jeden z indexów tej tablicy:

//        int idx = (int) (Math.random() * money.length + 1);
//        Napisz program, który:
//
//        będzie w pętli losowo pobierał wartość aż "uzbiera" wartość 100
//
//        każda pobrana wartość ma być wyświetlona
//
//        każda składowa suma ma być wyświetlona
//
//        na koniec ma być wyświetlona liczba pobrań pieniędzy koniecznych do uzbierania 100

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int[] money = {1, 2, 5, 10, 20};

        int hundred = 0;
        int counter = 0;
        while (true) {
            int idx = (int) (Math.random() * money.length);
            if (hundred < 100) {
                if (hundred + money[idx] <= 100) {
                    counter++;
                    hundred += money[idx];
                    System.out.println(money[idx]);
                    System.out.println(hundred);
                } else {
                    continue;
                }
            } else {
                System.out.println("The number of all coins and notes is " + counter);
                break;
            }
        }
    }
}
