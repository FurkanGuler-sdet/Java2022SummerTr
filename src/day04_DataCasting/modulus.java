package day04_DataCasting;

import java.util.Scanner;

public class modulus {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 4 basamaklı bir sayı giriniz: ");

        int sayi= scan.nextInt();
        int rakamlarToplami=0;
        int birlerBasamagi= sayi%10;

        ////aşağıdaki ifade "rakamlarToplami += birlerBasamagi" şeklinde de yazılabilir.

        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        //aşağıdaki ifade sayi /=10 şeklinde de yazılabilir.

        sayi=sayi/10;
        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        sayi=sayi/10;
        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        sayi=sayi/10;
        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        System.out.println(rakamlarToplami);












    }



}
