class Employee
{
	static String company="i-exceed";
	String name, department, designation;
	int salary;
	Employee() //Default constructor
	{
	    
	    System.out.println("Good morning!");
	}
	
	Employee(String name, String department, String designation, int salary) //Parameterized Constructors --Constructor Overloading
	{
	    this();
		this.name=name;
		this.department=department;
		this.designation=designation;
		this.salary=salary;
		display();
	}
	{ //instantiator block-1 -- excecuted 2nd
	    System.out.println("Welcome to "+company); 
	}
	{//instantiator block-2 -- excecuted 3rd
	    System.out.println("Hope you are good!");
	}
	static{ //static block -- excecuted 1st
	    System.out.println("Welcome to "+Employee.company);
	}
    Employee(String name, String department, String designation)
	{
	    this();
		this.name=name;
		this.department=department;
		this.designation=designation;
		this.salary=20000; //when salary is not given 
		display(); //calling current class method
	}
	{//instantiator block-3 -- excecuted 4th
	    System.out.println("Happy to have you here!" +"\n");
	}
		Employee(String name, String department)
	{
	    this();
		this.name=name; //this keyword
		this.department=department;
		this.designation="designation not given";
		this.salary=0;
		display();
	}
	
	public void display()
	{
	    System.out.println("Name: "+name);
	    System.out.println("Department: "+department);
	    System.out.println("Designation: "+designation);
	    System.out.println("Salary: "+salary);
	    System.out.println("Company: "+company+"\n \n");
	}
	

public static void main(String[] args)
{ 
    //Employee employee1=new Employee();
    Employee employee2=new Employee("XYZ","L&D","SDE",20000);
    //Employee employee3=new Employee("ABC","L&D","SDE");
    //Employee employee4=new Employee("DEF","L&D");
 
    
}
}