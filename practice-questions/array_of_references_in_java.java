class Bulb
{
private int wattage;
public void setWattage(int wattage)
{
this.wattage=wattage;
}
public int getWattage()
{
return this.wattage;
}
}

class array_of_references_in_java
{
public static void main(String gg[])
{
Bulb []b;  // b is a pointer to Someclass which has array of 3 elements that can hold Bulb type value i.e. reference/pointer to Bulb Object

b = new Bulb[3];

System.out.println("Printing the current default values of array: ");
for(int i=0;i<b.length;i++) System.out.println(b[i]); // <-- 3 times null will be printed as default value of object variable set by java compiler for a reference is null
System.out.println(" Now I will put proper references ");

// b[0].setWattage(50); //  <-- Doing this directly will give error as 3 elements of array are of type Bulb i.e. pointer but we passing an int.

for(int i=0; i<b.length;i++) b[i] = new Bulb();

System.out.println(" Now I will set wattages for referenced objects: ");
for(int i=0, y=50; i<b.length; i++, y=y+10) b[i].setWattage(y);

System.out.println(" Now I will print wattages values for each referenced objects: ");
for(int i=0; i<b.length; i++) System.out.println(b[i].getWattage());

}
}
