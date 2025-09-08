class Bulb
{
private int wattage;
public void setWattage(int wattage)
{
if(wattage>=0 && wattage<=256) this.wattage=wattage;
else this.wattage=0;
}
public int getWattage()
{
return this.wattage;
}
}
class encapsulation_in_java
{
public static void main(String gg[])
{
Bulb b=new Bulb();
b.setWattage(-25);
System.out.println("The wattage of Bulb is: "+b.getWattage());
}
}
