class Bulb
{
public int w;
public void setWattage(int w)
{
this.w=w;
}
public int getWattage()
{
return this.w;
}

public Bulb(int w)
{
this.w=w;
}

public Bulb()
{
this.w=0;
}

}

class Toy
{
public int p;
public void setPrice(int p)
{
this.p=p;
}

public Toy(int p)
{
this.p=p;
}

public int getPrice()
{
return this.p;
}

}

class aaa<T>
{
public T m;
public void setContent(T m)
{
this.m=m;
}
public T getContent()
{
return this.m;
}
}

class passing_primitive_datatype_in_generic_class
{
public static void main(String gg[])
{
aaa<Bulb> a1;
a1=new aaa<Bulb>();
aaa<Toy> a2;
a2=new aaa<Toy>();

a1.setContent(new Bulb());
a2.setContent(new Toy(1000));

Bulb b=a1.getContent();
Toy t=a2.getContent();

System.out.printf("Wattage of Bulb is: %d\n", b.getWattage() );
System.out.printf("Price of Toy is: %d\n", t.getPrice() );

//aaa<int> q;  // <-- Now we can't do this as there is a strict rule that we can't pass primitive datatype to generic class.

/* So, in order to solve the above problem, we can make use of Wrapper classes */


aaa<Integer> q;
q=new aaa<> ();    //  q=new aaa<Integer>();    // Both are correct, in 1st statement java compiler will infer it

q.setContent(60); // <-- Autoboxing  //q.setContent(new Integer(60));  // Boxing
//Integer u = q.getContent();
//int x=u.intValue();       // Unboxing

int x=q.getContent(); // AutoUnboxing
System.out.println(x);

}
}
