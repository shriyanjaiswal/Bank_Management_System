import java.sql.*;


public class Main {
    public static void main(String[] args) throws Exception {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "$#r!y@n@0906");
            Statement stmt = conn.createStatement()
        ) {
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS accountDetails");
            stmt.executeUpdate("use accountdetails");
            stmt.executeUpdate("create table if not exists userdetails(AccountNo INT UNSIGNED , Name varchar(30), EmailId varchar(30) primary key, Password varchar(16), Amount int unsigned);");
        } catch (SQLException ignored){}
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
}



