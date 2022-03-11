/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import com.mysql.cj.protocol.Resultset;
import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mariu
 */
public class sistema extends javax.swing.JFrame {

  conexionSQL cc= new conexionSQL();
  Connection con= cc.conectarConBaseDeDatos();
   
  
  public sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        cbEstatus = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Titulo:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Autor:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Genero:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estatus:");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "de aventuras.", "de ciencia ficción.", "de hadas.", "gótica.", "policíaca.", "El romance paranormal.", "distópica.", "fantástica." }));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Indisponible", "Desconocido" }));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtAutor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLibros);

        jLabel6.setText("Buscar:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Busca por titulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
InsertarDatos();
limpiarCajas();
mostrarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
limpiarCajas();


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseClicked

        int filaSeleccionada=tablaLibros.rowAtPoint(evt.getPoint());
      
        txtTitulo.setText(tablaLibros.getValueAt(filaSeleccionada,1).toString());
        txtAutor.setText(tablaLibros.getValueAt(filaSeleccionada,2).toString());
        cbGenero.setSelectedItem(tablaLibros.getValueAt(filaSeleccionada,3));
        txtPrecio.setText(tablaLibros.getValueAt(filaSeleccionada,4).toString());
        cbEstatus.setSelectedItem(tablaLibros.getValueAt(filaSeleccionada,5));



        
    }//GEN-LAST:event_tablaLibrosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
ActualizarDatos();
limpiarCajas();
mostrarDatos();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
eliminarRegistros();
mostrarDatos();
limpiarCajas();


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        filtrarDatos(txtBuscar.getText());

    }//GEN-LAST:event_txtBuscarKeyReleased
public void limpiarCajas(){
txtTitulo.setText("");
txtAutor.setText("");
txtPrecio.setText("");

cbEstatus.setSelectedItem(null);
cbGenero.setSelectedItem(null);
}
public void mostrarDatos(){
String[] titulos={"ID " ,"Titulo","Autor","Genero","Precio" ,"Estatus"};
String[] registros=new String[7];

DefaultTableModel modelo = new DefaultTableModel(null,titulos);
String SQL="select * from libros";


    try {
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery(SQL);
        while (rs.next()) {            
        
        registros[0]=rs.getString("idlibros");
        registros[1]=rs.getString("titulo");
        registros[2]=rs.getString("autor");
        registros[3]=rs.getString("genero");
        registros[4]=rs.getString("precio");
        registros[5]=rs.getString("estatus");

        modelo.addRow(registros);
        }
        
        tablaLibros.setModel(modelo);
    } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, "Error a mostrad datos  (clase sistema)" +e.getMessage());
}
}
    
    /**
     *
     */


    public void InsertarDatos(){
    try {
        String SQL="insert into libros (titulo,autor,genero,precio,estatus)values (?,?,?,?,?)";
        PreparedStatement pst= con.prepareStatement(SQL);
        pst.setString(1, txtTitulo.getText());
        pst.setString(2, txtAutor.getText());
       int seleccionado= cbGenero.getSelectedIndex();
        pst.setString(3, cbGenero.getItemAt(seleccionado));
        pst.setDouble(4, Double.parseDouble(txtPrecio.getText()));
        
          int seleccionado1= cbEstatus.getSelectedIndex();
        pst.setString(5, cbEstatus.getItemAt(seleccionado1));
         pst.execute();
         
         JOptionPane.showMessageDialog(null, "Registro Exitoso (clase sistema)");
         
         
         
    } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Error a hacer el registro  (clase sistema)" +e.getMessage());

    }

}
      public void ActualizarDatos(){
    try {
        String SQL="update libros set titulo=?,autor=?,genero=?,precio=?,estatus=? where idlibros=?";
        int filaSeleccionada=tablaLibros.getSelectedRow();
        String dao= (String)tablaLibros.getValueAt(filaSeleccionada, 0); //hace referencia a nuestra fila seleccionada
        
        PreparedStatement pst= con.prepareStatement(SQL);
        pst.setString(1, txtTitulo.getText());
        pst.setString(2, txtAutor.getText());
        int seleccionado= cbGenero.getSelectedIndex();
        pst.setString(3, cbGenero.getItemAt(seleccionado));
        pst.setDouble(4, Double.parseDouble(txtPrecio.getText()));
        
        int seleccionado1= cbEstatus.getSelectedIndex();
        pst.setString(5, cbEstatus.getItemAt(seleccionado1));
        pst.setString(6, dao);
        pst.execute();
         
         JOptionPane.showMessageDialog(null, "Registro Editado con exito");
         
         
         
    } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Error al editar el registro" +e.getMessage());

    }

}
      public void eliminarRegistros(){
      
          int filaSeleccionada=tablaLibros.getSelectedRow();
      
          try {
              String SQL= "delete from libros where idlibros="+ tablaLibros.getValueAt(filaSeleccionada, 0);
              Statement st= con.createStatement();
              int n= st.executeUpdate(SQL);
              
              if (n>0) {
 JOptionPane.showMessageDialog(null, "Registro Eliminado con exito" );

              }
              
          } catch (Exception e) {
                               JOptionPane.showMessageDialog(null, "Error al Eliminar Registros : " +e.getMessage());

          }
      
      }
      //********************************************************************************************
      public void filtrarDatos(String valor){
String[] titulos={"ID " ,"Titulo","Autor","Genero","Precio" ,"Estatus"};
String[] registros=new String[7];

DefaultTableModel modelo = new DefaultTableModel(null,titulos);
String SQL="select * from libros where titulo like '%"+valor+"%'";


    try {
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery(SQL);
        while (rs.next()) {            
        
        registros[0]=rs.getString("idlibros");
        registros[1]=rs.getString("titulo");
        registros[2]=rs.getString("autor");
        registros[3]=rs.getString("genero");
        registros[4]=rs.getString("precio");
        registros[5]=rs.getString("estatus");

        modelo.addRow(registros);
        }
        
        tablaLibros.setModel(modelo);
    } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, "Error a mostrad datos  (clase sistema)" +e.getMessage());
}
}
      
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
