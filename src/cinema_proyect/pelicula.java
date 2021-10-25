/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_proyect;
import Conex.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author monit
 */
public class pelicula extends javax.swing.JFrame {
    public static int usuario;
    Conexion cc = new Conexion();
    Connection con = cc.Conexion();
    String formatos[][] = new String[100][2];
    String directores[][] = new String[100][2];
    String clasificaciones[][] = new String[100][2];
    String generos[][] = new String[100][2];
    /**
     * Creates new form pelicula
     */
    public pelicula(int id_usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        usuario = id_usuario;
        text_usuario.setText("UsuarioID: "+usuario);
        String stmt;
        Statement st;
        ResultSet rs;
        //formato
        stmt = "select * from formato";
        try{
            int f = 0;
            st = con.createStatement();
            rs = st.executeQuery(stmt);
            while(rs.next()){
                formatos[f][0] = rs.getString("id_formato");
                formatos[f][1] = rs.getString("formato");
                if(formatos[f][1] != null){
                    text_formato.addItem(formatos[f][1]);
                }
                f++;
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        //director
        stmt = "select * from director";
        try{
            int d = 0;
            st = con.createStatement();
            rs = st.executeQuery(stmt);
            while(rs.next()){
                directores[d][0] = rs.getString("id_director");
                directores[d][1] = rs.getString("nombre");
                if(directores[d][1] != null){
                    text_director.addItem(directores[d][1]);
                }
                d++;
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        //clasificacion
        stmt = "select * from clasificacion";
        try{
            int c = 0;
            st = con.createStatement();
            rs = st.executeQuery(stmt);
            while(rs.next()){
                clasificaciones[c][0] = rs.getString("id_clasificacion");
                clasificaciones[c][1] = rs.getString("clasificacion");
                if(clasificaciones[c][1] != null){
                    text_clasificacion.addItem(clasificaciones[c][1]);
                }
                c++;
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        stmt = "select * from genero";
        try{
            int g = 0;
            st = con.createStatement();
            rs = st.executeQuery(stmt);
            while(rs.next()){
                generos[g][0] = rs.getString("id_genero");
                generos[g][1] = rs.getString("genero");
                if(generos[g][1] != null){
                    text_genero.addItem(generos[g][1]);
                }
                g++;
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        text_usuario = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        text_anio = new javax.swing.JComboBox<>();
        text_formato = new javax.swing.JComboBox<>();
        text_director = new javax.swing.JComboBox<>();
        text_clasificacion = new javax.swing.JComboBox<>();
        text_duracion = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_reparto = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        text_genero = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("NUEVA PELICULA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("REPARTO");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 168, 30));

        text_nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(text_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 230, 30));

        text_usuario.setText("Usuario: ");
        jPanel1.add(text_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("FORMATO");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 168, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("DIRECTOR");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 168, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CLASIFICACION");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 168, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("NOMBRE");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 168, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("AÑO");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 168, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("MINUTOS");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 110, 30));

        text_anio.setBackground(new java.awt.Color(153, 153, 255));
        text_anio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        text_anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_anioActionPerformed(evt);
            }
        });
        jPanel1.add(text_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 230, 30));

        text_formato.setBackground(new java.awt.Color(153, 153, 255));
        text_formato.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(text_formato, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 230, 30));

        text_director.setBackground(new java.awt.Color(153, 153, 255));
        text_director.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(text_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 230, 30));

        text_clasificacion.setBackground(new java.awt.Color(153, 153, 255));
        text_clasificacion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(text_clasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 230, 30));

        text_duracion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(text_duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 120, 30));

        text_reparto.setColumns(20);
        text_reparto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_reparto.setRows(5);
        jScrollPane1.setViewportView(text_reparto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 320, 190));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("AGREGAR PELICULA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 410, 50));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("DURACION");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 168, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("GENERO");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 168, 30));

        text_genero.setBackground(new java.awt.Color(153, 153, 255));
        text_genero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(text_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 230, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_anioActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        agregar_pelicula();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        regresar();
    }//GEN-LAST:event_jButton3MouseClicked
    public void regresar(){
        String us = "select id_privilegios from usuario where id_usuario = '"+usuario+"'";
        int result = 0;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(us);
            
            if(rs.next()){
                result = 1;
                if(result == 1){
                    int privilegios = rs.getInt("id_privilegios");
                    if(privilegios == 1){
                        admin form = new admin(usuario);
                        form.setVisible(true);
                        this.dispose();
                    }else if(privilegios == 2){
                        Ventas form = new Ventas(usuario);
                        form.setVisible(true);
                        this.dispose();
                    }else if(privilegios == 3){
                        bodega form = new bodega(usuario);
                        form.setVisible(true);
                        this.dispose();
                    }else if(privilegios == 4){
                        rrhh form = new rrhh(usuario);
                        form.setVisible(true);
                        this.dispose();
                    }
                }
            }else{
                System.out.println("Error: ");
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    public void agregar_pelicula(){
        String id_formato = formatos[text_formato.getSelectedIndex()][0];
        String id_estado = "1";
        String id_director = directores[text_director.getSelectedIndex()][0];
        String id_genero = generos[text_genero.getSelectedIndex()][0];
        String id_clasifiacion= clasificaciones[text_clasificacion.getSelectedIndex()][0];
        String nombre = text_nombre.getText();
        String anio = ""+text_anio.getSelectedItem();
        String duracion = String.valueOf(text_duracion.getValue());
        String reparto = text_reparto.getText();
        String stmt = "insert into pelicula values (default,'"+id_formato+"','"+id_estado+"','"+id_director+"','"+id_genero+"','"+id_clasifiacion+"','"+nombre+"','"+anio+"','"+duracion+"','"+reparto+"')";
        Statement st;
        if(id_formato == null || id_estado == null || id_director == null || id_clasifiacion == null || nombre == null || anio == null || duracion == null || reparto == null){
            JOptionPane.showMessageDialog(null,"CAMPOS INCOMPLETOS");
        }else{
            try{
                st = con.createStatement();
                st.executeUpdate(stmt);
                JOptionPane.showMessageDialog(null,"PELICULA AGREGADA CON EXITO");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: "+e);
            }
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
            java.util.logging.Logger.getLogger(pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pelicula(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> text_anio;
    private javax.swing.JComboBox<String> text_clasificacion;
    private javax.swing.JComboBox<String> text_director;
    private javax.swing.JSpinner text_duracion;
    private javax.swing.JComboBox<String> text_formato;
    private javax.swing.JComboBox<String> text_genero;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JTextArea text_reparto;
    private javax.swing.JLabel text_usuario;
    // End of variables declaration//GEN-END:variables
}
