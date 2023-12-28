
class add
{
    public int add(int a,int b)
    {
        return a+b;
    }
}

class MyClass
{
    public static void main(String[] args)
    {
        add obj = new add();
        System.out.println(obj.add(4,5));

        int num[] = {1,2,3,4,5};
        int num1[] = new int[5];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
        num1[4] = 5;
        int num2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int num3[][] = new int[3][3];
        num3[0][0] = 1;
        num3[0][1] = 2;
        num3[0][2] = 3;
        for(int i=0;i<5;i++)
        {
            System.out.print(num[i]+" ");
        }   
        System.out.println();
        for(int m:num1)
        {
            System.out.print(m+" ");
        }
        System.out.println();
        for(int m[]:num2)
        {
            for(int n:m)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }

    }
}