package jdbcdemo.employees.console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbcdemo.JdbcTest;
import jdbcdemo.entity.Employees;

public class EmployeesConsole {
	
	private final Connection conn = this.connect();
	
	public  Connection connect() {
       Connection conns = null;
        try {
            conns = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "Simon@143");
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conns;
    }
	
	public void optionToChose() {
		 
		System.out.println("welcome admin:");
		System.out.println("1. add a new Employee");
	    System.out.println("2. see all employee,");
	    System.out.println("3. search an employee");
	    System.out.println("4. delete an employee,");
	    System.out.println("5. update an employee,");
	    
		Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
       
        int opt =Integer.parseInt(option);
		
		switch(opt) {
		case 1:
			Employees emp = new Employees(102, "John", "Doe", "IT", "john@mt.com", 10000.0);
			addEmploye(emp);
			break;
		case 2:
			System.out.println(showAllEmploye()); 
			break;
			default:
				System.out.println("Defualt");
				option = sc.nextLine();
		}
		
	}

	private  int addEmploye(Employees emp) {	
		System.out.println("Add New Employee"); 
		
		System.out.println("Add Employee:");

	       String insertSqlQuery = "INSERT INTO EMPLOYEES (ID,LAST_NAME, FIRST_NAME, EMAIL, DEPARTMENT, SALARY) "
	                + "values(?,?,?,?,?,?)";
	        PreparedStatement pstmt = null;
	        int rowset = 0;
	       try (conn) {
	            pstmt = conn.prepareStatement(insertSqlQuery);
	            pstmt.setInt(1, emp.getId());
	            pstmt.setString(2, emp.getFirst_name());
	            pstmt.setString(3, emp.getLast_name());
	            pstmt.setString(4, emp.getEmail());
	            pstmt.setString(5, emp.getEmail());
	            pstmt.setDouble(6, emp.getSalary());

	           rowset = pstmt.executeUpdate();

	           if (rowset > 0)
	                System.out.println("Employee added succesfulyy");

	       } catch (SQLException e) {
	            System.out.println("Error occured " + e.getMessage());
	        }
	        return rowset;	
		
	}	
	
	private List<Employees> showAllEmploye() {
        System.out.println("View All Employee");
        List<Employees> emps = new ArrayList<>();
        String sql = "SELECT * FROM EMPLOYEES";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try (conn) {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

           while (rs.next()) {
                Employees emp = new Employees(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                		rs.getString(5), rs.getDouble(6));
                emps.add(emp);
           }

       } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }



       return emps;
    }
	
	public static void main(String[] args) {
		EmployeesConsole cons = new EmployeesConsole();
		cons.optionToChose();
	}
	
}
