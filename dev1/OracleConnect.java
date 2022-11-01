import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class OracleConnect {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html#package.description
        // auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver class via Class.forName

        // register JDBC driver, optional since java 1.6
        /*try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

		// Oracle SID = orcl , find yours in tnsname.ora
        try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@192.168.1.103:1521:O19c", "javaone", "javaone")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
			
			String id, str;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select id, str from t1");
			
			while (rs.next()) {
				id  = rs.getString("id");
				str = rs.getString("str");
				System.out.println("id = " + id + ", str = " + str);
				//System.out.println("Row");
			}
			
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			Statement stmt2 = conn.createStatement();
			/* 
			stmt2.executeUpdate("Create table t2 (id number, str1 varchar2(25))");
			stmt2.executeUpdate("alter table t2 add str2 varchar2(25)");
			*/
			conn.setAutoCommit(false);
			stmt2.executeUpdate("insert into t2 (id, str1, str2) values(4, 'str4', 'str4')");
			conn.rollback();
			stmt2.executeUpdate("insert into t2 (id, str1, str2) values(5, 'str5', 'str5')");
			conn.commit();
			
			
			

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		

    }
}