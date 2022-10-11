package day07_ifStatements;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarlarını girin," + "\nher kenardan sonra entere basın");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eşkenar Üçgen");
        }else {
            System.out.println("Eşkenar Üçgen Değil");




        }



    }
}
