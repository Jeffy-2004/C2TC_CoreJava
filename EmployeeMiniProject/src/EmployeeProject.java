import java.util.Scanner;
import java.lang.*;

public class EmployeeProject {

	public static void main(String[] args) throws Exception 
	{
		try {
			Scanner read = new Scanner(System.in);
		
			 while (true) {
				 System.out.println("Employee Management System \n\t 1. Insert Employee \n\t 2. Delete Employee \n\t 3. Update Employee \n\t 4. Show Employee \n\t 5. Exit");
				
				 System.out.print("Choose an option: ");
				 int option = read.nextInt();
				 
				 switch (option) {
				 	case 1:
				 		Operations.insert();
				 		break;
				 	case 2:
				 		Operations.delete();
				 		break;
				 	case 3:
				 		Operations.update();
				 		break;
				 	case 4:
				 		Operations.show();
				 		break;
				 	case 5:
				 		System.out.println("Exiting...");
				 		read.close();
				 		return;
				 	default:
					 System.out.println("Invalid option. Please try again.");
				 }
			 }
		 } 
		catch (Exception e) 
		{
			 e.printStackTrace();
			}
		
	}

}
