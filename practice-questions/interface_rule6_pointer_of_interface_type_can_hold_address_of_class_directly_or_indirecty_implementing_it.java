interface abc
{
public void sam();
}

class aaa implements abc
{
public void sam()
{
}
}

class bbb extends aaa
{

}

class ccc
{
public void sam()
{

}
}

class interface_rule6_pointer_of_interface_type_can_hold_address_of_class_directly_or_indirecty_implementing_it
{
public static void main(String gg[])
{
aaa a;
bbb b;
ccc c;
abc p;

a = new aaa(); //correct
b=new bbb(); // correct
c = new ccc(); // correct

p = new aaa(); // correct as parent/base class can hold child address
p = new bbb(); // correct , same reason as above
//p = new ccc(); // no-relation between interface and class ccc so error. hence commented this line
}
}
