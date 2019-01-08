
public class App {

	public static void main(String[] args) {
		
		Employee employees[] = new Employee[4];
		employees[0] = new Manager(1, "Katya", "Administration", 4000.0, 0);
		employees[1] = new Manager(2, "Artem", "Administration", 4000.0,1);
		employees[2] = new Clerk(3, "Nastya", "Marketing", 3000, 2);
		employees[3] = new Clerk(4, "Pasha", "Marketing", 2800, 0);
		

		//print all
		for(int i =0; i < employees.length; i++)
		{
			System.out.println(employees[i].toString());
		}
			
		// Test to see if two employees have the same salary in the same department
		if(employees[0].equals(employees[1]))
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        if(employees[2].equals(employees[3]))
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        
        
	}

}
