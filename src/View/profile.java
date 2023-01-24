package View;
import Controller.ProfileController;
import java.awt.Image;
//import java.awt.Image;
import java.io.*;
//import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
//import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import model.Student;

public class profile extends javax.swing.JFrame {
    
    
//        File f = null;
//        String path = null;
//        private ImageIcon format = null;
//        String fname = null;
//        int s = 0;
//        byte[] pimage = null;
        JFileChooser file;
        static String username;
        static String email;
        static String contact;
        static int id;
        static String imagePath;

       public profile() {
        initComponents();
//        Connect();
    }
       public profile(String username,String email,String contact ,int id) {
        initComponents();
//        Connect();
        this.username=username;
        this.email=email;
        this.contact=contact;
        this.id=id;
    }
//Connection con;
//PreparedStatement pst;
//ResultSet rs;
//    public void Connect(){
//           try {
//               Class.forName("com.mysql.cj.jdbc.Driver");
//               con = DriverManager.getConnection(
//
//                    "jdbc:mysql://db4free.net:3306/jewelspots","jewelspots","jewelspots");
//           } catch (ClassNotFoundException ex) {
//               Logger.getLogger(profile.class.getName()).log(Level.SEVERE, null, ex);
//           } catch (SQLException ex) {
//               Logger.getLogger(profile.class.getName()).log(Level.SEVERE, null, ex);
//           }
//    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        updateprofile = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userinfo = new javax.swing.JTextField();
        contactinfo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailinfo = new javax.swing.JTextField();
        labelimage = new javax.swing.JLabel();
        profileimage = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateprofile.setBackground(new java.awt.Color(0, 102, 255));
        updateprofile.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        updateprofile.setText("Update");
        updateprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateprofileActionPerformed(evt);
            }
        });
        jPanel1.add(updateprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("UserName:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 62, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Contact:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 50, 20));

        userinfo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        userinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userinfoActionPerformed(evt);
            }
        });
        jPanel1.add(userinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, -1));

        contactinfo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        contactinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactinfoActionPerformed(evt);
            }
        });
        jPanel1.add(contactinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 50, 20));

        emailinfo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        emailinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailinfoActionPerformed(evt);
            }
        });
        jPanel1.add(emailinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 150, -1));

        labelimage.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\projectimage\\profilepic.png")); // NOI18N
        jPanel1.add(labelimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, 80));

        profileimage.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        profileimage.setText("Edit Profile");
        profileimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileimageActionPerformed(evt);
            }
        });
        jPanel1.add(profileimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\projectimage\\backimage-removebg-preview.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\projectimage\\dashboardimage.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void userinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userinfoActionPerformed
        // TODO add your handling code here:
        Student student = new Student();
        userinfo.setText(student.getusername(username));
        
    }//GEN-LAST:event_userinfoActionPerformed

    private void contactinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactinfoActionPerformed

    private void emailinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailinfoActionPerformed

    private void updateprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateprofileActionPerformed
        // TODO add your handling code here:
        ProfileController profile=new ProfileController();
        profile.updateprofilemod(id, userinfo.getText(), emailinfo.getText(), contactinfo.getText());
        JOptionPane.showMessageDialog(this,"Updated Successfully!!");
    }//GEN-LAST:event_updateprofileActionPerformed

    private void profileimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileimageActionPerformed
            // TODO add your handling code here:
            //Code for getting directory of image using jfilechooser and converting into store then storing in database
        file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int r = file.showOpenDialog(null);
        
        
     if (r == JFileChooser.APPROVE_OPTION) {
    
    File selectedFile = file.getSelectedFile();
    String image=String.valueOf(selectedFile);
    String[] arr=new String[image.length()];
    String updatedImage="";    //update the image using the following code or for loop
        for(int i=0;i<=image.length()-1;i++){
            if(image.charAt(i)=='\\'){
                arr[i]="/";
            }else{
              arr[i]=String.valueOf(image.charAt(i));
            }
            updatedImage+=arr[i];
            
        }
        setImage();
          imagePath = updatedImage;
        

    int Id=id;
    
    ProfileController tc = new ProfileController();
    int updateImage=tc.insertImage(Id, updatedImage);
    if(updateImage>0){
        JOptionPane.showMessageDialog(null,"Image Updated");
    }
    else{
        JOptionPane.showMessageDialog(null,"Error, please try again.");

    }
            }
    }//GEN-LAST:event_profileimageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Dashbord das = new Dashbord();
        das.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile(username,contact,email,id).setVisible(true);
                userinfo.setText(username);
}
    
        });
    }
    public static void SettingText(){
        userinfo.setText(username);
        emailinfo.setText(email);
        contactinfo.setText(contact);
        
    }
    public void setImage(){
        ProfileController pc = new ProfileController();
        ImageIcon ii = new ImageIcon(pc.getImage(id));
                Image img = ii.getImage().getScaledInstance(100,75,Image.SCALE_SMOOTH);
                labelimage.setIcon(new ImageIcon(img));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField contactinfo;
    public static javax.swing.JTextField emailinfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelimage;
    private javax.swing.JButton logout;
    private javax.swing.JButton profileimage;
    private javax.swing.JButton updateprofile;
    public static javax.swing.JTextField userinfo;
    // End of variables declaration//GEN-END:variables
}
