class auto_boxing_unboxing_in_java
{
public static void main(String gg[])
{
int x=10;
Integer i;
i=x;        // <--Auto Boxing
System.out.println(i);

int k;
k=i ; 	// <-- Auto Unboxing
System.out.println(k);
}
}
