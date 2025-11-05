class Employee
{
public int id;
public String name;

public void setId(int id)
{
this.id=id;
}

public void setName(String name)
{
this.name=name;
}

public int getId()
{
return this.id;
}

public String getName()
{
return this.name;
}

/* Sol-1 which wont work for all cases

public boolean equals(Employee other)
{
return this.id==other.id;
}
*/

/* Sol-2) which will also not work for all the cases.

public boolean equals(Object other)
{
Employee e=(Employee)other;
return this.id==e.id;
}
*/

public boolean equals(Object other)
{
if(!(other instanceof Employee)) return false;
Employee e=(Employee)other;
return this.id==e.id;
}


}

class moduleA
{
public Employee getEmployee()
{
Employee e=new Employee();
e.setId(101);
e.setName("Sameer");
return e;
}
}

class moduleB
{
public Employee getEmployee()
{
Employee e=new Employee();
e.setId(101);
e.setName("Sameer");
return e;
}
}

class equals_method_for_custom_class
{
public static void main(String gg[])
{
moduleA ma=new moduleA();
moduleB mb=new moduleB();
Employee e1=ma.getEmployee();
Employee e2=mb.getEmployee();

System.out.println("Shallow Comparison: ");
if(e1==e2) System.out.println("Same");
else System.out.println("Different"); 

System.out.printf("\n\n");

System.out.println("Deep Comparison (with custom equals method, Sol-1): ");
if(e1.equals(e2)) System.out.println("Same");
else System.out.println("Different"); 

System.out.printf("\n\n");

System.out.println("Now unexpected behaviour will come as we have not written any relevant equals method: ");
if(e1.equals(101)) System.out.println("Same");
else System.out.println("Different"); 

System.out.println("Now unexpected behaviour will come as we have not written any relevant equals method: ");
if(e1.equals("Sameer")) System.out.println("Same");
else System.out.println("Different"); 

}

}
