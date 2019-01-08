/*
 * Created by Katerina 8/01/2018
 */
public abstract class Employee {
	// Instance var
	int ID;
	String name, department;
	double salary;
	double bonus = 200;
	
	
	public abstract double calcSalary();
	
	public double addBonus(double bonus)
	{
		return bonus + getSalary();
	}
	/*
	 * Default constructor
	 */
	public Employee()
	{
		ID = 0;
		name = "";
		department = "";
		salary = 0;
	}
	
	/*
	 * Four argument constructor
	 * theID The employee id
	 * theName The name of the employee
	 * theDepartment The department where works
	 * theSalary The salary per month
	 */
	public Employee(int theID, String theName, String theDepartment, double theSalary)
	{
		setID(theID);
		setName(theName);
		setDepartment(theDepartment);	
		setSalary(theSalary);
	}
	
	
	/*
	 * Accessor method to get employee's name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	/*
	 * Accessor method to get employee's department
	 * @return department
	 */
	public String getDepartment()
	{
		return department;
	}
	/*
	 * Accessor method to get employee's salary per month
	 * @return name
	 */
	public double getSalary()
	{
		return salary;
	}
	
	/*
	 * Mutator method to set the employee's name
	 * @newName is not null
	 */
	
	public void setName(String newName)
	{
		if ( newName == null)
		{
			System.out.println("Fatal Error.");
        	System.exit(0);
		}
		else 
			name = newName;
	}
	/*
	 * Mutator method to set the employee's department
	 * @newDept is not null
	 */
	
	public void setDepartment(String newDept)
	{
		if ( newDept == null)
		{
			System.out.println("Fatal Error.");
        	System.exit(0);
		}
		else 
			department = newDept;
	}
	
	/*
	 * Mutator method to set the employee's ID
	 * @id is not null
	 */
	public void setID(int newID)
	{
		if ( newID == 0)
		{
			System.out.println("Fatal Error.");
        	System.exit(0);
		}
		else 
			ID = newID;
	}
	
	/*
	 * Mutator method to set the employee's salary per year / 12
	 * @salary is not null
	 */
	public void setSalary(double newSalary)
	{
		if ( newSalary == 0)
		{
			System.out.println("Fatal Error.");
        	System.exit(0);
		}
		else 
			salary = newSalary;
	}

	public String toString()
	{
		return (name + " " + ID + " Department: " + department +  " Salary: " + salary );
	}
	
	 /**
     * Overloaded equals function to check if two employees are identical (salary in the same department)
     *
     * */
	public boolean equals(Employee otherEmployee)
	{
			return(this.salary == otherEmployee.salary && department.equals(otherEmployee.department));
	}
	
	public double calcPay(double salary, double bonus)
    {
        return (salary + bonus);
}
	
}
