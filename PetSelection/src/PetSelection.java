/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Lyeon Ndungu
 */
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.*;
import javax.swing.*;
public class PetSelection extends javax.swing.JFrame {
    ImageIcon Imagebird=new ImageIcon("bird.png");
    ImageIcon Imagecat=new ImageIcon("cat.jpg");
    ImageIcon Imagedog=new ImageIcon("dog.jpg");
    ImageIcon Imagerabbit=new ImageIcon("rabbit.jpg");
    ImageIcon Imagepig=new ImageIcon("pig.jpg");
    
   

    /**
     * Creates new form PetSelection
     */
    public PetSelection() {
        initComponents();
        label.setText("");
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
        birdButton = new javax.swing.JRadioButton();
        catButton = new javax.swing.JRadioButton();
        dogButton = new javax.swing.JRadioButton();
        rabbitButton = new javax.swing.JRadioButton();
        pigButton = new javax.swing.JRadioButton();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        birdButton.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(birdButton);
        birdButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        birdButton.setText("Bird");
        birdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birdButtonActionPerformed(evt);
            }
        });

        catButton.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(catButton);
        catButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        catButton.setText("Cat");
        catButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catButtonActionPerformed(evt);
            }
        });

        dogButton.setBackground(new java.awt.Color(153, 0, 0));
        buttonGroup1.add(dogButton);
        dogButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        dogButton.setText("Dog");
        dogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogButtonActionPerformed(evt);
            }
        });

        rabbitButton.setBackground(new java.awt.Color(102, 0, 102));
        buttonGroup1.add(rabbitButton);
        rabbitButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        rabbitButton.setText("Rabbit");
        rabbitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabbitButtonActionPerformed(evt);
            }
        });

        pigButton.setBackground(new java.awt.Color(204, 0, 153));
        buttonGroup1.add(pigButton);
        pigButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        pigButton.setText("Pig");
        pigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pigButtonActionPerformed(evt);
            }
        });

        label.setText("jLabel1");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("PETS SELECTION ( Lyeon Ndungu BSCIT-01-0016/2024 Assignment 2)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rabbitButton)
                            .addComponent(catButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(birdButton)
                        .addGap(18, 18, 18)
                        .addComponent(catButton)
                        .addGap(18, 18, 18)
                        .addComponent(dogButton)
                        .addGap(18, 18, 18)
                        .addComponent(rabbitButton)
                        .addGap(28, 28, 28)
                        .addComponent(pigButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {birdButton, catButton, dogButton, pigButton, rabbitButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void birdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birdButtonActionPerformed
        // TODO add your handling code here:
        if(birdButton.isSelected()==true)
        {
         label.setIcon(Imagebird);
         JOptionPane.showMessageDialog(null, "You have selected Bird","MESSAGE DIALOG",JOptionPane.INFORMATION_MESSAGE,Imagebird);
        }
       
    }//GEN-LAST:event_birdButtonActionPerformed

    private void catButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catButtonActionPerformed
        // TODO add your handling code here:
        if( catButton.isSelected()==true){
            label.setIcon(Imagecat);
            JOptionPane.showMessageDialog(null, "You have selected Cat","MESSAGE DIALOG",JOptionPane.INFORMATION_MESSAGE,Imagecat);
        }
    }//GEN-LAST:event_catButtonActionPerformed

    private void dogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogButtonActionPerformed
        // TODO add your handling code here:
        if( dogButton.isSelected()==true){
            label.setIcon(Imagedog);
            JOptionPane.showMessageDialog(null, "You have selected Dog","MESSAGE DIALOG",JOptionPane.INFORMATION_MESSAGE,Imagedog);
            
        }
    }//GEN-LAST:event_dogButtonActionPerformed

    private void rabbitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rabbitButtonActionPerformed
        // TODO add your handling code here:
        if( rabbitButton.isSelected()==true){
            label.setIcon(Imagerabbit);
            JOptionPane.showMessageDialog(null, "You have selected Rabbit","MESSAGE DIALOG",JOptionPane.INFORMATION_MESSAGE,Imagerabbit);
            
        }
    }//GEN-LAST:event_rabbitButtonActionPerformed

    private void pigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pigButtonActionPerformed
        // TODO add your handling code here:
        if( pigButton.isSelected()==true){
            label.setIcon(Imagepig);
            JOptionPane.showMessageDialog(null, "You have selected Pig","MESSAGE DIALOG",JOptionPane.INFORMATION_MESSAGE,Imagepig);
            
        }
    }//GEN-LAST:event_pigButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PetSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton birdButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton catButton;
    private javax.swing.JRadioButton dogButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label;
    private javax.swing.JRadioButton pigButton;
    private javax.swing.JRadioButton rabbitButton;
    // End of variables declaration//GEN-END:variables
}