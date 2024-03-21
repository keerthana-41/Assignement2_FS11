public class Swap {
    public static void main(String[] args)
    {
        int a=10,b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("A value after swapping is"+a+"and B value after swapping is"+b);
    }
}