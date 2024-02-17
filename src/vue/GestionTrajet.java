/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vue;

import controller.ConnectBD;
import java.awt.Dimension;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class GestionTrajet extends javax.swing.JFrame {

    /**
     * Creates new form GestionTrajet
     */
    public GestionTrajet() {
        initComponents();
        AfficherTrajet();
        TrajetId.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TrajetId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Destination = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Origine = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PlaceDisponible = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        GtSupprimerBTN = new javax.swing.JButton();
        GtRetourBTN = new javax.swing.JButton();
        GtAjouterBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        confort = new javax.swing.JComboBox<>();
        dateDepart = new com.toedter.calendar.JDateChooser();
        heureDepart = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        GtTrajetTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(TrajetId, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 294, 125, 56));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Gare de Départ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 266, 140, -1));

        Destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kenitra", "Rabat", "Fes", "Casa", "Marrakesh", "Tanger" }));
        Destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationActionPerformed(evt);
            }
        });
        getContentPane().add(Destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 294, 132, 56));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Trajet ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 266, -1, -1));

        Origine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kenitra", "Rabat", "Fes", "Casa", "Marrakesh", "Tanger" }));
        Origine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigineActionPerformed(evt);
            }
        });
        getContentPane().add(Origine, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 294, 140, 56));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Gare d'Arrivée");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 266, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Heure de Départ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 266, 153, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Date de Départ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 266, 143, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Confort");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 266, 75, -1));
        getContentPane().add(PlaceDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 296, 127, 52));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Nombre de Places");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 260, -1, -1));

        GtSupprimerBTN.setText("SUPPRIMER");
        GtSupprimerBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtSupprimerBTNMouseClicked(evt);
            }
        });
        getContentPane().add(GtSupprimerBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 444, 129, 59));

        GtRetourBTN.setText("RETOUR");
        GtRetourBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtRetourBTNMouseClicked(evt);
            }
        });
        GtRetourBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GtRetourBTNActionPerformed(evt);
            }
        });
        getContentPane().add(GtRetourBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 444, 155, 59));

        GtAjouterBTN.setText("AJOUTER");
        GtAjouterBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtAjouterBTNMouseClicked(evt);
            }
        });
        GtAjouterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GtAjouterBTNActionPerformed(evt);
            }
        });
        getContentPane().add(GtAjouterBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 444, 129, 59));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Interface Administrateur SKAN-ONCF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel9)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel9)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1715, -1));

        confort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ère Classe", "2ème Classe" }));
        getContentPane().add(confort, new org.netbeans.lib.awtextra.AbsoluteConstraints(1213, 311, 131, -1));

        dateDepart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateDepartPropertyChange(evt);
            }
        });
        getContentPane().add(dateDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 294, 143, 56));

        heureDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heureDepartActionPerformed(evt);
            }
        });
        getContentPane().add(heureDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 294, 163, 56));

        GtTrajetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TrajetId", "Origine", "Destination", "Date", "Heure de départ", "Heure d'arrivée ", "Places disponibles"
            }
        ));
        GtTrajetTable.setCellSelectionEnabled(true);
        GtTrajetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtTrajetTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(GtTrajetTable);
        GtTrajetTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 649, 1715, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinationActionPerformed

    private void OrigineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrigineActionPerformed

    private void GtRetourBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GtRetourBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GtRetourBTNActionPerformed
    ConnectBD connection = new ConnectBD();
    PreparedStatement pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
String date ="";
    private void Clear() {
        TrajetId.setText("");
        Origine.setSelectedIndex(-1);
        Destination.setSelectedIndex(-1);
//        Date.setDate(new Date(124,0,1));
        heureDepart.setText("");
        confort.setSelectedIndex(-1);
        PlaceDisponible.setText("");

    }

    private void GtAjouterBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtAjouterBTNMouseClicked
        if (Origine.getSelectedIndex() == -1 || Destination.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Missing information ");
        } else {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trajets?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");

                PreparedStatement Add = connection.prepareStatement("insert into trajetstable(`gareDepart`, `gareArrivee`, `dateDepart`, `heureDepart`, `confort`, `nbrPlaces`) values (?,?,?,?,?,?)");
                Add.setString(1, Origine.getSelectedItem().toString());
                Add.setString(2, Destination.getSelectedItem().toString());

                // The Date variable values are like this : "Fri Feb 02 00:18:50 GMT 2024" But the database is expecting 
                // year:mm:day so we have to make a convertion before we store in the DateTbl variable
                Add.setString(3, date);

                Add.setString(4, heureDepart.getText().toString());
                Add.setInt(5, confort.getSelectedIndex());
                Add.setInt(6, Integer.parseInt(PlaceDisponible.getText()));

                int raw = Add.executeUpdate();
                System.out.println(raw + " records inserted");
                connection.close();
                JOptionPane.showMessageDialog(this, "Trajet Ajouté");
                AfficherTrajet();
                Clear();

            } catch (Exception e) {
                System.out.println(" exception" + e.toString());
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_GtAjouterBTNMouseClicked
    private void GtTrajetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtTrajetTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) GtTrajetTable.getModel();
        int MyIndex = GtTrajetTable.getSelectedRow();
        //i = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        TrajetId.setText(model.getValueAt(MyIndex, 0).toString());
        Origine.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
        Destination.setSelectedItem(model.getValueAt(MyIndex, 2).toString());

        // Date.setDate((Date) model.getValueAt(MyIndex, 3));
        heureDepart.setText(model.getValueAt(MyIndex, 4).toString());
        confort.setSelectedItem(model.getValueAt(MyIndex, 5).toString());

        PlaceDisponible.setText(model.getValueAt(MyIndex, 6).toString());
    }//GEN-LAST:event_GtTrajetTableMouseClicked

    private void DateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DateMouseClicked

    private void GtEditerBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtEditerBTNMouseClicked
        /* if(i==0){
            JOptionPane.showMessageDialog(this, "Veuillez Selectionner un trajet à modifier !");
            
            
        }else{
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trajets", "root" , "");
                 String Query ="Update trajetstable set OrigineTbl=?, DestinationTbl=?, DateTbl=?, HeureDepartTbl=?, HeureArriveTbl=?, PlaceDisponibleTbl=? where TrajetIdTbl=?";
                 PreparedStatement Add = Con.prepareStatement(Query);
   
                 Add.setString(1, Origine.getSelectedItem().toString());
                 Add.setString(2, Destination.getSelectedItem().toString());
                 
                 // The Date variable values are like this : "Fri Feb 02 00:18:50 GMT 2024" But the database is expecting 
                 // year:mm:day so we have to make a convertion before we store in the DateTbl variable
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                 String formattedDate = sdf.format(Date.getDate());
                 Add.setString(3, formattedDate);
                 
                 Add.setString(4, HeureDepart.getValue().toString());
                 Add.setString(1, confort.getSelectedItem().toString());
                 Add.setInt(6, Integer.valueOf(PlaceDisponible.getText()));
                 Add.setInt(7, i);
                 
                 int raw = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Trajet Modifié");
                 AfficherTrajet();
                 Clear();
                
            } catch (SQLException ex) {
                Logger.getLogger(GestionTrajet.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }*/
    }//GEN-LAST:event_GtEditerBTNMouseClicked

    private void GtSupprimerBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtSupprimerBTNMouseClicked

        int myIndex = Integer.parseInt(TrajetId.getText());

        if (myIndex > 0) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trajets?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                String sql = "DELETE FROM trajetstable WHERE trajetID =?";
                PreparedStatement prest = connection.prepareStatement(sql);
                prest.setInt(1, myIndex);
                prest.executeUpdate();
                prest.close();
                connection.close();
                JOptionPane.showMessageDialog(this, "Trajet Deleted");
                AfficherTrajet();
                Clear();

            } catch (SQLException ex) {
                System.out.println(" exception" + ex.toString());
                Logger.getLogger(GestionTrajet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez Selectionner un trajet à Suprimer !");
        }
    }//GEN-LAST:event_GtSupprimerBTNMouseClicked

    private void GtAjouterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GtAjouterBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GtAjouterBTNActionPerformed

    private void heureDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heureDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heureDepartActionPerformed

    private void GtRetourBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtRetourBTNMouseClicked
        // TODO add your handling code here:
        new InAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GtRetourBTNMouseClicked

    private void dateDepartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateDepartPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            date = sdf.format(dateDepart.getDate());
            System.out.println("date:" + date);
        } else {
            System.out.println("null");
        }     }//GEN-LAST:event_dateDepartPropertyChange

    private void AfficherTrajet() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trajets?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            Statement St = connection.createStatement();
            ResultSet Rs = St.executeQuery("select * from trajetstable");

            DefaultTableModel model = (DefaultTableModel) GtTrajetTable.getModel();
            model.setRowCount(0); // Clear existing data

            ResultSetMetaData rsmd = Rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Ensure model has the correct columns, only if it's empty
            if (model.getColumnCount() == 0) {
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(rsmd.getColumnName(i));
                }
            }

            // Add data rows to the model
            while (Rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = Rs.getObject(i);
                }
                model.addRow(row);
            }
            Rs.close();
            St.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(" exception" + e.toString());
            e.printStackTrace();
        }

    }

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
            java.util.logging.Logger.getLogger(GestionTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTrajet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Destination;
    private javax.swing.JButton GtAjouterBTN;
    private javax.swing.JButton GtRetourBTN;
    private javax.swing.JButton GtSupprimerBTN;
    private javax.swing.JTable GtTrajetTable;
    private javax.swing.JComboBox<String> Origine;
    private javax.swing.JTextField PlaceDisponible;
    private javax.swing.JTextField TrajetId;
    private javax.swing.JComboBox<String> confort;
    private com.toedter.calendar.JDateChooser dateDepart;
    private javax.swing.JTextField heureDepart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
