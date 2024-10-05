import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SignUp extends JFrame {

    private final String Bank_Name = "XYZ Bank";
    private final String Bank_Description = "Register";
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;
    private JTextField jTextField2;

    public SignUp() {
        initComponents();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new SignUp().setVisible(true));
    }

    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JPanel jPanel3 = new JPanel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        JLabel jLabel6 = new JLabel();
        jTextField2 = new JTextField();
        JLabel jLabel7 = new JLabel();
        jPasswordField1 = new JPasswordField();
        JLabel jLabel8 = new JLabel();
        // Variables declaration
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setPreferredSize(new Dimension(800, 500));

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setPreferredSize(new Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new Color(0, 102, 102));

        jLabel1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("logo.png")))); // logo path
        jLabel2.setFont(new Font("Showcard Gothic", Font.PLAIN, 24)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText(Bank_Name);

        jLabel3.setFont(new Font("Segoe UI Light", Font.PLAIN, 14)); // NOI18N
        jLabel3.setForeground(new Color(204, 204, 204));
        jLabel3.setText(Bank_Description);

        GroupLayout rightLayout = new GroupLayout(jPanel2);
        jPanel2.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
                rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) // Center horizontally
                                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.CENTER) // Align components in the center
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(0, 40, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
                rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(78, 78, 78))
        );


        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new Color(255, 255, 255));

        jLabel4.setFont(new Font("Segoe UI", Font.BOLD, 24)); // NOI18N
        jLabel4.setText("SIGN UP");

        jLabel5.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        jLabel5.setText("Full name");

        jTextField1.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        jTextField1.setForeground(new Color(102, 102, 102));

        jLabel6.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        jLabel6.setText("Email");

        jTextField2.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        jTextField2.setForeground(new Color(102, 102, 102));

        jLabel7.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        jLabel7.setText("Password");

        jPasswordField1.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        jPasswordField1.setForeground(new Color(102, 102, 102));

        jLabel8.setText("I've an account");

        jButton1.setBackground(new Color(0, 102, 102));
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setForeground(new Color(255, 51, 51));
        jButton2.setText("Login");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.CENTER, jPanel3Layout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(24, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(130, 130, 130) // Adjust as necessary for horizontal centering
                                .addComponent(jLabel8)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(45, Short.MAX_VALUE)
        );


        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Sign up button event handler
        String fullName = jTextField1.getText();
        String email = jTextField2.getText();
        String password = String.valueOf(jPasswordField1.getPassword());

        if (fullName.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Logic to handle successful sign-up, e.g., save the user data
            if (!email.endsWith("@gmail.com")) {
                JOptionPane.showMessageDialog(this, "Enter Valid Email Address", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                CreateAccounts createAccounts = new CreateAccounts();
                if (createAccounts.registerUser(fullName, email, password)) {
                    JOptionPane.showMessageDialog(this, "Sign-up successful!");
                } else {
                    JOptionPane.showMessageDialog(this, "Email-Id Already registered");
                }
            }

        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // Login button event handler
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }
}
