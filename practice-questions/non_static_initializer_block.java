class aaa
{

{
int x=20;
System.out.println("The value of x is: "+x);
}

aaa()
{
System.out.println("This is the default constructor");
}


{
System.out.println("Ujjain");
}

{
System.out.println("Goa");
}

aaa(int x)
{
System.out.println("This is the parameterized constructor");

}
}


class non_static_initializer_block
{
public static void main(String gg[])
{
aaa a = new aaa();
System.out.println("____________________");
aaa a2=new aaa(10);
}
}
