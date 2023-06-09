/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.uv.programa07;
import java.util.List;
import javax.swing.JOptionPane;
import org.uv.DAO.DAOProducto;
import org.uv.Entyties.Producto;
/**
 *
 * @author FHATIMA
 */
public class Productos extends javax.swing.JInternalFrame {
    protected int posicion=0;
    private DAOProducto daoPro=new DAOProducto();
    protected List <Producto> listaP=daoPro.findAll();
    private Producto p;
    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();
        if (listaP.size()>0){
            p = listaP.get(posicion);
        }
        
        if(p!=null){
            asignacionvista(p);
            vista(posicion,listaP);
        }else{
            vistaID.setText("");
            vistaNombre.setText("");
            vistaPrecio.setText("");
            vistaStock.setText("");
            bntAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);
            btnEliminar.setEnabled(false);
            bntModificar.setEnabled(false);
        }
    }
    public void asignacionvista(Producto p){
        vistaID.setText(String.valueOf(p.getId_producto()));
        vistaNombre.setText(p.getDescripcion());
        vistaPrecio.setText(String.valueOf(p.getPrecio_unitario()));
        vistaStock.setText(String.valueOf(p.getStock()));

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        vistaID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vistaNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vistaPrecio = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        bntAnterior = new javax.swing.JButton();
        idProducto = new javax.swing.JTextField();
        bntFiltrar = new javax.swing.JButton();
        bntModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        bntCrear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        vistaStock = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();

        setClosable(true);
        setTitle("Catalogo de Productos");

        jLabel1.setText("Id:");

        vistaID.setText("id automatico");

        jLabel2.setText("Nombre:");

        vistaNombre.setText("producto");

        jLabel3.setText("Precio:");

        vistaPrecio.setText("precio");

        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        bntAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAnteriorActionPerformed(evt);
            }
        });

        idProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoActionPerformed(evt);
            }
        });

        bntFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFiltrarActionPerformed(evt);
            }
        });

        bntModificar.setText("Modificar");
        bntModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        bntCrear.setText("Crear");
        bntCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCrearActionPerformed(evt);
            }
        });

        jLabel4.setText("Stock");

        vistaStock.setText("stock");

        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(Refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bntCrear)
                                .addGap(38, 38, 38)
                                .addComponent(bntModificar)
                                .addGap(34, 34, 34)
                                .addComponent(btnEliminar))
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addComponent(bntAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vistaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vistaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vistaID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vistaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63)
                        .addComponent(btnSiguiente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntFiltrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntAnterior)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntFiltrar))
                        .addGap(18, 18, 18)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btnSiguiente)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addComponent(vistaID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(vistaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(vistaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(vistaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bntCrear)
                                    .addComponent(bntModificar)
                                    .addComponent(btnEliminar))
                                .addGap(27, 27, 27))))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Refresh)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void vista(int inicio, List<Producto> lista){
        if (inicio == 0){
            bntAnterior.setEnabled(false);
        }else{
            bntAnterior.setEnabled(true);
        }
        if(inicio==lista.size()-1){
            btnSiguiente.setEnabled(false);
        }else{
            btnSiguiente.setEnabled(true);
        }
    }
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        posicion+=1;
        p=listaP.get(posicion);
        asignacionvista(p);
        vista(posicion,listaP);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void bntFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFiltrarActionPerformed
        try{
            int id=Integer.parseInt(idProducto.getText());
            p=daoPro.findbyID(id);
            if (p!=null){
                asignacionvista(p);
                listaP=daoPro.findAll();
                for(int i=0; i<listaP.size(); i++){
                   if (listaP.get(i).getId_producto()==p.getId_producto()){
                       posicion=i;
                       i=listaP.size();
                   }
                }
                vista(posicion,listaP);
            }else{
                JOptionPane.showMessageDialog(null, "El ID del producto ingresado no existe!!");
            }
            
        }catch(Exception ex){
            
        }
        
    }//GEN-LAST:event_bntFiltrarActionPerformed

    private void bntAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAnteriorActionPerformed
        posicion-=1;
        p=listaP.get(posicion);
        asignacionvista(p);
        vista(posicion,listaP);
    }//GEN-LAST:event_bntAnteriorActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean pase=false;
        pase=daoPro.delete(p.getId_producto());
        if (pase==true){
            if(posicion>0){
                posicion-=1;   
            }
            listaP=daoPro.findAll();
            p=listaP.get(posicion);
            asignacionvista(p);
            JOptionPane.showMessageDialog(null, "Producto eliminado con exito!.");
        }else{
            JOptionPane.showMessageDialog(null, "El producto no se puede eliminar por restricciones.");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void idProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductoActionPerformed

    private void bntCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCrearActionPerformed
       Creacion creacion = new Creacion();
       creacion.setVisible(true);
    }//GEN-LAST:event_bntCrearActionPerformed

    private void bntModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntModificarActionPerformed
       Modificacion modificacion = new Modificacion(p);
       modificacion.setVisible(true);
    }//GEN-LAST:event_bntModificarActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        listaP=daoPro.findAll();
        posicion=listaP.size()-1;
        p=listaP.get(posicion);
        asignacionvista(p);
        vista(posicion,listaP);
    }//GEN-LAST:event_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton bntAnterior;
    private javax.swing.JButton bntCrear;
    private javax.swing.JButton bntFiltrar;
    private javax.swing.JButton bntModificar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel contenedor;
    private javax.swing.JTextField idProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel vistaID;
    private javax.swing.JLabel vistaNombre;
    private javax.swing.JLabel vistaPrecio;
    private javax.swing.JLabel vistaStock;
    // End of variables declaration//GEN-END:variables
}
