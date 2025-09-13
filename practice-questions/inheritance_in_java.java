class Rectangle
{
private int length, breadth;
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

//Inheritance in java
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

class box2 extends Box
{
// Method Overiding in Java
public int getHeight()
{
return 888; 
}
}

class inheritance_in_java
{
public static void main(String xx[])
{
box2 b=new box2();
b.setLength(55);
b.setBreadth(56);
b.setHeight(60);
System.out.println("Length is: "+b.getLength());
System.out.println("Breadth is: "+b.getBreadth());
System.out.println("Height is: "+b.getHeight());
}
}
