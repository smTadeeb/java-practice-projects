class resizable_array_in_java
{
public static void main(String gg[])
{
int x[];
x=new int[3];
for(int i=0,y=10 ;i<3;i++, y=y+10) x[i] = y;
System.out.println("Printing the values of old array: ");
for(int i=0;i<x.length;i++) System.out.println(x[i]);

//x[8] = 55; // <-- it will give error as its out-of-bound so we must resize array if we wish to do this operation

int t[] = new int[10];

for(int i=0;i<x.length;i++) t[i] = x[i];
x=t;
x[8] = 55; // <-- NOw it wont give error as we have resized the array.

System.out.println("Printing the values of new array: ");
for(int i=0;i<x.length;i++) System.out.println(x[i]);
}
}
