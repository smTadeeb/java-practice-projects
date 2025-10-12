class Bulb
{
private int wattage;

public void setWattage(int wattage)     // void setWattage(int wattage, Bulb *this)
{
this.wattage=wattage;
} 

public int getWattage()
{
return this.wattage;
}

}

class abd
{
public static void main(String gg[])
{
Bulb b;
b=new Bulb();
b.setWattage(50);            // b.setWattage(50, &b);

System.out.println(b.getWattage());
}
}
