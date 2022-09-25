package day04_DataCasting;

import java.util.Scanner;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=500;
        byte sayi2= (byte) sayi1;
        System.out.println(sayi2); // 50
        /*
         Genis data turundeki degeri, dar data turundeki variable'a atamak isterseniz
         Java sizin gen  is data turundeki degerin, dar data turunun
         sinirlarina uyup uymayacagini calistirana kadar bilemez
         ama Java Risk almaz
         Riski sifira indirmek icin burada bir sorun olursa
         sorumlulugu kabul etmenizi bekler
         bunun icin degerin onune parantez icerisinde istedigimiz data turunu
         yazmamiz yeterlidir.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bölünecek tam sayıyı girin:");
        int a = scan.nextInt();

        System.out.println("Bölecek tam sayıyı girin");
        int b = scan.nextInt();

        System.out.println("a/b nin değeri= "+a/b);

        double dogruSonuc= (double) a/b;
        System.out.println("atama yapıldıktan sonra doğru sonuç="+dogruSonuc);




    }
}
