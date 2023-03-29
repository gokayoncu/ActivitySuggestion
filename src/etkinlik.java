import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.println("Hava sıcaklığını giriniz:");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat > 5 && heat < 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat > 10 && heat < 15) {
            System.out.println("Sinema gidebilirsiniz.\nPikniğe gidebilirsiniz.");
        } else if (heat > 15 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}


