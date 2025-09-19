// Two errors will come, one for not initialising x and other is rule-assignment of local variable. i.e. declared and accessed without assignmnet in all logical paths
class aaa
{
final private int x;
aaa()
{
x=100;
}
aaa(int x)
{
this.x=20;
System.out.println(x);
//x=100;
}
}
