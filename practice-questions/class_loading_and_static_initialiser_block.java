class aaa
{

static 
{
System.out.println("Hello I am invoked from aaa base class");
}

static 
{ 
System.out.println("Hello I am invoked from aaa base class second static-block");
}



}

class bbb extends aaa
{

static 
{
System.out.println("Hello I am invoked from bbb derived class");
}


static 
{ 
System.out.println("Hello I am invoked from bbb derived class second static-block");
}


}

class class_loading_and_static_initialiser_block
{
public static void main(String gg[])
{
bbb b;
b=new bbb();
}
}
