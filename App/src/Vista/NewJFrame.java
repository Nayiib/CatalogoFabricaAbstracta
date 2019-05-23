package Vista;

import AbstractFactory.Arco;
import AbstractFactory.Armadura;
import AbstractFactory.Caballo;
import AbstractFactory.Espada;
import AbstractFactory.Leon;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        ImageIcon back = new ImageIcon("src/img/background.jpg");
        Icon icono = new ImageIcon(back.getImage().getScaledInstance(_back.getWidth(), _back.getHeight(), Image.SCALE_DEFAULT));
        _back.setIcon(icono);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        _arma = new javax.swing.JComboBox<>();
        arma = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        _montura = new javax.swing.JComboBox<>();
        _armadura = new javax.swing.JComboBox<>();
        clothes = new javax.swing.JLabel();
        animal = new javax.swing.JLabel();
        _back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(813, 517));
        setMinimumSize(new java.awt.Dimension(813, 517));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _arma.setBackground(new java.awt.Color(204, 255, 255));
        _arma.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        _arma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espada", "Arco" }));
        _arma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _armaActionPerformed(evt);
            }
        });
        jPanel1.add(_arma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, 30));

        arma.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                armaComponentAdded(evt);
            }
        });
        jPanel1.add(arma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 155, 150));

        enviar.setBackground(new java.awt.Color(204, 255, 255));
        enviar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        enviar.setText("Crear");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        jPanel1.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, -1));

        _montura.setBackground(new java.awt.Color(204, 255, 255));
        _montura.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        _montura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo", "Leon" }));
        _montura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _monturaActionPerformed(evt);
            }
        });
        jPanel1.add(_montura, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, 30));

        _armadura.setBackground(new java.awt.Color(204, 255, 255));
        _armadura.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        _armadura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armadura" }));
        jPanel1.add(_armadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 100, 30));
        jPanel1.add(clothes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 155, 150));
        jPanel1.add(animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 155, 150));
        jPanel1.add(_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 520));

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

    private void _armaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__armaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__armaActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        int equipo = _arma.getSelectedIndex();
        int montura = _montura.getSelectedIndex();
        int armadura = _armadura.getSelectedIndex();

        if (montura == 1) {
            Leon simba = new Leon();
            ImageIcon icono = new ImageIcon(simba.operation().getImage().getScaledInstance(animal.getWidth(), animal.getHeight(), Image.SCALE_DEFAULT));
            animal.setIcon(icono);
        }
        if (montura == 0) {
            Caballo simba = new Caballo();
            ImageIcon icono = new ImageIcon(simba.operation().getImage().getScaledInstance(animal.getWidth(), animal.getHeight(), Image.SCALE_DEFAULT));
            animal.setIcon(icono);
        }
        if (equipo == 1) {
            Arco negra = new Arco();
            ImageIcon icono = new ImageIcon(negra.operation().getImage().getScaledInstance(arma.getWidth(), arma.getHeight(), Image.SCALE_DEFAULT));
            arma.setIcon(icono);
        }
        if (equipo == 0) {
            Espada negra = new Espada();
            ImageIcon icono = new ImageIcon(negra.operation().getImage().getScaledInstance(arma.getWidth(), arma.getHeight(), Image.SCALE_DEFAULT));
            arma.setIcon(icono);
        }
        if (armadura == 0) {
            Armadura negra = new Armadura();
            ImageIcon icono = new ImageIcon(negra.operation().getImage().getScaledInstance(clothes.getWidth(), clothes.getHeight(), Image.SCALE_DEFAULT));
            clothes.setIcon(icono);
        }

    }//GEN-LAST:event_enviarActionPerformed

    private void _monturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__monturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__monturaActionPerformed

    private void armaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_armaComponentAdded

    }//GEN-LAST:event_armaComponentAdded

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> _arma;
    private javax.swing.JComboBox<String> _armadura;
    private javax.swing.JLabel _back;
    private javax.swing.JComboBox<String> _montura;
    private javax.swing.JLabel animal;
    private javax.swing.JLabel arma;
    private javax.swing.JLabel clothes;
    private javax.swing.JButton enviar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
