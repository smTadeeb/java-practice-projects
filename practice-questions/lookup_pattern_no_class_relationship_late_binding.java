class aaa
{
public void sam()
{
System.out.println("Hello");
}


public void tom()
{
/*
We can keep tom method empty or write something into it. 

As by-default in java there is late-binding 
if same method is present in base and its derived class. then method whose objects address is stored in pointer is called

if lets suppose tom() method is not present in base class and only present in derived class then compiler will try to find tom() in base and as 
its not present jvm will raise error. Compile time binding occuring.

if lets suppose tom() method is present in base class and not in derived then compiler will 1st search in derived class, if not
found then will search in base and run the tom() method from base. 

if a method is in neither classes then error will be raised as no such method found.
*/
System.out.println("Hi I am tom from aaa ahahahaha");
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
a.tom(); //Here compiler will give error if aaa class doesnt have tom(). Compile time Binding
}

}

