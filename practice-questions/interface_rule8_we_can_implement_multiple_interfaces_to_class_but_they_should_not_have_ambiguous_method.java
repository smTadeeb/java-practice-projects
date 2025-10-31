interface bbb
{
public void sam();
default public void tom()
{
System.out.println("Hello");
}
}

interface ccc
{
default public void tom()
{
System.out.println("Hiiii");
}
}

class aaa implements bbb,ccc
{
// Now this is implementing ccc and bbb cutom datatypes, so 1st we must override and define sam(), otherwise this class remains a abstract class. 
// Now the question is which tom() will be inherited as there are 2 ? this causes ambiguity, so makers of java decided they should give error for it.
// Hence we'll receive error.
public void sam()
{

}
}
