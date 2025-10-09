abstract class Animal
{
public int getAge()
{
return 999;
}
}

class Donkey extends Animal
{
public int getAge()
{
return 10;
}
}

class Monkey extends Animal
{
public int getage()
{
return 20;
}
}

class aaa
{
public int getAge()
{
return 100;
}
}

class Lion
{
public void eat(Animal aa)
{
int x =aa.getAge();
System.out.println(x);
}
}

class zoo
{
final public static Lion sherkhan = new Lion();
}

class eg_to_understand_pointer_working_in_case_of_jvm_pool
{
public static void main(String gg[])
{
Donkey d=new Donkey(); // correct --> jesa pointer ka type ussi type ka object
Monkey m=new Monkey(); // correct
aaa a=new aaa(); // correct

zoo.sherkhan.eat(d);// String g; g="Hello" ; g is a pointer . Map it in your head as  System.out.println(g) => Hello (why address is not printed)

zoo.sherkhan.eat(m);
//zoo.sherkhan.eat(a); // Bhalte ke pointer main bhalte ka address nhi asakta. as Animal aa = a <-- wrong. , so commenting this line.
}
}
