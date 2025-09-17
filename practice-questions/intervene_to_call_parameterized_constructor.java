class aaa
{

aaa(int e)
{
System.out.println("Parameterized constructor of base class aaa");
}

}

class bbb extends aaa
{

bbb()
{
super(22);
System.out.println("Default constructor of derived class bbb");
//super(10); // error as it must be the 1st statement
}
}
