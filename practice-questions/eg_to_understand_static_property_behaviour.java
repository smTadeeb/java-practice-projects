class Bulb
{
public int wattage;
public static int price;

public void setWattage(int wattage)
{
this.wattage=wattage;
}

public void setPrice(int price)
{
this.price=price;
}

public int getWattage()
{
return this.wattage;
}

public int getPrice()
{
return this.price;
}

}

class eg_to_understand_static_property_behaviour
{
public static void main(String gg[])
{
Bulb b1,b2;
b1= new Bulb();
b2= new Bulb();

b1.setWattage(100);
b1.setPrice(200);

b2.setWattage(1);
b2.setPrice(2);

System.out.println(b1.getWattage());
System.out.println(b1.getPrice());
System.out.println(b2.getWattage());
System.out.println(b2.getPrice());

}
}
