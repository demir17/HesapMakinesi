import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 , n2 , islem;
        System.out.println("Hesap makinesine hoşgeldiniz... \nİşlem yapmak istediğiniz ilk sayıyı giriniz...");
        n1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz...");
        n2 =sc.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz... \n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        islem = sc.nextInt();

                switch(islem){
                    case 1:
                System.out.println("Sonuç: " + (n1 + n2) );
            break;

                    case 2:
                System.out.println("Sonuç: " + (n1 - n2));
            break;

                    case 3:
                System.out.println("Sonuç: " + (n1 * n2));
            break;

                    case 4:
                System.out.println("Sonuç: " + (n1 / n2));
            break;


                }
    }
}
