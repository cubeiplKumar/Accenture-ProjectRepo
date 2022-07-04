package com.java2novice.jdbc;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JdbcConnection {
 
    public static void main(String a[]){
         
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.
                getConnection("jdbc:oracle:thin:@<hostname>:<port num>:<DB name>"
                    ,"user","password");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		#Feature302 changes made by Shivani on 04-July-2022
		public static void sampleMethod(int a, int b) throws ArithmeticException{
        System.out.println("Hello, this is sample method");
        int c = a/b; //  int c = 4/2 which gets calculated as 2 
        System.out.println("c:"+c); // c: 2
   }


		#feature301 changes by Akash on 04-July-2022 
		// reads all data from input.txt
      sourceFile.read(array);

      // writes all data to newFile
      destFile.write(array);
      System.out.println("The input.txt file is copied to newFile.");
    }
}