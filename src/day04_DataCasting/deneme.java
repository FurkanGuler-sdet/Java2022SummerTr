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



        String str = "java";
        System.out.println(str.toUpperCase());

        int sayı1=20;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String str1="1234";
        String str2="2000";
        System.out.println(str1+str2);
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));




    }









}



