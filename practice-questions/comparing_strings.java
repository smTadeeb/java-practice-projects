class comparing_strings
{
public static void main(String gg[])
{
String g = "Hello";
String m = "Alo";

/*
int x;
x=g.compareTo(m);

System.out.println(x);

x=m.compareTo(g);
System.out.println(x);
*/
/* Errorful code
if(g>m)
{
System.out.println(g + " is heavier than " + m);
}
else
{
System.out.println(m + " is heavier than " + g);
}
*/

if(g.compareTo(m) > 0)
{
System.out.println(g + " is heavier than " + m);
}
else if(m.compareTo(g) > 0)
{
System.out.println(m + " is heavier than " + g);
}
else 
{
System.out.println(g + " and " + m + " are equal");
}

}
}
