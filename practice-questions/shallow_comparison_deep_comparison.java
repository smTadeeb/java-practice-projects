class shallow_comparison_deep_comparison
{

public static void main(String gg[])
{
String g;
g="Hello";

String m;
//m=new String();
//m="Hello";   // Even though we explicitly created a String object but at this line we change m's value. now m will no longer hold address of object created in above line

m=new String("Hello");
// Shallow comparison
System.out.println("Shallow Comparison now: ");

if(g==m)
{
System.out.println("String's are Same");
}
else
{
System.out.println("String's are Different");
}

//Deep Comparison
System.out.println("Deep Comparison now: ");
if(g.equals(m))
{
System.out.println("String's are Same");
}
else
{
System.out.println("String's are Different");
}
}

}
