class aaa extends Object
{
public aaa()
{
System.out.println("I am default constructor from aaa");
}
}
class bbb extends aaa
{ 

}
class ccc extends aaa
{ 
public ccc()
{
super(); 
System.out.println("I am default constructor from ccc");
}
}
class ddd extends ccc
{ 
public ddd()
{ 
System.out.println("I am default constructor from ddd");
}
}
class default_constructor
{
public static void main(String gg[])
{
ddd d=new ddd();
System.out.println("Cool");
bbb b=new bbb();
}
}
