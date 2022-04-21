package JDBC;

import java.sql.*;

public class JDBCIntro {

    /*
    to be able to connect to JDBC we need:
    = CONNECTION --> it will connect us to database, allow us to enter our credentials
    = STATEMENT --> we define our conditions to get result form db.
    = RESULTSET---> we store the data from db to java object
    three of the above are interfaces in java which come from jdbs dependency
     */

    // Connection & driver come from fava.sql
    public static void main(String[] args) throws SQLException {

        Connection  connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@myfirstsql.czjuqxxbetmv.us-east-2.rds.amazonaws.com:1521/ORCL",
                "aigul1",
                "Georgia2021"   // I got these info from the oracle sql developer where we did codings
        );
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from employees");
        //the part below will return true if there is a  next row, otherwise it will return false
        resultSet.next();
        System.out.println(resultSet.getString("first_name"));
        //using GET STRING we can get our column value from the row we are in
        System.out.println(resultSet.getRow());
        resultSet.next();
        System.out.println(resultSet.getRow());
        // if we want ot go to the last row we could use resultSet.last() method
        resultSet.last();
        System.out.println(resultSet.getString("first_name"));
        resultSet.first(); // THIS WILL TAKE THE ROW AS FIRST
        System.out.println(resultSet.getString("first_name"));
        // resultSet.deleteRow(); this will delete the first row

        // METADATA
        ResultSetMetaData rsetMetaData = resultSet.getMetaData();
        // I want to see the count of the columns for my table
        System.out.println(rsetMetaData.getColumnCount());
        System.out.println(rsetMetaData.getColumnName(1)); // it gives column name is upperCase

        // print all the column names from Employees table
        for (int i=1; i<rsetMetaData.getColumnCount(); i++){
            System.out.println(rsetMetaData.getColumnName(i));
            System.out.println("tes");
            System.out.println("test2");
            System.out.println("test3");
            
        }
    }

}
