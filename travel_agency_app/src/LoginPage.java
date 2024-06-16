import java.sql.*;
import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;

public class LoginPage extends javax.swing.JFrame {
    
    private Database db = new Database();

    public LoginPage() {
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {}
        
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sign_in_button = new javax.swing.JButton();
        last_name_field = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(550, 250));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Last Name");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        sign_in_button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sign_in_button.setText("Sign In");
        sign_in_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_in_buttonActionPerformed(evt);
            }
        });

        last_name_field.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        last_name_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                last_name_fieldKeyPressed(evt);
            }
        });

        password_field.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_fieldKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(last_name_field)
                            .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sign_in_button)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(sign_in_button)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sign_in_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_in_buttonActionPerformed
        ResultSet rs;
        
        try{
            String query;
            query = "SELECT *"
                    +"FROM IT_manager JOIN worker ON IT_manager.IT_AT = worker.wrk_AT "
                    +"WHERE IT_password = \'" + password_field.getText() + "\' AND wrk_lname = \'" + last_name_field.getText() + "\';";
            
            rs = db.st.executeQuery(query);
                                   
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "The combination of name and password you inserted does not exist in the system", "Account not found", 0);
            }else{
                String end_date = rs.getString("IT_end_date");
                
                if(rs.wasNull()){
                    this.dispose();
                    new MainPage(rs.getString("wrk_lname")).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "This account is no longer active", "Inactive Account", 0);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_sign_in_buttonActionPerformed

    private void password_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_fieldKeyPressed
        
        char ch = evt.getKeyChar();
        if(ch == '\n')
            sign_in_button.doClick();

    }//GEN-LAST:event_password_fieldKeyPressed

    private void last_name_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_last_name_fieldKeyPressed
        
        char ch = evt.getKeyChar();
        if(ch == '\n')
            sign_in_button.doClick();
        
    }//GEN-LAST:event_last_name_fieldKeyPressed

    
    public static void main(String args[]) {
        new LoginPage().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField last_name_field;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JButton sign_in_button;
    // End of variables declaration//GEN-END:variables
}
