class bbbb
{
public int x;
private char y;

public void sheikh()
{
System.out.println("Sheikh saab");
}
private void tadeeb()
{
System.out.println("Kese ho");
}
}

class fff extends bbbb
{
public void ramesh()
{
sheikh(); //correct we can call the method its inheriting bbbb
tadeeb(); // No we can't call a private method as although it inherits all type methods but private method cant be called private.
}
}


interface aaa
{
public void sam();
default public void tom()
{
System.out.println("Hii");
}

// private void sunny();     //private abstract void sunny();  // <-- Both are wrong

private void sunny()       // NOw this is right as we are defining it and we dont need to declare it default like we used to do for public mehods.
{
System.out.println("This is sunny, bana lega money"); 
}

}
