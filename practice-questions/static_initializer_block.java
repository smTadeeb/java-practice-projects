class aaa
{

{
System.out.println("Hello");
}

static
{
System.out.println("static block 1");
}

aaa()
{
System.out.println("I am default Constructor");
}

static 
{
System.out.println("static block 2");
}

aaa(int x)
{
System.out.println("I am parameterized Constructor");
}

{
System.out.println("Hello again");
}

}

class static_initializer_block
{

public static void main(String gg[])
{
System.out.println("________________________");
aaa a;
a=new aaa(); // aaa class loaded in RAM now
System.out.println("-------------------------");
aaa a2 = new aaa(55);
System.out.println("-------------------------");
aaa a3;
a3=new aaa(22);
}

}
