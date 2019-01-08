
public class Manager extends Employee {
	// Instance variable
	static double bonus = 300;
	
	/*
	 * Constructor
	 */
	public Manager(int theID, String theName, String theDepartment, double theSalary)
	{
		super(theID, theName, theDepartment, theSalary);
	}
	
	//-------------------------------------------------------Accessors------------------------------------------------------
    //User super
//--------------------------------------------------------Mutators------------------------------------------------------
    //User super
//---------------------------------------------------------Helpers------------------------------------------------------

	
	//Helper
	@Override
	public double addBonus(double bonus) {
		if(bonus >= 0)
		return (bonus + 300 + this.getSalary());
		else 
			return 0;
	}
	
	//Display method

	public String toString()
	{
		return (getName() + " " + ID + " Department: " + getDepartment() +  " Month Salary with bonus: " + addBonus(bonus) );
	}
	
	

}
