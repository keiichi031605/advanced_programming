package week5;

import java.sql.*;
class EmployeeList {
  public static void main(String argv[]) {
    String url = "jdbc:sqlite:/Users/keiichikatsuno/Desktop/RMIT/2secondSemYearTwo/AP/sqlite/database/Company.db";
    try {
      Connection conn = DriverManager.getConnection(url);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * from Employee");

      while (rs.next()) {
        int eno = rs.getInt("ENO");
        String name = rs.getString("NAME");
        System.out.println("Employee's info: " + eno + ": " + name);
      }

    } catch(SQLException se) {
      System.out.println("SQLError: " + se.getMessage () + " code: " + se.getErrorCode ()); 
    } catch(Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}

