/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaEducativa;

import javax.swing.JLabel;

/**
 *
 * @author JUAN DANIEL
 */
public class InterfaceGrafica extends javax.swing.JFrame {

    
    
    public InterfaceGrafica(String Nombre, String Edad, String Carrera, String Grado, String Grupo, String[] Companieros, String[] MateriasAlumno, String[]ProfesoresAlumno) {
        initComponents();
        
        //Fondo transparente para paneles
        jScrollPane1.setBackground(new java.awt.Color(250, 250, 250, 0));
        PanelCompanieros.setBackground(new java.awt.Color(250, 250, 250,0));
        ScrollProfesor.setBackground(new java.awt.Color(250, 250, 250, 0));
        PanelProfesor.setBackground(new java.awt.Color(250, 250, 250,0));
        PanelMaterias.setBackground(new java.awt.Color(250, 250, 250, 0));
        ScrollMateria.setBackground(new java.awt.Color(250, 250, 250,0));
        
        
        this.setLayout(null);
        setTitle("Usuario Alumno:"+Nombre);//Titulo Ventana
        setLocationRelativeTo(null);//Centrar ventana
        
        //Se asignan los atributos del objeto a la interface
        this.TextBienvenido.setText("Bienvenido "+Nombre);
        this.TextEdad.setText(Edad);
        this.TextCarrera.setText(Carrera);
        this.TextGrado.setText(Grado);
        this.TextGrupo.setText(Grupo);
        
        int contadorInterno = 0;
        for(int i=0; i<Companieros.length; i++){
            int Lengt = Companieros[i].length();
            
            if(Lengt>1){
                
                contadorInterno++;
                
                JLabel EtiqCompaniero = new javax.swing.JLabel();
                EtiqCompaniero.setText(Companieros[i]);
                EtiqCompaniero.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                EtiqCompaniero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                EtiqCompaniero.setToolTipText("");
            
                PanelCompanieros.add(EtiqCompaniero);
                System.out.println("Contador de compañeros: "+contadorInterno);
                if(contadorInterno>4){
                    System.out.println("Modificando Grid");
                    PanelCompanieros.setLayout(new java.awt.GridLayout(0, 1));
                    if(contadorInterno>8){
                        jScrollPane1.setBackground(new java.awt.Color(250, 250, 250));
                        PanelCompanieros.setBackground(new java.awt.Color(250, 250, 250));
                    }
                }
            }
        }
        
        jScrollPane1.setViewportView(PanelCompanieros);
        
        
        
        int contadorInternoMat = 0;
        for(int y=0; y<MateriasAlumno.length; y++){
            int LongtMateria = MateriasAlumno[y].length();
            
            
            if(LongtMateria>1){
                
                contadorInternoMat++;
                
                JLabel EtiqMateria = new javax.swing.JLabel();
                EtiqMateria.setText(MateriasAlumno[y]);
                EtiqMateria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                EtiqMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                EtiqMateria.setToolTipText("");    
            
                JLabel EtiquetaProfe = new javax.swing.JLabel();
                EtiquetaProfe.setText(ProfesoresAlumno[y]);
                EtiquetaProfe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                EtiquetaProfe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                EtiquetaProfe.setToolTipText("");    
                
                
                PanelMaterias.add(EtiqMateria);
                PanelProfesor.add(EtiquetaProfe);
                
                if(contadorInternoMat>4){
                    PanelMaterias.setLayout(new java.awt.GridLayout(0, 1));
                    PanelProfesor.setLayout(new java.awt.GridLayout(0, 1));
                    if(contadorInternoMat>8){
                        ScrollMateria.setBackground(new java.awt.Color(250, 250, 250));
                        PanelMaterias.setBackground(new java.awt.Color(250, 250, 250));
                        
                        PanelMaterias.setBackground(new java.awt.Color(250, 250, 250));
                        PanelProfesor.setBackground(new java.awt.Color(250, 250, 250));
                    }
                }
            }
        }   
        
        
        
        //Actualizamos el panel
        //PanelCompanieros.updateUI();
        PanelProfesor.updateUI();
        PanelMaterias.updateUI();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        imgPerfil = new javax.swing.JLabel();
        TextBienvenido = new javax.swing.JLabel();
        EtiquetaCarrera = new javax.swing.JLabel();
        TextCarrera = new javax.swing.JLabel();
        EtiquetaGrupo = new javax.swing.JLabel();
        TextGrupo = new javax.swing.JLabel();
        EtiquetaGrado = new javax.swing.JLabel();
        TextGrado = new javax.swing.JLabel();
        EtiquetaEdad = new javax.swing.JLabel();
        TextEdad = new javax.swing.JLabel();
        TextEdadAnios = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        EtiquetaMaterias = new javax.swing.JLabel();
        EtiquetaCompañeros = new javax.swing.JLabel();
        EtiquetaProfesores = new javax.swing.JLabel();
        logotipoEDO = new javax.swing.JLabel();
        TipoUsuario = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelCompanieros = new javax.swing.JPanel();
        ScrollProfesor = new javax.swing.JScrollPane();
        PanelProfesor = new javax.swing.JPanel();
        ScrollMateria = new javax.swing.JScrollPane();
        PanelMaterias = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        TextBienvenido1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPerfil.setBackground(new java.awt.Color(255, 255, 255));
        imgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/student.png"))); // NOI18N
        imgPerfil.setToolTipText("");
        imgPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(imgPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 158, 163));

        TextBienvenido.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        TextBienvenido.setForeground(new java.awt.Color(0, 187, 255));
        TextBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextBienvenido.setText("Bienvenido Verónica Hernández González");
        jPanel1.add(TextBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 54, 600, -1));

        EtiquetaCarrera.setFont(new java.awt.Font("Arial Narrow", 1, 27)); // NOI18N
        EtiquetaCarrera.setText("Carrera: ");
        jPanel1.add(EtiquetaCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 114, -1, -1));

        TextCarrera.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextCarrera.setForeground(new java.awt.Color(0, 187, 250));
        TextCarrera.setText("Contaduria");
        jPanel1.add(TextCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 117, 347, -1));

        EtiquetaGrupo.setFont(new java.awt.Font("Arial Narrow", 1, 27)); // NOI18N
        EtiquetaGrupo.setText("Grupo:");
        jPanel1.add(EtiquetaGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 164, -1, -1));

        TextGrupo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextGrupo.setForeground(new java.awt.Color(0, 187, 250));
        TextGrupo.setText("B");
        jPanel1.add(TextGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 167, -1, -1));

        EtiquetaGrado.setFont(new java.awt.Font("Arial Narrow", 1, 27)); // NOI18N
        EtiquetaGrado.setText("Grado:");
        jPanel1.add(EtiquetaGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 164, -1, -1));

        TextGrado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextGrado.setForeground(new java.awt.Color(0, 187, 250));
        TextGrado.setText("6");
        jPanel1.add(TextGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 167, -1, -1));

        EtiquetaEdad.setFont(new java.awt.Font("Arial Narrow", 1, 27)); // NOI18N
        EtiquetaEdad.setText("Edad:");
        jPanel1.add(EtiquetaEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 164, -1, -1));

        TextEdad.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextEdad.setForeground(new java.awt.Color(0, 187, 250));
        TextEdad.setText("18");
        jPanel1.add(TextEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 167, -1, -1));

        TextEdadAnios.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextEdadAnios.setForeground(new java.awt.Color(0, 187, 250));
        TextEdadAnios.setText("años");
        jPanel1.add(TextEdadAnios, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 167, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 800, 20));

        EtiquetaMaterias.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        EtiquetaMaterias.setForeground(new java.awt.Color(0, 187, 250));
        EtiquetaMaterias.setText("Tus Materias");
        jPanel1.add(EtiquetaMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        EtiquetaCompañeros.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        EtiquetaCompañeros.setForeground(new java.awt.Color(0, 187, 250));
        EtiquetaCompañeros.setText("Tus Compañeros");
        jPanel1.add(EtiquetaCompañeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 269, -1, -1));

        EtiquetaProfesores.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        EtiquetaProfesores.setForeground(new java.awt.Color(0, 187, 250));
        EtiquetaProfesores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaProfesores.setText("Tus Profesores");
        jPanel1.add(EtiquetaProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        logotipoEDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo.png"))); // NOI18N
        jPanel1.add(logotipoEDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        TipoUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TipoUsuario.setText("Alumno");
        jPanel1.add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        BtnExit.setBackground(new java.awt.Color(185, 43, 39));
        BtnExit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnExit.setForeground(new java.awt.Color(250, 250, 250));
        BtnExit.setText("Salir");
        BtnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 1, true));
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 68, 37));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setHorizontalScrollBar(null);

        PanelCompanieros.setBackground(new java.awt.Color(250, 250, 250));
        PanelCompanieros.setForeground(new java.awt.Color(255, 255, 255));
        PanelCompanieros.setLayout(new java.awt.GridLayout(4, 1));
        jScrollPane1.setViewportView(PanelCompanieros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 210, 180));

        ScrollProfesor.setBorder(null);
        ScrollProfesor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollProfesor.setToolTipText("");

        PanelProfesor.setBackground(new java.awt.Color(250, 250, 250));
        PanelProfesor.setForeground(new java.awt.Color(255, 255, 255));
        PanelProfesor.setLayout(new java.awt.GridLayout(4, 1));
        ScrollProfesor.setViewportView(PanelProfesor);

        jPanel1.add(ScrollProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 210, 180));

        ScrollMateria.setBorder(null);

        PanelMaterias.setLayout(new java.awt.GridLayout(4, 1));
        ScrollMateria.setViewportView(PanelMaterias);

        jPanel1.add(ScrollMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 220, 180));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoAlumno.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TextBienvenido1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        TextBienvenido1.setForeground(new java.awt.Color(0, 187, 255));
        TextBienvenido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextBienvenido1.setText("Bienvenido Juan Daniel Espindola");
        jPanel1.add(TextBienvenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 54, 580, -1));

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

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
       Ventana InterfaceLogin = new Ventana();
        InterfaceLogin.Formulario();
        InterfaceLogin.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_BtnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JLabel EtiquetaCarrera;
    private javax.swing.JLabel EtiquetaCompañeros;
    private javax.swing.JLabel EtiquetaEdad;
    private javax.swing.JLabel EtiquetaGrado;
    private javax.swing.JLabel EtiquetaGrupo;
    private javax.swing.JLabel EtiquetaMaterias;
    private javax.swing.JLabel EtiquetaProfesores;
    private javax.swing.JPanel PanelCompanieros;
    private javax.swing.JPanel PanelMaterias;
    private javax.swing.JPanel PanelProfesor;
    private javax.swing.JScrollPane ScrollMateria;
    private javax.swing.JScrollPane ScrollProfesor;
    private javax.swing.JLabel TextBienvenido;
    private javax.swing.JLabel TextBienvenido1;
    private javax.swing.JLabel TextCarrera;
    private javax.swing.JLabel TextEdad;
    private javax.swing.JLabel TextEdadAnios;
    private javax.swing.JLabel TextGrado;
    private javax.swing.JLabel TextGrupo;
    private javax.swing.JLabel TipoUsuario;
    private javax.swing.JLabel background;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logotipoEDO;
    // End of variables declaration//GEN-END:variables
}
