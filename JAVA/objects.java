class students
{
    String name;
    int roll;
    String branch=new String();
    public students(String name,int roll)
    {
        this.name = name;
        this.roll = roll;
        this.branch=    "CSE";
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Branch: "+branch);
    }
    public static void show(students obj)
    {
        System.out.println("This is a static method");
        System.out.println("Name: "+obj.name+" Roll: "+obj.roll+" Branch: "+obj.branch);
    }
    public void show1()
    {
        System.out.println("This is not a static method");
    }
}

public class objects {
    public static void main(String[] args)
    {
        students obj = new students("Rahul",1);
        obj.display();
        students arr[] = new students[5];
        arr[0] = new students("Rahul",1);
        arr[1] = new students("Rohan",2);
        arr[2] = new students("Raj",3);
        arr[3] = new students("Ramesh",4);
        arr[4] = new students("Rakesh",5);
        for(students i:arr)
        {
            i.display();
        }

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity()); 
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5," Java");
        System.out.println(sb);
        sb.replace(5,10," C++");
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setLength(10)  ;



        students.show(obj);
        obj.show1();


    }
}
