class array_in_java
{
public static void main(String gg[])
{
int y;
int x[];
x=new int[5];
// x=55;  <-- it will give error.
x[0] = 24;
x[1] = 15;;
x[2] = 55;
x[3] = 22;
x[4] = 69;

x[55] = 85;  // <-- it will give error out of bound
x[-10] = 255; // <-- it will give error out of bound
}
}
