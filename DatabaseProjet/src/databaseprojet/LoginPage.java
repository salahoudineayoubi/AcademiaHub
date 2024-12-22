/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseprojet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.internal.OracleResultSet;

/**
 *
 * @author El Mysto
 */
public class LoginPage extends javax.swing.JFrame 
   {
          Connection conn = null;
          Statement st = null;
          OracleResultSet rs = null;
          PreparedStatement pst = null;
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        error_pane.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        error_pane = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\korus\\OneDrive\\Documents\\NetBeansProjects\\DatabaseProjet\\src\\databaseprojet\\Icons\\icons8-close-window-30.png")); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\korus\\OneDrive\\Documents\\NetBeansProjects\\DatabaseProjet\\src\\databaseprojet\\Icons\\icons8-right-arrow-100-2.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\korus\\OneDrive\\Documents\\NetBeansProjects\\DatabaseProjet\\src\\databaseprojet\\Icons\\icons8-customer-100.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 80));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\korus\\OneDrive\\Documents\\NetBeansProjects\\DatabaseProjet\\src\\databaseprojet\\Icons\\orange.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 190, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\korus\\OneDrive\\Documents\\NetBeansProjects\\DatabaseProjet\\src\\databaseprojet\\Icons\\UP2.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 600, 260));

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 280, 50));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\korus\\OneDrive\\Documents\\NetBeansProjects\\DatabaseProjet\\src\\databaseprojet\\Icons\\button.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 340, 70));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 100, -1));

        user_id.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        user_id.setBorder(null);
        user_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                user_idKeyReleased(evt);
            }
        });
        jPanel1.add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 170, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 170, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 170, 10));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Username :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 100, -1));

        error_pane.setBackground(new java.awt.Color(255, 255, 255));
        error_pane.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Please enter a valid username and password !");

        javax.swing.GroupLayout error_paneLayout = new javax.swing.GroupLayout(error_pane);
        error_pane.setLayout(error_paneLayout);
        error_paneLayout.setHorizontalGroup(
            error_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(error_paneLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        error_paneLayout.setVerticalGroup(
            error_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(error_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(error_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 360, 40));

        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 170, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 480, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:
        
        try{
                if(user_id.getText().equals("BDDAdmin")&&password.getText().equals("TPAdmin")){
                  Class.forName("oracle.jdbc.OracleDriver");
                  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",user_id.getText(),password.getText());
                     st = conn.createStatement();
                  new HomeAdmin().setVisible(true);
                  this.hide();
                }
                
                if(user_id.getText().equals("Etudiant")&&password.getText().equals("TPEtudiant")){
                  Class.forName("oracle.jdbc.OracleDriver");
                  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",user_id.getText(),password.getText());
                  st = conn.createStatement();
                  new LoginEtudiant().setVisible(true);
                  this.hide();
                }
                
                if(user_id.getText().equals("Enseignant")&&password.getText().equals("TPEnseignant")){
                  Class.forName("oracle.jdbc.OracleDriver");
                  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",user_id.getText(),password.getText());
                  st = conn.createStatement();
                  new LoginEnseignant().setVisible(true);
                  this.hide();
                }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
                
               
            

            

    }//GEN-LAST:event_LoginMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        if(!password.getText().equals("")&&(!user_id.getText().equals(""))){
            error_pane.setVisible(false);
            Login.setForeground(new Color (255,255,255));
        }
        /************* turn green when its correct **********/
        conn = JavaConnectDb.ConnecrDb();
        try{
            
            String sql = "select * from users where username=? and password=?";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,user_id.getText());
            pst.setString(2,password.getText());
            rs = (OracleResultSet) pst.executeQuery();

           
           //LoginEnseignant c = new LoginEnseignant ();
            if(rs.next()){
                if(user_id.getText().equals("BDDAdmin")&&password.getText().equals("TPAdmin")){
                  
                  Login.setForeground(new Color (0,255,0));
                }
                
                
                if(user_id.getText().equals("Etudiant")&&password.getText().equals("TPEtudiant")){
                  
                  Login.setForeground(new Color (0,255,0));
                }
                
                
                if(user_id.getText().equals("Enseignant")&&password.getText().equals("TPEnseignant")){
                  
                  Login.setForeground(new Color (0,255,0));
                }
            }
        }catch(Exception e){
                        
                        }
        
        
        
    }//GEN-LAST:event_passwordKeyReleased

    private void user_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_idKeyReleased
        // TODO add your handling code here:
        if(!user_id.getText().equals("")){
            error_pane.setVisible(false);
            Login.setForeground(new Color (255,255,255));
        }
       
        /************* turn green when its correct **********/
        conn = JavaConnectDb.ConnecrDb();
        try{
            
            String sql = "select * from users where username=? and password=?";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,user_id.getText());
            pst.setString(2,password.getText());
            rs = (OracleResultSet) pst.executeQuery();

           
           //LoginEnseignant c = new LoginEnseignant ();
            //LoginEnseignant c = new LoginEnseignant ();
            if(rs.next()){
                if(user_id.getText().equals("BDDAdmin")&&password.getText().equals("TPAdmin")){
                  
                  Login.setForeground(new Color (0,255,0));
                }
                
                
                if(user_id.getText().equals("Etudiant")&&password.getText().equals("TPEtudiant")){
                  
                  Login.setForeground(new Color (0,255,0));
                }
                
                
                if(user_id.getText().equals("Enseignant")&&password.getText().equals("TPEnseignant")){
                  
                  Login.setForeground(new Color (0,255,0));
                }
            }
        }catch(Exception e){
                        
                        }
        
    }//GEN-LAST:event_user_idKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JPanel error_pane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user_id;
    // End of variables declaration//GEN-END:variables
}
