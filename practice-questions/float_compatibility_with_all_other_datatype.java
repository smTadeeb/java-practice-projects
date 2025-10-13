// Wont Works 
class float_char_compatibility
{
public static void main(String gg[])
{
float f;
char c = 'A';
f=c;
}
}

// Work
class float_float_compatibility          
{
public static void main(String gg[])
{
float f;
float x = 2.3f;
f=x;
}
}

// Wont Works
class float_double_compatibility          
{
public static void main(String gg[])
{
float f;
double d = 2.34;
f=d;
}
}

// Works
class float_byte_compatibility          
{
public static void main(String gg[])
{
float f;
byte b = 23;
f=b;
}
}

// Wont Works
class float_short_compatibility          
{
public static void main(String gg[])
{
float f;
short s = 22;
f=s;
}
}

// Wont Work
class float_int_compatibility          
{
public static void main(String gg[])
{
float f;
int i =234;
f=i;
}
}

//Wont Work
class float_long_compatibility          
{
public static void main(String gg[])
{
float f;
long l = 334;
f=l;
}
}
