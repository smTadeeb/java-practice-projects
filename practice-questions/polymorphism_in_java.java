class Calculator
{
public int add(int x, int y)
{
return x+y;
}
public int add(int x, int y, int z)
{
return x+y+z;
}
}

class Main
{
public static void main(String gg[])
{
Calculator x=new Calculator();
System.out.println("Sum of 2 nos is: "+x.add(5,10));
System.out.println("Sum of 3 nos is: "+x.add(5,10,5));
}
}
