import java.awt.*;
import java.sql.*;

class CreateAccounts extends Component {
    public boolean registerUser(String userName, String EmailId, String Password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountDetails", "root", "$#r!y@n@0906");
            PreparedStatement Act = con.prepareStatement("select * from userdetails");
            ResultSet rs = Act.executeQuery();
            int accout_no = 0;
            int accGreat = 0;
            while (rs.next()) {
                accout_no = rs.getInt("AccountNo");
                if (accGreat < accout_no){
                    accGreat = accout_no;
                }
            }
            if (accout_no == 0) {
                accGreat = 10001;
            }else {
                accGreat++;
            }
            rs.close();
            Act.close();
            PreparedStatement ps = con.prepareStatement("insert into userdetails value(?,?,?,?,?)");
            ps.setInt(1,accGreat);
            ps.setString(2, userName.toUpperCase());
            ps.setString(3, EmailId);
            ps.setString(4, Password);
            ps.setInt(5,0);
            ps.executeUpdate();
            return true;
        }catch (ClassNotFoundException _){
        } catch (SQLException e) {
            return false;
        }
        return false;
    }
}/*
import java.sql.*;

class CreateAccounts {
    // Utility method to get a database connection
    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/accountDetails", "root", "$#r!y@n@0906");
    }

    public boolean registerUser(String userName, String EmailId, String Password) {
        try (Connection con = getConnection();
             // Using MAX to get the highest AccountNo directly from the database
             PreparedStatement stmt = con.prepareStatement("SELECT MAX(AccountNo) FROM userdetails")) {

            ResultSet rs = stmt.executeQuery();
            int nextAccountNo = 10001;  // Default first account number
            if (rs.next()) {
                int highestAccountNo = rs.getInt(1); // Get the maximum AccountNo
                if (highestAccountNo > 0) {
                    nextAccountNo = highestAccountNo + 1; // Increment for the next account
                }
            }

            // Now insert the new user
            try (PreparedStatement ps = con.prepareStatement("INSERT INTO userdetails (AccountNo, UserName, EmailId, Password, Amount) VALUES (?, ?, ?, ?, ?)")) {
                ps.setInt(1, nextAccountNo);
                ps.setString(2, userName.toUpperCase());  // Convert username to uppercase
                ps.setString(3, EmailId);
                ps.setString(4, Password);
                ps.setInt(5, 0);  // Initial balance set to 0
                ps.executeUpdate();
                return true; // Successful registration
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;  // Registration failed
        }
    }
}
*/