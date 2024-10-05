import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Login extends JFrame {

    private final String Bank_Name = "XYZ Bank";
    private final String Bank_Description = "Welcome";
    private JTextField jTextField1;
    private JPasswordField jPasswordField1;

    public Login() {
        initComponents();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Initialize the components
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JPanel right = new JPanel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();

        // Left panel components
        JPanel left = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        JLabel jLabel3 = new JLabel();
        jPasswordField1 = new JPasswordField();
        JButton jButton1 = new JButton();
        JLabel jLabel4 = new JLabel();
        JButton jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new Dimension(800, 500));

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setPreferredSize(new Dimension(800, 500));
        jPanel1.setLayout(null);

        right.setBackground(new Color(0, 102, 102));
        right.setPreferredSize(new Dimension(400, 500));

        // Improved image loading logic
        URL imageUrl = getClass().getResource("/logo.png"); // Ensure this path is correct
        if (imageUrl != null) {
            jLabel5.setIcon(new ImageIcon(imageUrl));
        } else {
            System.err.println("Resource not found: logo.png");
        }
        jLabel6.setFont(new Font("Showcard Gothic", Font.BOLD, 24));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText(Bank_Name);

        jLabel7.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
        jLabel7.setForeground(new Color(204, 204, 204));
        jLabel7.setText(Bank_Description);

        GroupLayout rightLayout = new GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
                rightLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(rightLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel5) // Center the image label
                                        .addComponent(jLabel6) // Center the bank name label
                                        .addComponent(jLabel7)) // Center the bank description label
                                .addGap(0, 40, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
                rightLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(rightLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel5) // Space above and center image
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6) // Space between image and bank name
                                .addGap(18, 18, 18) // Space between bank name and description
                                .addComponent(jLabel7) // Center the bank description label
                                .addGap(78, 78, 78))
        );


        jPanel1.add(right);
        right.setBounds(0, 0, 400, 500);

        left.setBackground(new Color(255, 255, 255));

        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 36));
        jLabel1.setForeground(new Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel2.setText("Email");

        assert jTextField1 != null;
        jTextField1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jTextField1.setForeground(new Color(102, 102, 102));

        jLabel3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel3.setText("Password");

        assert jPasswordField1 != null;
        jPasswordField1.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        jButton1.setBackground(new Color(0, 102, 102));
        jButton1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(this::loginActionPerformed);

        jLabel4.setText("I don't have an account");

        jButton2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jButton2.setForeground(new Color(255, 51, 51));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        GroupLayout leftLayout = new GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
                leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(138, 138, 138)
                                                .addComponent(jLabel1))
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(27, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.CENTER, leftLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.CENTER, leftLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        leftLayout.setVerticalGroup(
                leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jButton2))
                                .addGap(20, 20, 100))
        );

        jPanel1.add(left);
        left.setBounds(400, 0, 400, 500);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    // Action performed when the Login button is clicked
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        String email = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());

        // Basic login check (hardcoded for now)
        if (checkLogin(email,password)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            try {
                HomePage homePage = new HomePage(); // Assuming you have a SignUp class
                homePage.setEmail(email);
                homePage.setVisible(true);
                homePage.pack();
                homePage.setLocationRelativeTo(null);
                this.dispose(); // Close the login frame
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "SignUp form is not implemented yet.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials. Try again.");
        }
    }

    // Action performed when the Sign-Up button is clicked
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // Ensure the SignUp class exists
        try {
            SignUp signUpFrame = new SignUp(); // Assuming you have a SignUp class
            signUpFrame.setVisible(true);
            signUpFrame.pack();
            signUpFrame.setLocationRelativeTo(null);
            this.dispose(); // Close the login frame
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "SignUp form is not implemented yet.");
        }
    }

    private boolean checkLogin(String email, String password){
        AccountOperations accountOperations = new AccountOperations();
        return accountOperations.verifyAccountDetails(email,password);
    }
}
