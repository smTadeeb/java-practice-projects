class aaa
{
aaa()
{
//this();  // this will give error as recursive constructor invocation will happen
//this(22);
System.out.println("Default of base aaa");
}

aaa(int x)
{
this();
System.out.println("Parameterized of base aaa");
}

}
class this_keyword_for_contructor_invoke
{
public static void main(String gg[])
{
aaa a;
a=new aaa();
System.out.println("------");
aaa a2 = new aaa(15);
}

}
