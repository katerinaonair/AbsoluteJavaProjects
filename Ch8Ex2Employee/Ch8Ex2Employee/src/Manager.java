
public class Manager extends Employee {
	// Instance variable
	static double bonus = 300;
	int missedDays = 0;
	
	/*
	 * Constructor
	 */
	public Manager(int theID, String theName, String theDepartment, double theSalary, int theMissedDays)
	{
		super(theID, theName, theDepartment, theSalary);
		missedDays = theMissedDays;
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
		return (bonus + 300);
		else 
			return 0;
	}
	
	@Override
	public double calcSalary()
	{
		return getSalary() + addBonus(bonus);
	}
	//Display method

	public String toString()
	{
		return (getName() + " " + ID + " Department: " + getDepartment() +  
				"\nMonth Salary with bonus and missed days: " + calcSalaryWithPermissions(missedDays) +" euro" );
	}
	
	
	/**
     * Helper method to calculate the salary based on the number of days an employee is on leave
     * */
    public double calcSalaryWithPermissions(int missedDays)
    {
        double normalPayPerDay = getSalary()/30;
    	double missDaysPay = missedDays * normalPayPerDay;
        
        return (calcSalary() - missDaysPay);
    }
}
