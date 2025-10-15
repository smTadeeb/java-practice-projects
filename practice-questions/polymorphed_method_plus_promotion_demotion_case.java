class polymorphed
{
/*
public void sam(long l)
{
System.out.print("I am called from long: ");
System.out.println(l);
}
*/

public void sam(int i)
{ 
System.out.print("I am called from int: ");
System.out.println(i);
}


}

/* THEORY
1. long will be called for long signatured method, int will be called for int signatured method if both are present in the class.
 
2. If int signatured is not present then promotion will happen implicitly and for int also long signatured method is called.

3. If i remove long signatured method from class then demotion wont occur implicitly as int cant take long inside it. So, error will occur. 

In order for the code to run for case3 we must do demotion explicitly by typecasting. i.e. sam((int)l);   <-- like this. and loss of precision will occur.
 
*/
class polymorphed_method_plus_promotion_demotion_case
{
public static void main(String gg[])
{
polymorphed a;
a=new polymorphed();
long l = 20;
int i = 45;
a.sam((int)l);   
a.sam(i);   
}
}
