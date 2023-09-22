
package Interfaz;
//Librerias
import Conexion.ConexionMysql;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

//por si funciona
//import javax.swing.table.TableRowSorter;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import javax.swing.RowFilter;


/**
 *
 * @author edith
 */
public class frmPetShop extends javax.swing.JFrame {

    ConexionMysql con=new ConexionMysql();
    java.sql.Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    //private TableRowSorter trsfiltro;
    //String filtro;
    
    public frmPetShop() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        mina = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL DE PRODUCTOS");

        jPanel4.setBackground(new java.awt.Color(74, 31, 61));

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Precio");

        jLabel5.setText("Cantidad en existencia");

        jLabel6.setText("Fecha de Vencimiento");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        mina.setIcon(new javax.swing.ImageIcon("C:\\Users\\edith\\OneDrive\\Documentos\\NetBeansProjects\\PPIIA\\Negocio_BD_interfaz\\iconos\\mina.png")); // NOI18N
        mina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minaActionPerformed(evt);
            }
        });

        jdcFecha.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo)
                    .addComponent(txtExistencia)
                    .addComponent(txtPrecio)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addGap(18, 18, 18)
                .addComponent(mina, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        btnIngresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\edith\\OneDrive\\Documentos\\NetBeansProjects\\PPIIA\\Negocio_BD_interfaz\\iconos\\registro-en-linea.png")); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\edith\\OneDrive\\Documentos\\NetBeansProjects\\PPIIA\\Negocio_BD_interfaz\\iconos\\actualizar.png")); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\edith\\OneDrive\\Documentos\\NetBeansProjects\\PPIIA\\Negocio_BD_interfaz\\iconos\\bote-de-basura.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\edith\\OneDrive\\Documentos\\NetBeansProjects\\PPIIA\\Negocio_BD_interfaz\\iconos\\limpiar.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\edith\\OneDrive\\Documentos\\NetBeansProjects\\PPIIA\\Negocio_BD_interfaz\\iconos\\lupa.png")); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnReporte.setIcon(new javax.swing.ImageIcon("C:\\Users\\edith\\OneDrive\\Documentos\\NetBeansProjects\\PPIIA\\Negocio_BD_interfaz\\iconos\\reporte.png")); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnReporte))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Existencia", "Caducidad"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INTERFAZ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void minaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Ingresar();
        consultar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      Modificar(); 
      consultar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    Eliminar();
    consultar();  // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     limpiarCampos();
     txtCodigo.setEnabled(true);   // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        txtCodigo.setEnabled(false);
        int selecFila = Tabla.getSelectedRow();
        if (selecFila == -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
        } else {
            int cod = Integer.parseInt((String) Tabla.getValueAt(selecFila,0) .toString());
            String nom = (String) Tabla.getValueAt(selecFila,1);
            float prec = Float.parseFloat((String) Tabla.getValueAt(selecFila, 2).toString());
            int exis = Integer.parseInt((String) Tabla.getValueAt(selecFila,3) .toString());
            String fechaStr = (String) Tabla.getValueAt(selecFila, 4).toString();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fecha = LocalDate.parse(fechaStr, formatter);
            
            txtCodigo.setText(""+cod);
            txtNombre.setText(nom);
            txtPrecio.setText(""+prec);
            txtExistencia.setText(""+exis);
            jdcFecha.setDate(Date.valueOf(fechaStr));
            
        } //fin if-else
    }//GEN-LAST:event_TablaMouseClicked

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try{
            consultar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\productos.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conet);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception e){
            Logger.getLogger(frmPetShop.class.getName()).log(Level.SEVERE, null, e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmPetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPetShop().setVisible(true);
            }
        });
    }

    void consultar(){
    String sql = "select * from producto ";

    try {
        conet = con.getConnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        Object [] producto = new Object [5];
        modelo = (DefaultTableModel) Tabla.getModel();
        
        while(rs.next()){
            producto [0] = rs.getInt("codigoProducto");
            producto [1] = rs.getString("nombreProducto");
            producto [2] = rs.getFloat("precioProducto");
            producto [3] = rs.getInt("cantidadProducto");
            producto [4] = rs.getDate("fechaVencimiento");
            
            modelo.addRow(producto);
        }//fin while
        Tabla.setModel(modelo); 
        
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Errorzaso en la consulta :c ) ");
        }//fin try_catch
    }//fin void consultar
    
    void Ingresar(){
        String cod = txtCodigo.getText();
        String nom = txtNombre.getText();
        String prec = txtPrecio.getText();
        String exis = txtExistencia.getText();
        String cadu = ((JTextField) jdcFecha.getDateEditor().getUiComponent()).getText();
        
        try{
            if(cod.equals("") || nom.equals("") || prec.equals("") || exis.equals("") || cadu.equals("")){
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese los datos en los campos correspondientes");
                limpiarTabla();
            } else {
                String sql = "insert into producto(codigoProducto, nombreProducto, precioProducto, cantidadProducto, fechaVencimiento) values ('"+cod+"','"+nom+"','"+prec+"','"+exis+"','"+cadu+"')";
                conet = con.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto ingresado exitosamente =) ");
                limpiarTabla();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Errorzaso :c ");
        }// fin try_catch       
    }
    
    void Modificar(){
        String cod = txtCodigo.getText();
        String nom = txtNombre.getText();
        String prec = txtPrecio.getText();
        String exis = txtExistencia.getText();
        String cadu = ((JTextField) jdcFecha.getDateEditor().getUiComponent()).getText();
        
        try{
            if(cod.equals("") || nom.equals("") || prec.equals("") || exis.equals("") || cadu.equals("")){
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese los datos en los campos correspondientes");
                limpiarTabla();
            } else {
                String sql = "Update producto set codigoProducto='"+cod+"', nombreProducto='"+nom+"', precioProducto='"+prec+"', cantidadProducto='"+exis+"', fechaVencimiento='"+cadu+"' where codigoProducto="+cod;
                conet = con.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto actualizado exitosamente =) ");
                limpiarTabla();
                
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Errorzaso en la actualizacion :c ");
        }// fin try_catch
    } //fin modificar();
    
    void Eliminar(){
        String cod = txtCodigo.getText();
        int selecFila = Tabla.getSelectedRow();
        try {
            if(selecFila < 0){
                JOptionPane.showMessageDialog(null, "Producto no seleccionado");
                limpiarTabla();
            } else {
                String sql = "Delete from producto where codigoProducto="+cod;
                conet = con.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente =) ");
                limpiarTabla();
                limpiarCampos();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error, pueda que ya este eliminado el producto");
        }
    }
    
    void limpiarCampos(){   
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtExistencia.setText("");
        jdcFecha.setDate(null);
        txtCodigo.requestFocus();
    }
    
    void limpiarTabla() {
    int rowCount = modelo.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }// fin for
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JButton mina;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
