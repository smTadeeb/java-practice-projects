class Dog
{
public void printName()
{
System.out.println("Bruno");
}
final public void bark()
{
System.out.println("Bhow bhow");
}
public void jump()
{
System.out.print("jump jump");
}
}
class GermanShephard extends Dog
{
// Method Overriding
public void printName()
{
System.out.println("Tommy");
}

// Method overriding not allowed as this method is declared final, so Dog class developer doesnt want that someone should override it and create havoc.
public void bark()
{
System.out.println("Meow Meow");
}
}
class understanding_final_keyword
{
public static void main(String g[])
{
GermanShephard g;
g=new GermanShephard();
g.printName();
g.bark();
g.jump();
}
}
