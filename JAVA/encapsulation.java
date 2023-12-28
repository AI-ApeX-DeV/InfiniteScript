class human
{
     private int age;
     String name;

     public human()
     {
        age=10;
        name="sharukh";
     }

     public int getage()
     {
        return age;
     }
     public void setage(int age)
     {
        this.age=age;
     }
}

public class encapsulation {
    public static void main(String[] args)
    {
        human obj = new human();
        System.out.println(obj.getage());
        obj.setage(20);
        System.out.println(obj.getage());
        obj.name="Sharukhali";
    }
}
