/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e.reduce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author user
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
private String userEmail;

    public Profile(String email) {
        this.userEmail = email;
        initComponents();
        
    }
    
    public void setUserEmail(String email) {
        this.userEmail = email;
        
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
        jPanel2 = new javax.swing.JPanel();
        EditProfileBtn = new javax.swing.JToggleButton();
        LogoutBtn = new javax.swing.JToggleButton();
        Category = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        labelnama = new javax.swing.JLabel();
        txtNama = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JLabel();
        labelNohp = new javax.swing.JLabel();
        labelJk = new javax.swing.JLabel();
        txtNohp = new javax.swing.JLabel();
        txtJk = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Profile");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 500));

        EditProfileBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditProfileBtn.setForeground(new java.awt.Color(15, 33, 103));
        EditProfileBtn.setText("Edit Profil");
        EditProfileBtn.setPreferredSize(new java.awt.Dimension(80, 23));
        EditProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setBackground(new java.awt.Color(236, 70, 70));
        LogoutBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setText("Keluar");
        LogoutBtn.setPreferredSize(new java.awt.Dimension(80, 23));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        Category.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Category.setForeground(new java.awt.Color(15, 33, 103));
        Category.setText("Kategori Sampah");
        Category.setPreferredSize(new java.awt.Dimension(80, 23));
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-Reduce");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(105, 105, 105)
                .addComponent(EditProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        labelnama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelnama.setText("Nama                 :");
        labelnama.setMaximumSize(new java.awt.Dimension(90, 16));
        labelnama.setMinimumSize(new java.awt.Dimension(90, 16));

        txtNama.setBackground(new java.awt.Color(51, 153, 255));
        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNama.setText("Nama Panjang");

        labelAlamat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAlamat.setText("Alamat               :");

        txtAlamat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAlamat.setText("Tidak Ada data");

        labelNohp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNohp.setText("No HP                :");

        labelJk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelJk.setText("Jenis Kelamin    :");

        txtNohp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNohp.setText("Tidak Ada data");

        txtJk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtJk.setText("Tidak Ada data");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cetak Data Anda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Selamat Datang,");

        user.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(51, 153, 255));
        user.setText("Nama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelAlamat)
                                    .addGap(25, 25, 25)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelNohp)
                                    .addGap(25, 25, 25)
                                    .addComponent(txtNohp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labelJk)
                                .addGap(25, 25, 25)
                                .addComponent(txtJk, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user)))
                        .addGap(102, 102, 102))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama)
                    .addComponent(labelnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlamat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNohp)
                    .addComponent(txtNohp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJk)
                    .addComponent(txtJk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUser(String name){
        user.setText(name);
        txtNama.setText(name);
    }
        
    public void setAlamat(String alamat){
        txtAlamat.setText(alamat);
        
    }
        
    public void setJk(String jeniskelamin){
        txtJk.setText(jeniskelamin);
    }
    
    public void setNohp(String no_hp){
        txtNohp.setText(no_hp);
    }
    
    
    private void EditProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileBtnActionPerformed
    String name = null, alamat = null, jeniskelamin = null, no_hp = null, passDb, query;
    String SUrl, SUser, SPass;
    int notFound = 0;

    SUrl = "jdbc:MySQL://localhost:3306/java_users_db";
    SUser = "root";
    SPass = "";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        Statement st = con.createStatement();

        query = "SELECT * FROM user WHERE email= '" + userEmail + "' ";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            passDb = rs.getString("password");
            name = rs.getString("name");
            alamat = rs.getString("alamat");
            jeniskelamin = rs.getString("jeniskelamin");
            no_hp = rs.getString("no_hp");
            notFound = 1;
        }

        if (notFound == 1) {
            EditProfile EditProfileFrame = new EditProfile(userEmail);
            
            EditProfileFrame.setUser(name);
            EditProfileFrame.setAlamat(alamat);
            EditProfileFrame.setNohp(no_hp);
            EditProfileFrame.setJk(jeniskelamin);
            
            EditProfileFrame.setVisible(true);
            EditProfileFrame.pack();
            EditProfileFrame.setLocationRelativeTo(null);
            dispose();
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Email atau Password Salah", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }//GEN-LAST:event_EditProfileBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
        Kategori kategoriFrame = new Kategori();
        kategoriFrame.setVisible(true);
        kategoriFrame.pack();
        kategoriFrame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_CategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        // Lokasi laporan
        String reportPath = "src/report/DataUser.jasper";
        
        // Mendapatkan koneksi ke database (sesuaikan dengan detail koneksi Anda)
        String url = "jdbc:mysql://localhost:3306/java_users_db";  // Gantilah dengan URL database Anda
        String user = "root";  // Gantilah dengan username database Anda
        String password = "";  // Gantilah dengan password database Anda
        
        Connection con = DriverManager.getConnection(url, user, password);
        
        // Parameter (jika ada)
        HashMap<String, Object> parameters = new HashMap<>();
        
        // Mengisi laporan dengan data
        JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, con);  // Menambahkan variabel 'con' untuk koneksi
        
        // Menampilkan laporan menggunakan JasperViewer
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);
        
    } catch (Exception e) {  // Menangkap semua jenis exception
        JOptionPane.showMessageDialog(this, "Error displaying report: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);  // Menggabungkan pesan kesalahan dengan e.getMessage()
    }    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Category;
    private javax.swing.JToggleButton EditProfileBtn;
    private javax.swing.JToggleButton LogoutBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelJk;
    private javax.swing.JLabel labelNohp;
    private javax.swing.JLabel labelnama;
    private javax.swing.JLabel txtAlamat;
    private javax.swing.JLabel txtJk;
    private javax.swing.JLabel txtNama;
    private javax.swing.JLabel txtNohp;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    
}
