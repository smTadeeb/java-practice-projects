interface aaa
{
public void sam();

default public void tom()
{
System.out.println("New feature");
}

}

class bbb implements aaa
{
public void sam()
{
System.out.println("Overriden sam in bbb");
}

public void john()
{
System.out.println("Cool");
}
}

class interface_rule11_through_interface_pointer_method_lookup_theory_works
{
public static void main(String gg[])
{
aaa a;
a=new bbb();
a.sam();
a.tom();
// a.john();  // <-- as pointer is of aaa and we have'nt declared dummy john in aaa, so "jiska address" concept of java wont work here, instead compile time binding is occuring.
}

}

