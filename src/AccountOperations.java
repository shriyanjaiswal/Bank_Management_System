import java.sql.*;

public class AccountOperations {
    // Utility method to get a database connection
    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/accountdetails", "root", "$#r!y@n@0906");
    }

    public boolean verifyAccountDetails(String ID, String Password) {
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM userDetails WHERE EmailId = ? AND Password = ?")) {
            stmt.setString(1, ID);
            stmt.setString(2, Password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();  // If a record is found, return true
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void depositMoney(String account, int amount) {
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement("UPDATE userDetails SET Amount = Amount + ? WHERE EmailId = ?")) {
            stmt.setInt(1, amount);
            stmt.setString(2, account);
            stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean withdrawMoney(String account, int amount) {
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT Amount FROM userDetails WHERE EmailId = ?")) {
            stmt.setString(1, account);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int currentAmount = rs.getInt("Amount");
                if (currentAmount < amount) {
                    return false; // Not enough balance
                }
                try (PreparedStatement updateStmt = con.prepareStatement("UPDATE userDetails SET Amount = Amount - ? WHERE EmailId = ?")) {
                    updateStmt.setInt(1, amount);
                    updateStmt.setString(2, account);
                    updateStmt.executeUpdate();
                }
            }
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean transferMoney(int senderAccount, int receiverAccount, int amount, int balance) {
        if (amount > balance) {
            System.out.println("------------------------------");
            return true; // Not enough balance
        }

        try (Connection con = getConnection()) {
            con.setAutoCommit(false); // Enable transaction management

            // Deduct money from sender
            try (PreparedStatement senderStmt = con.prepareStatement("UPDATE userDetails SET Amount = Amount - ? WHERE AccountNo = ?")) {
                senderStmt.setInt(1, amount);
                senderStmt.setInt(2, senderAccount);
                senderStmt.executeUpdate();
            }

            // Add money to receiver
            try (PreparedStatement receiverStmt = con.prepareStatement("UPDATE userDetails SET Amount = Amount + ? WHERE AccountNo = ?")) {
                receiverStmt.setInt(1, amount);
                receiverStmt.setInt(2, receiverAccount);
                receiverStmt.executeUpdate();
            }

            con.commit(); // Commit transaction
            return false;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
