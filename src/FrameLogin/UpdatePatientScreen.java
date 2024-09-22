/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameLogin;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import arogyaapp.dao.AppointmentDao;
import arogyaapp.dao.DoctorsDao;
import arogyaapp.dao.PatientDao;
import arogyaapp.dbutil.DBConnection;
import arogyaapp.pojo.AppointmentPojo;
import arogyaapp.pojo.PatientPojo;

/**
 *
 * @author vishal chandravanshi
 */
public class UpdatePatientScreen extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePatientScreen
     */
    String patientName, patientID;
    String opd, doctorId, patientId, age, city,
            address, firstName, lastName, date, phoneNo, marial, gender, fullName;

    private List<String> patientList;
    private List<String> doctorList;

    private Map<String, String> patNameFull;
    java.sql.Date dt;

    public UpdatePatientScreen() {
        initComponents();
        loadDoctorId();
        loadPatietID();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtOPD = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        jcmMStatus = new javax.swing.JComboBox<>();
        jcmbGender = new javax.swing.JComboBox<>();
        jcmbDocId = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        cmbPatientId = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setText("Arogya Application");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -60, 1090, 400));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), " Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("OPD");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DoctorId");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Patient Id");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("AGE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("City ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("First Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("LastName");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Gender");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Date");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Phone No.");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Marial Status");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        txtOPD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtOPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 190, -1));

        txtAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 190, -1));

        txtCity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 190, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 160, -1));

        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 160, -1));

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 160, -1));

        txtPhoneNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 160, -1));

        jcmMStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmMStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "UnMarried", " " }));
        jPanel2.add(jcmMStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 150, -1));

        jcmbGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female", "Other" }));
        jPanel2.add(jcmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 160, -1));

        jcmbDocId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jcmbDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 190, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 190, -1));

        cmbPatientId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbPatientId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPatientIdItemStateChanged(evt);
            }
        });
        jPanel2.add(cmbPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 840, 380));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/icons/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 210, 230));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 630, 210, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, -1, -1));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 680, -1, -1));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 255, 255));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, 1400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        boolean isInputValid = validateInputs();
        if (!isInputValid) {
            JOptionPane.showMessageDialog(null, "please fill all the field first ");
            return;
        }
        boolean validNumber = isNumberValid(phoneNo);
        if (!validNumber) {
            JOptionPane.showMessageDialog(null, "Mobile number is Invalid ");
            return;
        }
        try {

            PatientPojo patient = new PatientPojo();

            patient.setPatient_Id(cmbPatientId.getSelectedItem().toString());
            patient.setDoctor_id(jcmbDocId.getSelectedItem().toString());
            patient.setOpd(opd);
            patient.setAge(Integer.parseInt(age));
            patient.setCity(city);
            patient.setAddress(address);
            patient.setFirst_name(firstName);
            patient.setLast_name(lastName);
            patient.setGender(jcmbGender.getSelectedItem().toString());
            patient.setM_status(jcmMStatus.getSelectedItem().toString());

            
            AppointmentPojo app = new AppointmentPojo();
            app.setPatientId(cmbPatientId.getSelectedItem().toString());
            String docName = DoctorsDao.getDoctorNamebyDoctorId(patient.getDoctor_id());
            app.setDoctorName(docName);
            app.setOpd(opd);
            app.setMobileNo(phoneNo);
            patientName=firstName+" "+lastName;
            app.setPatientName(patientName);

            boolean result = PatientDao.updatePatient(patient);
            boolean result1=AppointmentDao.updateAppointment(app);
            
            if (result &&result1) {
                JOptionPane.showMessageDialog(null, "Patient updated successfully ");
                return;
            }
            JOptionPane.showMessageDialog(null, "Patient is not updated ");
            return;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in DB ");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         ReceptionistOptionFrame fr=new ReceptionistOptionFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
         int ans;
        ans = JOptionPane.showConfirmDialog(null, "Are you sure to Logout", "LOGOUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (ans == JOptionPane.YES_OPTION) {
           
             LoginScrrenn fr=new LoginScrrenn();
            fr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        ReceptionistOptionFrame fr=new ReceptionistOptionFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void cmbPatientIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPatientIdItemStateChanged
        // TODO add your handling code here:

        if (cmbPatientId.getSelectedIndex() == -1) {
            return;
        }
        patientID = cmbPatientId.getSelectedItem().toString();
        try {
            PatientPojo pat = PatientDao.getPatientDetailById(patientID);
            txtOPD.setText(pat.getOpd());
            txtName.setText(pat.getFirst_name());
            txtLastName.setText(pat.getLast_name());

            txtOPD.setText(pat.getOpd());
            txtCity.setText(pat.getCity());
            txtAddress.setText(pat.getAddress());
            txtPhoneNo.setText(pat.getMobile_no());
            int vi = pat.getAge();
            txtAge.setText(String.valueOf(vi));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in DB ");
        }
    }//GEN-LAST:event_cmbPatientIdItemStateChanged

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
            java.util.logging.Logger.getLogger(UpdatePatientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatientScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbPatientId;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcmMStatus;
    private javax.swing.JComboBox<String> jcmbDocId;
    private javax.swing.JComboBox<String> jcmbGender;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOPD;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables

    private void loadPatietID() {

        try {
            patientList = PatientDao.getAllPatientId();
            for (String pat : patientList) {
                cmbPatientId.addItem(pat);

            }

            Date today = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            String dateStr = sdf.format(today);
            txtDate.setText(dateStr);

            //take string return date 
            java.util.Date d1 = sdf.parse(dateStr);
            long ms = d1.getTime();
            dt = new java.sql.Date(ms);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error In DB");
            ex.printStackTrace();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error in Date Conversion ");
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {

        opd = txtOPD.getText().trim();
        age = txtAge.getText().trim();
        city = txtCity.getText().trim();
        address = txtAddress.getText().trim();
        firstName = txtName.getText().trim();
        lastName = txtLastName.getText().trim();
        phoneNo = txtPhoneNo.getText().trim();

        if (opd.isEmpty() || age.isEmpty() || city.isEmpty() || address.isEmpty() || firstName.isEmpty()
                || lastName.isEmpty() || phoneNo.isEmpty()) {
            return false;
        }
        return true;
    }

    private void loadDoctorId() {

        try {
            doctorList = DoctorsDao.getAllDoctorId();
            for (String doc : doctorList) {
                jcmbDocId.addItem(doc);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error In DB");
            e.printStackTrace();
        }
    }

    private boolean isNumberValid(String phoneNo) {

        char[] mob = phoneNo.toCharArray();
        for (char ch : mob) {
            if (Character.isDigit(ch) == false) {
                return false;
            }

        }
        if (phoneNo.length() == 10) {
            return true;
        }
        return false;

    }
}
