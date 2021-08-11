import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı: ");
        int number = input.nextInt();

        int i = 1, counter = 0, total = 0;
        while (i < number) {
            if (i % 3 == 0 && i % 4 == 0) {
               total+=i;
               counter++;
            }
            i++;
        }
        System.out.println("Ortalama: "+(total/counter));
    }
}
