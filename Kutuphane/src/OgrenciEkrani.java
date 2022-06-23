
import static java.lang.System.exit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class OgrenciEkrani extends javax.swing.JFrame {

    PreparedStatement ps,ps1 = null; 
    Connection con  = null ;
    ResultSet rs=null;
    int row;
    String ogrenciNO,Kitap,adet;
    DefaultTableModel model1;
 
    public OgrenciEkrani() {
        initComponents();
         con= connect.connection();
       
       
    }
      public OgrenciEkrani(String id) {
        initComponents();
        con= connect.connection();
        ogrenciNO=id; 
        try{
               String sql="Select * from Ogrenci where NO='"+id+"'";
          Statement st=con.createStatement();
            rs=st.executeQuery(sql);
             if(rs.next()){
                 karsilama_label.setText("Merhaba "+rs.getString("Ad"));
                 }
        }
        catch(Exception e ){
            System.out.println("olmadı..");
        }
     
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        m_ara = new javax.swing.JTextField();
        kitapAdiLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        m_tablo = new javax.swing.JTable();
        m_temizle = new javax.swing.JButton();
        m_araButton = new javax.swing.JButton();
        m_al = new javax.swing.JButton();
        karsilama_label = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("f");

        jPanel1.setBackground(new java.awt.Color(240, 234, 186));

        jPanel3.setBackground(new java.awt.Color(240, 234, 186));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kitap Alma ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 24))); // NOI18N

        kitapAdiLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        kitapAdiLabel.setText("Kitap Adı:");

        m_tablo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        m_tablo.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        m_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KitapID", "Kitap Adı", "Yazar", "Durumu"
            }
        ));
        m_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(m_tablo);

        m_temizle.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        m_temizle.setText("Temizle");
        m_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_temizleActionPerformed(evt);
            }
        });

        m_araButton.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        m_araButton.setText("Kitap Ara");
        m_araButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_araButtonActionPerformed(evt);
            }
        });

        m_al.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        m_al.setText("Kitabı Al");
        m_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_alActionPerformed(evt);
            }
        });

        karsilama_label.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 18)); // NOI18N
        karsilama_label.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                karsilama_labelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m_al, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(kitapAdiLabel)
                            .addGap(42, 42, 42)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(m_araButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(m_temizle))
                                .addComponent(m_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(54, 54, 54))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karsilama_label, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karsilama_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m_araButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kitapAdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(m_al)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 250, 255));

        jMenu1.setText("Kısayollar");

        jMenuItem1.setText("Anasayfa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Çık");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setVisible(false);
        new Anasayfa().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void m_araButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_araButtonActionPerformed
            
        try{
          String aranan=m_ara.getText();
          String sql="select * from Kitap where KitapAdi ='"+aranan+"' or Yazar='"+aranan+"'"; 
          Statement st=con.createStatement();
          rs=st.executeQuery(sql);
            if(rs.next()){
                    if(rs.getString("Yazar").equals(aranan)){
                    
                        while(rs.next()){
                             String kitap=rs.getString("KitapAdi");
                             String yazar=rs.getString("Yazar");
                             String id=rs.getString("ID");
                             Kitap=id;
                             String tbData[]={id,yazar,kitap};
                             DefaultTableModel tblModel=(DefaultTableModel)m_tablo.getModel();
                             tblModel.addRow(tbData);
                        }
                    }
                    else{
             
             String kitap=rs.getString("KitapAdi");
             String yazar=rs.getString("Yazar");
             String id=rs.getString("ID");
             String Adet=rs.getString("Adet");
             Kitap=id;
             adet=Adet;
             String tbData[]={id,yazar,kitap,Adet};
             DefaultTableModel tblModel=(DefaultTableModel)m_tablo.getModel();
             tblModel.addRow(tbData);
                    }
             }
            else{
               JOptionPane.showMessageDialog(null,"Kitap Bulunamadı");

            }
            
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Bağlantı kurulamadı");
        }
        finally{
            try{
           rs.close();
           ps.close();
        }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_m_araButtonActionPerformed

    private void m_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_temizleActionPerformed
        m_ara.setText("");
    }//GEN-LAST:event_m_temizleActionPerformed

    private void m_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_alActionPerformed
       try{
          int i=Integer.parseInt(adet);
            String sql="SELECT * FROM Kitap WHERE ID='"+ Kitap+"'";
            Statement st=con.createStatement();
            rs=st.executeQuery(sql);
            System.out.println(rs.getString("Adet"));
         if(rs.getString("Adet").equals("0")){
             JOptionPane.showMessageDialog(null,"Kitap şu an stokta değil, daha sonra tekrar deneyin","Hata",JOptionPane.WARNING_MESSAGE);
         }
         else{
          --i;
           sql="UPDATE Ogrenci SET KitapID= '"+Kitap+"' WHERE NO= '" +ogrenciNO+"'";
          ps=con.prepareStatement(sql);   
          ps.execute();
          System.out.println("1");
          sql="UPDATE Kitap SET Adet= '"+i+"' WHERE ID= '" +Kitap+"'";
          System.out.println("1");
          ps1=con.prepareStatement(sql);   
          ps1.execute();
          JOptionPane.showMessageDialog(null,"Kitap alma işlemi başarılı");
        }
       }
        catch(Exception e){
            System.out.println("olmadı");
        } 
    }//GEN-LAST:event_m_alActionPerformed

    private void m_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_tabloMouseClicked
        row=m_tablo.getSelectedRow();
        model1=(DefaultTableModel)m_tablo.getModel();
    }//GEN-LAST:event_m_tabloMouseClicked

    private void karsilama_labelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_karsilama_labelAncestorAdded
      
    }//GEN-LAST:event_karsilama_labelAncestorAdded

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel karsilama_label;
    private javax.swing.JLabel kitapAdiLabel;
    private javax.swing.JButton m_al;
    private javax.swing.JTextField m_ara;
    private javax.swing.JButton m_araButton;
    private javax.swing.JTable m_tablo;
    private javax.swing.JButton m_temizle;
    // End of variables declaration//GEN-END:variables
}
