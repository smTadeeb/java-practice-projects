
class aaa
{
public int id=100;

}

class bbb extends aaa
{
//public int id=200000;
public bbb()
{
id=9999;
}

}

class method_lookup_quick_eye
{
public static void main(String gg[])
{
aaa a;
a=new bbb();
System.out.println(a.id);
}
}

