class aaa
{
public aaa()
{
super();
System.out.println("Default constructor from aaa");
}
public aaa(int x)
{
System.out.println("Parameterized constructor from aaa");
}
}

// Suppose this class is written by AMIT
class bbb extends aaa
{
public bbb(int x)
{
System.out.println("Parameterized constructor from bbb");
}
}

// Suppose this class is written by BOBBY
/*
If the below code doesnt compile then its mistake of BOBBY not AMIT
as AMIT knew this and he wanted BOBBY to pass argument to constructor while making object of his class
that why he purposely didnt wrote default constructor and he knew that compiler will also not write it. 
*/
class parameterized_constructor
{
public static void main(String gg[])
{ 
/* This below line would give error as there is already 
a parameterized constructor in bbb class so compiler wont 
write default constructor and in below line we are trying to 
call default constructor which is not there so error
*/
//bbb b1=new bbb();  //error here, so we must comment this line
System.out.println("Cool");
bbb b2=new bbb(555);
}
}
