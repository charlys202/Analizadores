package Ventanas;

import javax.swing.*;
import java.awt.*;
import analizadorlexico.Interfaz;

/**
 *
 * @author Carlos
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    
           setTitle("Analizadores Léxico y Sintáctico");
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(245, 245, 245));
        
        // ===== CONFIGURACIÓN DEL PANEL PRINCIPAL =====
        jPanel1.setBackground(new Color(76, 175, 80)); // Verde principal
        jPanel1.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createRaisedBevelBorder(),
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));
        
        // ===== CONFIGURACIÓN DE LABELS =====
        // Institución
        jLabel1.setFont(new Font("Arial", Font.BOLD, 16));
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Tecnológico de Estudios Superiores");
        
        jLabel10.setFont(new Font("Arial", Font.BOLD, 16));
        jLabel10.setForeground(Color.WHITE);
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("de Coacalco");
        
        // Materia
        jLabel2.setFont(new Font("Arial", Font.BOLD, 14));
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Autómatas I");
        
        // Profesor
        jLabel3.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Profesor: Roberto Carlos Muñoz Celaya");
        
        // Integrantes
        jLabel4.setFont(new Font("Arial", Font.BOLD, 11));
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Equipo: • Aguilar Moreno Luis Alberto");
       
        jLabel5.setFont(new Font("Arial", Font.PLAIN, 11));
        jLabel5.setForeground(Color.WHITE);
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("• Gómez González Kaori");
        
        jLabel6.setFont(new Font("Arial", Font.PLAIN, 11));
        jLabel6.setForeground(Color.WHITE);
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("• González Dolores Carlos Daniel");
        
        // ===== CONFIGURACIÓN DE PANELES DE LOGOS =====
        jPanel2.setOpaque(false); // Transparente
        jPanel3.setOpaque(false); // Transparente
        
        // ===== CONFIGURACIÓN DE BOTONES =====
        // Título de analizadores (reutilizando un label existente o el espacio)
        
        // Botón Léxico
        Lexico.setText("Analizador Léxico");
        Lexico.setFont(new Font("Arial", Font.BOLD, 14));
        Lexico.setBackground(new Color(76, 175, 80));
        Lexico.setForeground(Color.WHITE);
        Lexico.setBorder(BorderFactory.createEmptyBorder(12, 25, 12, 25));
        Lexico.setFocusPainted(false);
        Lexico.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Lexico.setPreferredSize(new Dimension(180, 45));
        
        // Botón Sintáctico
        Sintactico.setText("Analizador Sintáctico");
        Sintactico.setFont(new Font("Arial", Font.BOLD, 14));
        Sintactico.setBackground(new Color(76, 175, 80));
        Sintactico.setForeground(Color.WHITE);
        Sintactico.setBorder(BorderFactory.createEmptyBorder(12, 25, 12, 25));
        Sintactico.setFocusPainted(false);
        Sintactico.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Sintactico.setPreferredSize(new Dimension(180, 45));
        
        // ===== EFECTOS HOVER PARA BOTONES =====
        // Hover para botón Léxico
        Lexico.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Lexico.setBackground(new Color(67, 160, 71)); // Verde más oscuro
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Lexico.setBackground(new Color(76, 175, 80)); // Verde original
            }
        });
        
        // Hover para botón Sintáctico
        Sintactico.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sintactico.setBackground(new Color(67, 160, 71)); // Verde más oscuro
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sintactico.setBackground(new Color(76, 175, 80)); // Verde original
            }
        });
        
        // ===== CONFIGURACIÓN DE LOGOS =====
        try {
            // Cargar y redimensionar logos
            ImageIcon iconTesco = new ImageIcon(getClass().getResource("/img/logotesco.png"));
            Image imgTesco = iconTesco.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            jLabel8.setIcon(new ImageIcon(imgTesco));
            jLabel8.setText(""); // Quitar texto por defecto
            
            ImageIcon iconTecNM = new ImageIcon(getClass().getResource("/img/logotecnm.png"));
            Image imgTecNM = iconTecNM.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            jLabel9.setIcon(new ImageIcon(imgTecNM));
            jLabel9.setText(""); // Quitar texto por defecto
            
        } catch (Exception e) {
            System.out.println("Error al cargar imágenes: " + e.getMessage());
            // Configurar texto alternativo con estilo
            jLabel8.setText("TESCO");
            jLabel8.setFont(new Font("Arial", Font.BOLD, 14));
            jLabel8.setForeground(Color.WHITE);
            jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
            
            jLabel9.setText("TecNM");
            jLabel9.setFont(new Font("Arial", Font.BOLD, 14));
            jLabel9.setForeground(Color.WHITE);
            jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        // ===== CONFIGURACIÓN FINAL DE PANELES =====
        // Limpiar y configurar paneles de logos
        jPanel2.removeAll();
        jPanel3.removeAll();
        
        jPanel2.setLayout(new BorderLayout());
        jPanel3.setLayout(new BorderLayout());
        
        jPanel2.add(jLabel9, BorderLayout.CENTER); // TecNM
        jPanel3.add(jLabel8, BorderLayout.CENTER); // TESCO
        
        // Refrescar paneles
        jPanel2.revalidate();
        jPanel2.repaint();
        jPanel3.revalidate();
        jPanel3.repaint();
        
        // ===== CONFIGURACIÓN FINAL DE LA VENTANA =====
        pack();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Lexico = new javax.swing.JButton();
        Sintactico = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setText("Tecnologico de Estudios Superiores");

        jLabel2.setText("Automatas 1");

        jLabel3.setText("Profesor:Roberto Carlos Muñoz Celaya");

        jLabel4.setText("Equipo: Aguilar Moreno Luis Alberto");

        jLabel5.setText("Gomez González Kaori");

        jLabel6.setText("Gonzalez Dolores Carlos Daniel");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel10.setText("de Coacalco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setText("Analizadores");

        Lexico.setText("Lexico");
        Lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LexicoActionPerformed(evt);
            }
        });

        Sintactico.setText("Sintactico");
        Sintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SintacticoActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lexico)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Salir))
                    .addComponent(jLabel7))
                .addGap(66, 66, 66)
                .addComponent(Sintactico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lexico)
                    .addComponent(jLabel7)
                    .addComponent(Sintactico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LexicoActionPerformed
        this.dispose();
        Interfaz ventana = new Interfaz();
        ventana.setVisible(true);
    }//GEN-LAST:event_LexicoActionPerformed

    private void SintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SintacticoActionPerformed
        this.dispose();
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }//GEN-LAST:event_SintacticoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lexico;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Sintactico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
