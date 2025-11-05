interface aaa<T>
{
public void doSomething(T x);
}

class bbb implements aaa<String>
{
public void doSomething(String r)
{
System.out.println(r);
}

}


class generic_interface
{
public static void main(String gg[])
{
bbb b=new bbb();
b.doSomething("Cool");
}
}
