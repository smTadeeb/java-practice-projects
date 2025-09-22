class aaa
{
public void sam()
{
System.out.println("Hello");
}

public void tom()
{

}

}

class bbb extends aaa
{
public void tom()
{
System.out.println("Great");
}
}

class lookup_pattern_no_class_relationship_late_binding
{
static public void main(String gg[])
{
aaa a;
a=new bbb();
a.sam();
a.tom(); //Here compiler will give error. Compile time Binding
}

}

