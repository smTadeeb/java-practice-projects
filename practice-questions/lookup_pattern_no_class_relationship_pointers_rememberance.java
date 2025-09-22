class aaa
{
private void ram()
{
System.out.println("Hi");
}
public void sam()
{
System.out.println("Hello");
}

}

class bbb extends aaa
{
public void tom()
{
System.out.println("Great");
}
}

class lookup_pattern_no_class_relationship_pointers_rememberance
{
static public void main(String gg[])
{
aaa a;
a=new bbb();
a.sam();
a.ram(); // Here also compiler will give error as here the problem is not Compile time binding but  ram is private method
a.tom(); //Here compiler will give error. Compile time Binding

}
}
