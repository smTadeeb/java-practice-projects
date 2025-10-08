class string_in_java
{
public static void main(String gg[])
{
String g;
g="Sheikh";

String k;
k="Muhammed";

String l;
l =  "Sheikh";

String m;
m=new String("Sheikh");

String h[];
h=new String[4];
h[0] = g;
h[1] = k;
h[2] = l;
h[3] = m;

System.out.println("Checking g==l: ");
if(h[0]==h[2]) System.out.println("Same");
else System.out.println("Different");
System.out.println("\n");

System.out.println("Checking g==m: ");
if(h[0]==h[3]) System.out.println("Same");
else System.out.println("Different");




}
}
