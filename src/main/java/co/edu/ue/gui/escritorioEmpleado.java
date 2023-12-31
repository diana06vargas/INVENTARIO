/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package co.edu.ue.gui;

/**
 *
 * @author JAE
 */
public class escritorioEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form Escritorio
     */
    public escritorioEmpleado() {
        initComponents();
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new escritorioEmpleado().setVisible(true);
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        menuInventario = new javax.swing.JMenuItem();
        menuRegistrarProductos = new javax.swing.JMenuItem();
        menuPerfil = new javax.swing.JMenu();
        menuCerrarSesion = new javax.swing.JMenuItem();

        Desktop.setBackground(new java.awt.Color(186, 124, 56));
        Desktop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuProductos.setText("Productos");

        menuInventario.setText("Inventario");
        menuInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInventarioActionPerformed(evt);
            }
        });
        menuProductos.add(menuInventario);

        menuRegistrarProductos.setText("Registrar Productos");
        menuRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarProductosActionPerformed(evt);
            }
        });
        menuProductos.add(menuRegistrarProductos);

        jMenuBar1.add(menuProductos);

        menuPerfil.setText("Perfil");

        menuCerrarSesion.setText("Cerrar Sesión");
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        menuPerfil.add(menuCerrarSesion);

        jMenuBar1.add(menuPerfil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarProductosActionPerformed
        StocksFr detalleProducto = new StocksFr();
        detalleProducto.setVisible(true);
        StocksFr pantalla = new StocksFr();
        pantalla.setVisible(false);
    }//GEN-LAST:event_menuRegistrarProductosActionPerformed

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void menuInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInventarioActionPerformed
        InventarioFr inventario = new InventarioFr();
        inventario.setVisible(true);
        InventarioFr pantalla = new InventarioFr();
        pantalla.setVisible(false);
    }//GEN-LAST:event_menuInventarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCerrarSesion;
    private javax.swing.JMenuItem menuInventario;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenuItem menuRegistrarProductos;
    // End of variables declaration//GEN-END:variables
}
