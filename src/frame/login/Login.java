
package frame.login;

import connection.Koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Mhs;
import util.FrameSetting;

/**
 *
 * @author Fadhilah
 */
public class Login extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    String qry;
    
    public Login() {
        initComponents();
        FrameSetting.setFrame(this);
        jPanel3.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edUserAdmin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        edPassAdmin = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        lbExit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        eNpm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edPassMhs = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lbLoginAdmin = new javax.swing.JLabel();
        lbLoginMhs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 178, 115));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Login Admin");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 400, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 178, 115));
        jLabel4.setText("Username");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        edUserAdmin.setBackground(new java.awt.Color(246, 248, 246));
        edUserAdmin.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        edUserAdmin.setForeground(new java.awt.Color(102, 102, 102));
        edUserAdmin.setText("Enter Username");
        edUserAdmin.setBorder(null);
        edUserAdmin.setOpaque(false);
        edUserAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edUserAdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edUserAdminFocusLost(evt);
            }
        });
        jPanel3.add(edUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 300, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 300, 10));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 178, 115));
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        edPassAdmin.setBackground(new java.awt.Color(246, 248, 246));
        edPassAdmin.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        edPassAdmin.setForeground(new java.awt.Color(102, 102, 102));
        edPassAdmin.setText("password");
        edPassAdmin.setBorder(null);
        edPassAdmin.setOpaque(false);
        edPassAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edPassAdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edPassAdminFocusLost(evt);
            }
        });
        jPanel3.add(edPassAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 300, 20));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 300, 10));

        lbExit.setForeground(new java.awt.Color(255, 51, 255));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/button/btn_exit_login.png"))); // NOI18N
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        jPanel3.add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 60, 60));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Login Mahasiswa");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 420, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NPM");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        eNpm.setBackground(new java.awt.Color(27, 178, 115));
        eNpm.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        eNpm.setForeground(new java.awt.Color(230, 230, 230));
        eNpm.setText("Enter NPM");
        eNpm.setBorder(null);
        eNpm.setOpaque(false);
        eNpm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eNpmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eNpmFocusLost(evt);
            }
        });
        jPanel3.add(eNpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 300, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        edPassMhs.setBackground(new java.awt.Color(27, 178, 115));
        edPassMhs.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        edPassMhs.setForeground(new java.awt.Color(230, 230, 230));
        edPassMhs.setText("password");
        edPassMhs.setBorder(null);
        edPassMhs.setOpaque(false);
        edPassMhs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edPassMhsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edPassMhsFocusLost(evt);
            }
        });
        jPanel3.add(edPassMhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 300, 20));

        jSeparator3.setBackground(new java.awt.Color(230, 230, 230));
        jSeparator3.setForeground(new java.awt.Color(230, 230, 230));
        jSeparator3.setAlignmentX(1.0F);
        jSeparator3.setAlignmentY(1.0F);
        jSeparator3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSeparator3.setPreferredSize(new java.awt.Dimension(2, 4));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 300, 10));

        jSeparator4.setBackground(new java.awt.Color(230, 230, 230));
        jSeparator4.setForeground(new java.awt.Color(230, 230, 230));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 300, 10));

        lbLoginAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLoginAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/button/btn_login_admin.png"))); // NOI18N
        lbLoginAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginAdminMouseClicked(evt);
            }
        });
        jPanel3.add(lbLoginAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 300, 60));

        lbLoginMhs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLoginMhs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/button/btn_login_mhs.png"))); // NOI18N
        lbLoginMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginMhsMouseClicked(evt);
            }
        });
        jPanel3.add(lbLoginMhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 310, 60));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/form/login_admin.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 430, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/form/login_mhs.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 440, 370));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/form/shadow_form_login.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 920, 440));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edUserAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edUserAdminFocusGained
        // TODO add your handling code here:
        if (edUserAdmin.getText().equals("Enter Username")) {
            edUserAdmin.setText("");
        }
    }//GEN-LAST:event_edUserAdminFocusGained

    private void edUserAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edUserAdminFocusLost
        // TODO add your handling code here:
        if (edUserAdmin.getText().equals("")) {
            edUserAdmin.setText("Enter Username");
        }
    }//GEN-LAST:event_edUserAdminFocusLost

    private void edPassAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edPassAdminFocusGained
        // TODO add your handling code here:
        if (edPassAdmin.getText().equals("password")) {
            edPassAdmin.setText("");
        }
    }//GEN-LAST:event_edPassAdminFocusGained

    private void edPassAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edPassAdminFocusLost
        // TODO add your handling code here:
        if (edPassAdmin.getText().equals("")) {
            edPassAdmin.setText("password");
        }
    }//GEN-LAST:event_edPassAdminFocusLost

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void eNpmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eNpmFocusGained
        // TODO add your handling code here:
        if (eNpm.getText().equals("Enter NPM")) {
            eNpm.setText("");
        }
    }//GEN-LAST:event_eNpmFocusGained

    private void eNpmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eNpmFocusLost
        // TODO add your handling code here:
        if (eNpm.getText().equals("")) {
            eNpm.setText("Enter NPM");
        }
    }//GEN-LAST:event_eNpmFocusLost

    private void edPassMhsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edPassMhsFocusGained
        // TODO add your handling code here:
        if (edPassMhs.getText().equals("password")) {
            edPassMhs.setText("");
        }
    }//GEN-LAST:event_edPassMhsFocusGained

    private void edPassMhsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edPassMhsFocusLost
        // TODO add your handling code here:
        if (edPassMhs.getText().equals("")) {
            edPassMhs.setText("password");
        }
    }//GEN-LAST:event_edPassMhsFocusLost

    private void lbLoginMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginMhsMouseClicked
        // TODO add your handling code here:
        try{
            con = Koneksi.getKoneksi();
            st = con.createStatement();
            
            qry = "SELECT * FROM mhs WHERE npm='" + eNpm.getText() + "' AND password='" + edPassMhs.getText() + "'";                
            rs = st.executeQuery(qry);
            
            if(rs.next()){
                Mhs mhs = new Mhs(rs.getInt("id_mhs"), rs.getString("npm"), rs.getString("nama"));
                new frame.mahasiswa.MenuUtamaMhs(mhs).setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "NPM dan password yang anda masukkan salah!","Error",JOptionPane.ERROR_MESSAGE);
            }        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Login gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lbLoginMhsMouseClicked

    private void lbLoginAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginAdminMouseClicked
        // TODO add your handling code here:
        try{
            con = Koneksi.getKoneksi();
            st = con.createStatement();
            
            qry = "SELECT * FROM admin WHERE username='" + edUserAdmin.getText() + "' AND password='" + edPassAdmin.getText() + "'";                
            rs = st.executeQuery(qry);
            
            if(rs.next()){
                new frame.admin.MenuUtama().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Username dan password yang anda masukkan salah!","Error",JOptionPane.ERROR_MESSAGE);
            }        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Login gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lbLoginAdminMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eNpm;
    private javax.swing.JPasswordField edPassAdmin;
    private javax.swing.JPasswordField edPassMhs;
    private javax.swing.JTextField edUserAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbLoginAdmin;
    private javax.swing.JLabel lbLoginMhs;
    // End of variables declaration//GEN-END:variables
}