class aaa
{
static { System.out.println("In class aaa"); }
{
System.out.println("Second");
}
aaa()
{
System.out.println("After Second");
}

public void sam(char x)
{
System.out.println("I am sam of char");
}
public void sam(int x)
{
System.out.println("I am sam of int");
}
}

class bbb
{
static
{
System.out.println("First");
}
public static aaa a = new aaa();

{
System.out.println("Wont run");
}

}

class class_loading_understanding
{
public static void main(String gg[])
{
System.out.println("Start");
bbb.a.sam('T');
System.out.println("Mid");
bbb.a.sam(20);
System.out.println("End");
}
}
