package day04_DataCasting;

public class deneme    {
    public static void main(String[] args) {
        int a =134;
        double b=23.4;
        short c=129;
        byte d=14;

        double e=a;
        int f=c;
        short g= d;
        byte h= (byte) c;

        System.out.println("short 129un byte karşılığı:" + h);

        byte max=Byte.MAX_VALUE;
        System.out.println(max);






    }









}



