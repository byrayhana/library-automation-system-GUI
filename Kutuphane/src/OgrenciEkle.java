
import static java.lang.System.exit;
import java.sql.*;
import javax.swing.JOptionPane;

public class OgrenciEkle extends javax.swing.JFrame {

    PreparedStatement st = null; 
    Connection con  = null ;
    ResultSet rs = null;
    public OgrenciEkle() {
        initComponents();
        con= connect.connection();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        m_no = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        m_fakulte = new javax.swing.JComboBox<>();
        m_ekle = new javax.swing.JButton();
        m_ad = new javax.swing.JTextField();
        m_soyad = new javax.swing.JTextField();
        m_bolum = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jgeri = new javax.swing.JMenuItem();
        jana = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 234, 186));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 234, 186));

        jPanel2.setBackground(new java.awt.Color(240, 234, 186));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Öğrenci Ekleme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Bölüm:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Fakülte:");

        m_no.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        m_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_noActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Adı:");

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Soyadı:");

        m_fakulte.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        m_fakulte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hukuk", "Eğitim", "Mühendislik ve Doğa Bilimleri", "İnsan ve Toplum Bilimleri" }));
        m_fakulte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_fakulteActionPerformed(evt);
            }
        });

        m_ekle.setBackground(new java.awt.Color(193, 175, 122));
        m_ekle.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        m_ekle.setText("Ekle");
        m_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_ekleActionPerformed(evt);
            }
        });

        m_ad.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        m_soyad.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        m_bolum.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        m_bolum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_bolumActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Öğrenci No:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(m_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(m_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(m_no, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(m_fakulte, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(m_bolum, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(m_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(m_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(m_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_no, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_fakulte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_bolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(m_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 620));

        jMenu1.setText("Kısayollar");

        jMenuItem3.setText("Anasayfa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jgeri.setText("Geri dön");
        jgeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgeriActionPerformed(evt);
            }
        });
        jMenu1.add(jgeri);

        jana.setText("Çıkış");
        jana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janaActionPerformed(evt);
            }
        });
        jMenu1.add(jana);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_noActionPerformed

    private void m_fakulteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_fakulteActionPerformed
         if(m_fakulte.getSelectedItem().equals("Mühendislik ve Doğa Bilimleri")){
             m_bolum.removeAllItems();
       
            m_bolum.addItem("Bilgisayar Mühendisliği");
            m_bolum.addItem("Elektrik Elektronik Mühendisliği");
            m_bolum.addItem("Endüstri Mühendisliği");
            m_bolum.addItem("Gıda Mühendisliği");
            m_bolum.addItem("Moleküler Biyoloji ve Genetik Mühendisliği");
        }
        else if(m_fakulte.getSelectedItem().equals("Eğitim")){
            m_bolum.removeAllItems();
            m_bolum.addItem("İngilizce Öğretmenliği");
            m_bolum.addItem("Arapça Öğretmenliği");
            m_bolum.addItem("Türkçe Öğretmenliği");
            m_bolum.addItem("Matematik Öğretmenliği");
        }
            else if(m_fakulte.getSelectedItem().equals("Hukuk")){
                m_bolum.removeAllItems();
                m_bolum.addItem("Hukuk");
            }
            else if(m_fakulte.getSelectedItem().equals("İnsan ve Toplum Bilimleri")){
                m_bolum.removeAllItems();
                m_bolum.setSelectedItem(null);
                m_bolum.addItem("PDR");
                m_bolum.addItem("Psikoloji");
            }
    }//GEN-LAST:event_m_fakulteActionPerformed

    private void m_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_ekleActionPerformed
        String query="Insert into Ogrenci (Ad,Soyad,NO,Sifre,KullaniciAdi,Fakulte,Bolum,KitapID) values (?,?,?,?,?,?,?,?)";
        try{
            if(m_ad.getText().equals("") || m_soyad.getText().equals("")||m_no.getText().equals("")
                    ||m_fakulte.getItemAt(m_fakulte.getSelectedIndex()).equals("") 
                    ||m_bolum.getItemAt(m_bolum.getSelectedIndex()).equals("")){
                  JOptionPane.showMessageDialog(null,"Gerekli alanları doldurunuz");
            }
            else{
                
            st= con.prepareStatement(query);
            st.setString(1, m_ad.getText());
            st.setString(2, m_soyad.getText());
            st.setString(3, m_no.getText());
            String sifre="@"+m_soyad.getText().toLowerCase().substring(2,4)+3+m_no.getText().substring(1,3)+m_ad.getText().substring(1,3);
            st.setString(4, sifre);
            String kullaniciAdi= m_soyad.getText().toLowerCase()+"."+ m_ad.getText().toLowerCase() +"@kutup.com";
            st.setString(5, kullaniciAdi);
            String f = m_fakulte.getItemAt(m_fakulte.getSelectedIndex());
            st.setString(6,f);
            String b = m_bolum.getItemAt(m_bolum.getSelectedIndex());
            st.setString(7, b);
            st.execute();
            JOptionPane.showMessageDialog(null, "Ekleme başarılı");
            JOptionPane.showMessageDialog(null,"Şifre:\n" + sifre+"\n"+"Kullanıcı Adı:\n"+kullaniciAdi,"Giriş Bilgileri",JOptionPane.INFORMATION_MESSAGE);
            st.close();
            }
        
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ekleme başarısız");
        }
    }//GEN-LAST:event_m_ekleActionPerformed

    private void janaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janaActionPerformed
           exit(0);
    }//GEN-LAST:event_janaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     setVisible(false);
     new Anasayfa().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jgeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgeriActionPerformed
       setVisible(false);
       new YoneticiEkrani().setVisible(true);
    }//GEN-LAST:event_jgeriActionPerformed

    private void m_bolumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_bolumActionPerformed
       
    }//GEN-LAST:event_m_bolumActionPerformed

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
            java.util.logging.Logger.getLogger(OgrenciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jana;
    private javax.swing.JMenuItem jgeri;
    private javax.swing.JTextField m_ad;
    private javax.swing.JComboBox<String> m_bolum;
    private javax.swing.JButton m_ekle;
    private javax.swing.JComboBox<String> m_fakulte;
    private javax.swing.JTextField m_no;
    private javax.swing.JTextField m_soyad;
    // End of variables declaration//GEN-END:variables
}
