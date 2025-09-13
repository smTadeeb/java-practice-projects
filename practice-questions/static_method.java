class aaa
{
public void tom()
{
System.out.println("I am tom from aaa");

//sam(); // allowed to call static from non-static method
//System.out.println("Above line was called from tom in aaa");
}
static void sam()
{
System.out.println("I am sam from aaa");
tom();
}
}
class bbb extends aaa
{

}

class static_method
{
public static void main(String gg[])
{
bbb.sam(); // correct. static method can be called even without making an object of class
//aaa.sam(); // correct
//System.out.println("Cool");
//bbb.tom(); // incorrect 
//bbb obj=new bbb();
//obj.sam(); // correct
//obj.tom(); // correct
}
}
