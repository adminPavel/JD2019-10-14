package by.it.yaroshenko.testing;

import java.beans.Statement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Connection {
    void initialDataSetup() throws SQLException {
      //  Statement statement = connection.createStatement();

        String sql = "CREATE TABLE employee ( " +
                "empId INTEGER not null, " +
                "empName VARCHAR(50), " +
                "empCity VARCHAR(50), " +
                "PRIMARY KEY (empId))";

       // statement.execute(sql);

        List<String> sqlQueryList = Arrays.asList(
                "INSERT INTO employee VALUES (1, 'Steve','London')",
                "INSERT INTO employee VALUES (2, 'John','London')",
                "INSERT INTO employee VALUES (3, 'David', 'Sydney')",
                "INSERT INTO employee VALUES (4, 'Kevin','London')",
                "INSERT INTO employee VALUES (5, 'Jade', 'Sydney')");

        for (String query: sqlQueryList) {
       //     statement.execute(query);
        }
    }
    public static void main(String[] args) {

    }
}
