class Bulb
{
private int wattage;
private static int price;

public void setWattage(int wattage)
{
this.wattage=wattage;
}
public void setPrice(int price)
{
this.price=price;
}
public int getPrice()
{
return this.price;
}
public int getWattage()
{
return this.wattage;
}

}
class static_property
{
public static void main(String gg[])
{
Bulb b1, b2;
//System.out.println(b1); // Here compiler wont allow you only to proceed without initialising b1,b2 and give error at this line
b1 = new Bulb();
b2 = new Bulb();
b1.setWattage(60);
b1.setPrice(50);
b2.setWattage(600);
b2.setPrice(500);
System.out.println("Wattage is: "+ b1.getWattage());
System.out.println("Wattage is: "+ b2.getWattage());
System.out.println("Price is: "+ b1.getPrice());
System.out.println("Price is: "+ b2.getPrice());
b2.setPrice(5555);
System.out.println("Price is: "+ b1.getPrice());
}
}
