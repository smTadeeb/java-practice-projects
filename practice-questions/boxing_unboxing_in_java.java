class boxing_unboxing_in_java
{
public static void main(String gg[])
{
int x=10;
Integer i;
i=new Integer(x);        // <-- Boxing
System.out.println(i);

int k;
k=i.intValue(); 	// <-- Unboxing
System.out.println(k);
}
}
