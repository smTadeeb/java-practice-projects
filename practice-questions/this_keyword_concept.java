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
class p2p
{
public static void main(String gg[])
{
Bulb m;
m=new Bulb();
m.setWattage(55);
System.out.println("The wattage of bulb is: "+m.getWattage());
}
}
