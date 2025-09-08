class Rectangle
{
private int length;
private int breadth;
public void setLength(int length)
{
this.length=length;
}
public int getLength()
{
return this.length;
}
public void setBreadth(int breadth)
{
this.breadth=breadth;
}
public int getBreadth()
{
return this.breadth;
}
}
class Box extends Rectangle
{
private int height;
public void setHeight(int height)
{
this.height=height;
}
public int getHeight()
{
return this.height;
}
}
class inheritance_in_java
{
public static void main(String xx[])
{
Box b=new Box();
b.setLength(55);
b.setBreadth(56);
b.setHeight(60);
System.out.println("Length is: "+b.getLength());
System.out.println("Breadth is: "+b.getBreadth());
System.out.println("Height is: "+b.getHeight());
}
}
