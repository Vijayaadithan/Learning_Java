package Learning.oops.staticexample;

public class StaticBloack
{
    static int a=4;
    static int b=1;

    static
    {
        System.out.println("I'm inside static block");
        StaticBloack.b*=a;
    }

    public static void main(String[] args) {
        StaticBloack s1=new StaticBloack();
        System.out.println(StaticBloack.a+" "+StaticBloack.b);

        StaticBloack.b+=3;
        System.out.println(StaticBloack.a+" "+StaticBloack.b);

        StaticBloack s2=new StaticBloack();
        System.out.println(StaticBloack.a+" "+StaticBloack.b);

    }
}
