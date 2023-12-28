class a
{
    public a()
    {
        System.out.println("I am constructor of class a");
    }
    public a(int i)
    {
        System.out.println("I am overloaded constructor of class a wtih int");
    }
}
class b extends a 
{
    public b()
    {
        System.out.println("I am constructor of class b");
    }
    public b(int i)
    {
        super(i);
        System.out.println("I am overloaded constructor of class b wtih int");
    }

}
