
public class Clerk extends Employee {
	
	// Instance variable
		static double bonus = 200;
		
		/*
		 * Constructor
		 */
		public Clerk(int theID, String theName, String theDepartment, double theSalary)
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
			return bonus + 100 + this.getSalary();
			else 
				return 0;
		}
		
		//Display method

		public String toString()
		{
			return (getName() + " " + ID + " Department: " + getDepartment() +  " Month Salary with bonus: " + this.addBonus(bonus) );
		}
		
}
