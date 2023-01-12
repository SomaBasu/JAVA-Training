package com.java.guest;
import java.sql.*;
import java.util.List;

public class RunApp {
	
	private static Connection con = null;
	
	private static void getAllGuests() throws SQLException {

        PreparedStatement pstmt = con.prepareStatement("select * from guest");
        ResultSet rs = pstmt.executeQuery();
                    while (rs.next())
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + "  " + rs.getString(5) + " " + rs.getString(6));
    }

    private static void getAllGuestsByName(String name) throws SQLException {
        try {

            PreparedStatement pstmt = con.prepareStatement("select * from guest where name = ?");
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next())
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + "  " + rs.getString(5) + " " + rs.getString(6));

        } catch (SQLException ex){
            ex.printStackTrace();
        }finally {
            con.close();
        }
    }

	public static void main(String[] args) throws SQLException {
		try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customer-app", "root", "DataGuard432$");
            if(con!=null){
                System.out.println("Success");
            }
            getAllGuests();
            getAllGuestsByName("aa");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            con.close();
        }

	}

}
