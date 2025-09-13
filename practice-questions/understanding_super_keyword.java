class aaa
{
public void tom()
{
System.out.println("I am tom from aaa");
}

public void john()
{
System.out.println("I am john from aaa");
}
}

class bbb extends aaa
{
// Method override
public void tom()
{ 
System.out.println("I am tom from bbb");
//tom();  // comment this otherwise application will crash
super.tom();  // without super keyword application will crash, with super keyword tom from base class would be called
}
}

class understanding_super_keyword
{
public static void main(String gg[])
{
bbb b=new bbb();
b.tom();
}
}
