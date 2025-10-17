interface aaa
{
public void tom();
}
interface bbb
{
public void sam();
}

interface abc
{
}

interface ppp
{
}

//Normally in Java multiple inheritance is not allowed, below is not inheritance, its just accepting contract or guidelines.
interface ccc extends aaa,bbb,abc /* implements ppp */   //<--  We can extends the contract but not implements 
{
public void cam();
}

class tadeeb implements ccc
{
public void  sam()
{
}
public void  tom()
{ 
}

public void cam()
{
}

}
