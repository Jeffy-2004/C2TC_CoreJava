import java.sql.*;
import java.util.Scanner;
public class Operations 
{
	
	static Scanner read = new Scanner(System.in);
	
	public static int insert() throws Exception 
	{	
		Connection con = DBConnection.dbconnect();
		int emp_id;
		String emp_name,designation,location;
		double salary;
		
		System.out.println("Insert.....");
		System.out.println("Enter Emplyoee Id: ");
		emp_id = read.nextInt();
		System.out.println("Enter Emplyoee Name: ");
		emp_name = read.nextLine();
		System.out.println("Enter Emplyoee's Designation ");
		designation = read.nextLine();
		System.out.println("Enter Salary: ");
		salary = read.nextDouble();
		System.out.println("Enter Location: ");
		location = read.nextLine();
		
		String query="INSERT INTO employee_details VALUES (?,?,?,?,?) ";
	
		PreparedStatement psmt = con.prepareStatement(query);
		psmt.setInt(1, emp_id);
		psmt.setString(2, emp_name);
		psmt.setString(3, designation);
		psmt.setDouble(4, salary);
		psmt.setString(5, location);
		
		int r = psmt.executeUpdate();
		psmt.close();
		con.close();
		System.out.println("Employee inserted successfully.");
		return r;
	}

	public static int delete() throws Exception 
	{
		Connection con = DBConnection.dbconnect();
		int id,r;
		
		System.out.println("Delete.....");
		System.out.println("Enter Emplyoee Id: ");
		id = read.nextInt();
		
		String query = "DELETE FROM employee_details WHERE emp_id = ?";
		
		PreparedStatement psmt = con.prepareStatement(query);
		psmt.setInt(1, id);
		r = psmt.executeUpdate();
		
		psmt.close();
		con.close();
		
		System.out.println("Employee deleted successfully.");
		return r;
	}
	
	public static int update() throws Exception 
	{
		Connection con = DBConnection.dbconnect();
		int id,r,option;
		
		System.out.println("Update.....");
		System.out.println("Enter Emplyoee Id: ");
		id = read.nextInt();
		
		System.out.println("Choose the column you want to update : \n1.Employee Name\n2.Designation\n3.Joined Date\n4.Salary");
		option = read.nextInt();
		read.nextLine(); // Consume newline
		 
		String column = null;
		switch (option) 
		 {
			 case 1:
		 		column = "emp_name";
		 		break;
			 case 2:
				 column = "designation";
				 break;
			 case 3:
		 		column = "salary";
		 		break;
		 	case 4:
		 		column = "location";
		 		break;
		 	default:
		 		System.out.println("Invalid option. Please try again.");
		}
		
		System.out.print("Enter new value: ");
		String newValue = read.nextLine();

		String query = "UPDATE employee_details SET " + column + " = ?WHEREemp_id = ?";
		PreparedStatement psmt = con.prepareStatement(query);

		if (column.equals("salary")) {
		psmt.setDouble(1, Double.parseDouble(newValue));
		} 
		else {
		psmt.setString(1, newValue);
		}

		psmt.setInt(2, id);
		r = psmt.executeUpdate();

		psmt.close();
		con.close();
		System.out.println("Employee updated successfully.");
		return r;
		}

	public static int show() throws Exception 
	{
		Connection con = DBConnection.dbconnect();
		int count,emp_id;
		String emp_name,designation,location;
		double salary;
		
		String query = "SELECT * FROM employee;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		count = 0;
        System.out.println("Employee Details:");
        System.out.println("ID\tName\tDesignation\tSalary\tLocation");
        while (rs.next()) {
            emp_id = rs.getInt("emp_id");
            emp_name = rs.getString("emp_name");
            designation = rs.getString("designation");
            salary = rs.getDouble("salary");
            location = rs.getString("location");
            System.out.println(emp_id + "\t" + emp_name + "\t" + designation + "\t" + salary + "\t" + location);
            count++;
        }
        rs.close();
        stmt.close();
        con.close();
        return count;       
	}
}