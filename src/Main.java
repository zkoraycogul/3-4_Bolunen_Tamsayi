import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0,divideNumber=0,number;
        System.out.print("Sayi Giriniz : ");
        number = input.nextInt();

        for (int i=1;i<=number;i++) {
            if (i%3==0 && i%4==0) {
                total+=i;
                divideNumber++;
            }
        }
        System.out.println(divideNumber>0? "Ortalama = " + (total/divideNumber) : "Ortak Bölen Yok");
    }
}
