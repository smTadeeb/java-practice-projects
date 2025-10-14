//Works 
class char_char_compatibility
{
public static void main(String gg[])
{
char c;
char x = 'A';
c=x;
}
}

//Wont Work
class char_float_compatibility          
{
public static void main(String gg[])
{
char c;
char f = 2.35f;
c=f;
}
}

// Wont Works
class char_double_compatibility          
{
public static void main(String gg[])
{
char c;
double d = 2.34;
c=d;
}
}

// Wont Works
class char_byte_compatibility          
{
public static void main(String gg[])
{
char c;
byte b = 23;
c=b;
}
}

// Wont Works
class char_short_compatibility          
{
public static void main(String gg[])
{
char c;
short s = 23;
c=s;
}
}

// Wont Work
class char_int_compatibility          
{
public static void main(String gg[])
{
char c;
int i =234;
c=i;
}
}

//Wont Work
class char_long_compatibility          
{
public static void main(String gg[])
{
char c;
long l = 334;
c=l;
}
}
