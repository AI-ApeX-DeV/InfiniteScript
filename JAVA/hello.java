class hello
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 9; 
        System.out.println(a+b);

        float c = 3.6f;
        double d = 4.2;
        byte e = 6;
        char f= 'a';
        short g = 56;
        long h = 5656l;
        boolean i = true;
        double j = 5.6e-4;
        int k = 0b1010;
        int l = 0x7E;
        int m = (int)c;

        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d);
        System.out.println("Value of e: " + e);
        System.out.println("Value of f: " + f);
        System.out.println("Value of g: " + g);
        System.out.println("Value of h: " + h);
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
        System.out.println("Value of k: " + k);
        System.out.println("Value of l: " + l);
        System.out.println("Value of m: " + m);


        String str = "Hello World";
        String str1 = "Hello World";

        Boolean result1 = str==str1;

        System.out.println("Value of result1: " + result1);

        int a1= 6;
        int b1 = 9;
        int c1 = 8;
        Boolean result = a1>b1 && a1>c1;
        System.out.println("Value of result: " + result);
        result = a1>b1 || a1>c1;
        System.out.println("Value of result: " + result);
        result = !(a1>b1);
        System.out.println("Value of result: " + result);

        // if-else

        int age = 1;
        if(age>18)
        {
            System.out.println("You can drive");
        }
        else if(age==18)
        {
            System.out.println("You are 18");
        }
        else
        {
            System.out.println("You cannot drive");
        }



    }
}