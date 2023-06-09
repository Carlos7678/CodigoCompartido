/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class PedirKebap extends javax.swing.JFrame {

    /**
     * Creates new form PedirKebap
     */
    public PedirKebap() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jmediano = new javax.swing.JRadioButton();
        jGrande = new javax.swing.JRadioButton();
        jXXL = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Csalsa = new javax.swing.JCheckBox();
        jComerAqui = new javax.swing.JRadioButton();
        jLLevar = new javax.swing.JRadioButton();
        bEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos del kebap");
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel3.setText("�SALSA KEBAP MANOLO?");

        jLabel4.setFont(new java.awt.Font("Mistral", 0, 48)); // NOI18N
        jLabel4.setText("DATOS DEL KEBAP");

        buttonGroup1.add(jmediano);
        jmediano.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jmediano.setText("Mediano");

        buttonGroup1.add(jGrande);
        jGrande.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jGrande.setText("Grande");

        buttonGroup1.add(jXXL);
        jXXL.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jXXL.setText("XXL");

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel5.setText("TAMA�O");

        Csalsa.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        Csalsa.setText("Si quiero");

        buttonGroup2.add(jComerAqui);
        jComerAqui.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jComerAqui.setText("Para comer en Kebap Manolo");

        buttonGroup2.add(jLLevar);
        jLLevar.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLLevar.setText("Para llevar");

        bEnviar.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        bEnviar.setText("ENVIAR");
        bEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jmediano)
                                .addGap(18, 18, 18)
                                .addComponent(jGrande)
                                .addGap(18, 18, 18)
                                .addComponent(jXXL))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComerAqui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Csalsa)
                            .addComponent(jLLevar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(bEnviar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmediano)
                    .addComponent(jGrande)
                    .addComponent(jXXL)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Csalsa))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComerAqui)
                    .addComponent(jLLevar))
                .addGap(38, 38, 38)
                .addComponent(bEnviar)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        if (!jmediano.isSelected() && !jGrande.isSelected() && !jXXL.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Tienes que seleccionar el tama�o de tu Kebap", "Selecciona el tama�o", JOptionPane.ERROR_MESSAGE);
        }else{
             if (jLLevar.isSelected()) {
            Datos newframe = new Datos();
            newframe.setVisible(true);
        }
        }
        if (!jComerAqui.isSelected() && !jLLevar.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Tienes que seleccionar donde te quieres comer el Kebap", "�Y donde te comes el kebap?", JOptionPane.ERROR_MESSAGE);
        }
       
        if (jComerAqui.isSelected()) {
            if (Csalsa.isSelected()) {
                if (jmediano.isSelected()) {
                    JOptionPane.showMessageDialog(rootPane, "Tu kebap de tama�o mediano y con salsa esta siendo preparado por Mustafa", "Tu Kebap esta siendo preparado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (jGrande.isSelected()) {
                        JOptionPane.showMessageDialog(rootPane, "Tu kebap de tama�o grande y con salsa esta siendo preparado por Al Jamal", "Tu Kebap esta siendo preparado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (jXXL.isSelected()) {
                            JOptionPane.showMessageDialog(rootPane, "Tu kebap de tama�o grande y con salsa esta siendo preparado por Mustafa", "Tu Kebap esta siendo preparado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } else {
                if (jmediano.isSelected()) {
                    JOptionPane.showMessageDialog(rootPane, "Tu kebap de tama�o mediano esta siendo preparado por Mehmet", "Tu Kebap esta siendo preparado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (jGrande.isSelected()) {
                        JOptionPane.showMessageDialog(rootPane, "Tu kebap de tama�o grande esta siendo preparado por Sultan", "Tu Kebap esta siendo preparado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (jXXL.isSelected()) {
                            JOptionPane.showMessageDialog(rootPane, "Tu kebap de tama�o grande esta siendo preparado por H�seyin", "Tu Kebap esta siendo preparado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_bEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(PedirKebap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedirKebap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedirKebap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedirKebap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedirKebap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Csalsa;
    private javax.swing.JButton bEnviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton jComerAqui;
    private javax.swing.JRadioButton jGrande;
    private javax.swing.JRadioButton jLLevar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jXXL;
    private javax.swing.JRadioButton jmediano;
    // End of variables declaration//GEN-END:variables
}
