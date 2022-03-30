package week5;

import java.sql.*;

public class DatabaseDriver {
  public static void main(String[] args) {

    String url = "jdbc:sqlite:/Users/keiichikatsuno/Desktop/RMIT/2secondSemYearTwo/AP/sqlite/database/world.db";
    try {
      Connection conn = DriverManager.getConnection(url); 
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * from City"); // Process each column in the result set and print the data while (rs.next()){
      String id = rs.getString("ID");
      String name = rs.getString("Name");
      String countryCode = rs.getString("CountryCode");
      System.out.println(id + ", " + name + ", " + countryCode );
      stmt.close();
      conn.close();
    } catch( SQLException se ) {
      System.out.println("SQLError: " + se.getMessage () + " code: " + se.getErrorCode ());
    }
  }
}

