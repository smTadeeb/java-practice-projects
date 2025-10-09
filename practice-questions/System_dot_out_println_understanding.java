class System_dot_out_println_understanding
{
public static void main(String gg[])
{
System x; // Allowed no error will come as we just created an pointer which can store address of Object of type System
// x=new System();  // Error we can't create an object of System class as its constructor is defined inside a private access specifier. 
System.out.println(System.out); // Allowed as "out" pointer is declared static inside System class and also declared as final.
System.out = 57869; // Error as out pointer is declared final in System class. also we have assigned it an int type value, actually it can hold address of printStream type object. 
}
}
