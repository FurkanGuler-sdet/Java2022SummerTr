package day05_matematikselIslemler;

public class soru {
    public static void main(String[] args) {

        int a=10;
        System.out.println("a'nın değeri:"+ ++a);

        int b=a++;
        System.out.println("b'nin değeri:"+b);

        int c=b++ + a;
        System.out.println(c);
        System.out.println("son toplam:"+ (a+b+c));




    }
}
