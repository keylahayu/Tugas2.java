import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Masukan nilai massa :");
        int massa =input.nextInt();

        System.out.print("Masukan nilai kecepatan :");
        int kecepatan =input.nextInt();

        System.out.print("Masukan nilai ketinggian :");
        int ketinggian =input.nextInt();

        double energiPotensial =massa * ketinggian * 10;
        System.out.println("Energi potensial =" + energiPotensial);

        double energiKinetik =0.5 * massa * (kecepatan * 2);
        System.out.println("Energi kinetik =" + energiKinetik);

        double energiMekanik =energiPotensial + energiKinetik;
        System.out.println("Energi mekanik =" + energiMekanik);

    }
}