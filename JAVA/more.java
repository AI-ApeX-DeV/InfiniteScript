interface computer
{
    void code();
}

class laptop implements computer
{ 
    public void code()
    {
        System.out.println("code compile run");
    }
}

class desktop implements computer
{
    public void code()
    {
        System.out.println("code compile run debug faster");
    }
}

class developer
{
    public void devapp(computer l)
    {
        l.code();
    }
}

class more
{
    public static void main(String[] args)
    {
        computer lap = new laptop();
        computer desk = new desktop();

        developer navin = new developer();
        navin.devapp(desk);

    }
}
