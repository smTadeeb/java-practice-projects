class shallow_and_deep_comparison
{
public static void main(String gg[])
{
String g;
g="Hello";

String m;
m=new String();
m="Hello";

// Shallow Comparison
System.out.println("_______________\n");
System.out.println("Shallow Comparison happening now");
if(g==m)
{
System.out.println("Same");
}
else
{
System.out.println("Different");
}

// Deep Comparison
System.out.println("_______________\n");
System.out.println("Deep Comparison happening now");
if(g.equals(m))
{
System.out.println("Same");
}
else
{
System.out.println("Different");
}

// Still Deep Comparison but case-sensitive
System.out.println("_______________\n");
System.out.println("Case sensitive deep Comparison happening now");
m="HELLo";
if(g.equals(m))
{
System.out.println("Same");
}
else
{
System.out.println("Different");
}


// Now, Deep Comparison incase-sensitive
System.out.println("_______________\n");
System.out.println("Incase-sensitive Deep Comparison happening now");
if(g.equalsIgnoreCase(m))
{
System.out.println("Same");
}
else
{
System.out.println("Different");
}


}
}
