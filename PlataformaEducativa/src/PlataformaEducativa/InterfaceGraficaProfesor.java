
package PlataformaEducativa;

import javax.swing.JLabel;


public class InterfaceGraficaProfesor extends javax.swing.JFrame {

    
    public InterfaceGraficaProfesor(String Nombre, String Materia, String Carrera, String Grado, String Grupo, String[] AlumnosGrupo, String[] ProfesoresCarrera) {
        initComponents();
        
        setTitle("Usuario Profesor:"+Nombre);//Titulo Ventana
        setLocationRelativeTo(null);//Centrar ventana
        
        //Panels transparentes
        ScrollAlumnosdeGrupo.setBackground(new java.awt.Color(250, 250, 250, 0));
        PanelAlumnosDeGrupo.setBackground(new java.awt.Color(250, 250, 250,0));
        PanelProfesCarrera.setBackground(new java.awt.Color(250, 250, 250, 0));
        ScrollProfesCarrera.setBackground(new java.awt.Color(250, 250, 250,0));
        
        
        //Se asignan los atributos del objeto a la interface
        this.TextBienvenido.setText("Bienvenido "+Nombre);
        this.TextMateria.setText(Materia);
        this.TextCarrera.setText(Carrera);
        this.TextGrado.setText(Grado);
        this.TextGrupo.setText(Grupo);
        this.TextGrado1.setText(Grado);
        this.TextGrupo1.setText(Grupo);
        this.setTitle("EDO- Educacion Online");//Titulo Ventana
        this.setLocationRelativeTo(null);//Centrar ventana
        
        int Lengt = 0;
         int contadorInterno = 0;
        for(int i=0; i<AlumnosGrupo.length; i++){
            Lengt =  AlumnosGrupo[i].length();
                if(Lengt>1){
                   
                contadorInterno++;
                
                JLabel EtiqAlumnoGrupo = new javax.swing.JLabel();
                EtiqAlumnoGrupo.setText(AlumnosGrupo[i]);
                EtiqAlumnoGrupo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                EtiqAlumnoGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                EtiqAlumnoGrupo.setToolTipText("");
            
                PanelAlumnosDeGrupo.add(EtiqAlumnoGrupo);
                
                if(contadorInterno>4){
                    PanelAlumnosDeGrupo.setLayout(new java.awt.GridLayout(0, 1));
                    if(contadorInterno>8){
                        ScrollAlumnosdeGrupo.setBackground(new java.awt.Color(250, 250, 250));
                        PanelAlumnosDeGrupo.setBackground(new java.awt.Color(250, 250, 250));
                    }
                }
                
            }
        }
        
        //Reseteamos el valor de variables para volver a utilizarlas
        Lengt = 0;
        contadorInterno = 0;
        for(int t=0; t<ProfesoresCarrera.length;t++ ){
            Lengt = ProfesoresCarrera[t].length();
            if(Lengt>1){
                contadorInterno++;
                
                JLabel EtiqProfeCarrera = new javax.swing.JLabel();
                EtiqProfeCarrera.setText(ProfesoresCarrera[t]);
                EtiqProfeCarrera.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                EtiqProfeCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                EtiqProfeCarrera.setToolTipText("");
                
                PanelProfesCarrera.add(EtiqProfeCarrera);
                
                if(contadorInterno>4){
                    PanelProfesCarrera.setLayout(new java.awt.GridLayout(0, 1));
                    if(contadorInterno>8){
                        ScrollProfesCarrera.setBackground(new java.awt.Color(250, 250, 250));
                        PanelProfesCarrera.setBackground(new java.awt.Color(250, 250, 250));
                    }
                }
                
            }
            
        }
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgPerfil = new javax.swing.JLabel();
        TextBienvenido = new javax.swing.JLabel();
        EtiquetaCarrera = new javax.swing.JLabel();
        TextCarrera = new javax.swing.JLabel();
        EtiquetaGrupo = new javax.swing.JLabel();
        TextGrupo = new javax.swing.JLabel();
        EtiquetaGrado = new javax.swing.JLabel();
        TextGrado = new javax.swing.JLabel();
        EtiquetaMate = new javax.swing.JLabel();
        TextMateria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        EtiquetaMaterias = new javax.swing.JLabel();
        EtiquetaCompañeros = new javax.swing.JLabel();
        TextGrado1 = new javax.swing.JLabel();
        TextGrupo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logotipoEDO = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        ScrollProfesCarrera = new javax.swing.JScrollPane();
        PanelProfesCarrera = new javax.swing.JPanel();
        ScrollAlumnosdeGrupo = new javax.swing.JScrollPane();
        PanelAlumnosDeGrupo = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPerfil.setBackground(new java.awt.Color(255, 255, 255));
        imgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/teacher.png"))); // NOI18N
        imgPerfil.setToolTipText("");
        imgPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(imgPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 158, 163));

        TextBienvenido.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        TextBienvenido.setForeground(new java.awt.Color(0, 187, 255));
        TextBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextBienvenido.setText("Bienvenido Juan Daniel Espindola");
        jPanel1.add(TextBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 585, -1));

        EtiquetaCarrera.setFont(new java.awt.Font("Arial Narrow", 1, 27)); // NOI18N
        EtiquetaCarrera.setText("Carrera asignada: ");
        jPanel1.add(EtiquetaCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        TextCarrera.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextCarrera.setForeground(new java.awt.Color(0, 187, 250));
        TextCarrera.setText("Contaduria");
        jPanel1.add(TextCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 347, 40));

        EtiquetaGrupo.setFont(new java.awt.Font("Arial Narrow", 1, 23)); // NOI18N
        EtiquetaGrupo.setText("Grupo asignado:");
        jPanel1.add(EtiquetaGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        TextGrupo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextGrupo.setForeground(new java.awt.Color(0, 187, 250));
        TextGrupo.setText("B");
        jPanel1.add(TextGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        EtiquetaGrado.setFont(new java.awt.Font("Arial Narrow", 1, 23)); // NOI18N
        EtiquetaGrado.setText("Grado asignado:");
        jPanel1.add(EtiquetaGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        TextGrado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextGrado.setForeground(new java.awt.Color(0, 187, 250));
        TextGrado.setText("6");
        jPanel1.add(TextGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        EtiquetaMate.setFont(new java.awt.Font("Arial Narrow", 1, 23)); // NOI18N
        EtiquetaMate.setText("Materia:");
        jPanel1.add(EtiquetaMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        TextMateria.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextMateria.setForeground(new java.awt.Color(0, 187, 250));
        TextMateria.setText("18");
        jPanel1.add(TextMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 420, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 226, 1061, 11));

        EtiquetaMaterias.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        EtiquetaMaterias.setForeground(new java.awt.Color(0, 187, 250));
        EtiquetaMaterias.setText("Alumnos del");
        jPanel1.add(EtiquetaMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        EtiquetaCompañeros.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        EtiquetaCompañeros.setForeground(new java.awt.Color(0, 187, 250));
        EtiquetaCompañeros.setText("Maestros de la carrera ");
        jPanel1.add(EtiquetaCompañeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 255, -1, -1));

        TextGrado1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TextGrado1.setForeground(new java.awt.Color(0, 187, 250));
        TextGrado1.setText("6");
        jPanel1.add(TextGrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        TextGrupo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TextGrupo1.setForeground(new java.awt.Color(0, 187, 250));
        TextGrupo1.setText("B");
        jPanel1.add(TextGrupo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Profesor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 188, -1, -1));

        logotipoEDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo.png"))); // NOI18N
        jPanel1.add(logotipoEDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

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
        jPanel1.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 473, 68, 37));

        ScrollProfesCarrera.setBorder(null);

        PanelProfesCarrera.setLayout(new java.awt.GridLayout(4, 1));
        ScrollProfesCarrera.setViewportView(PanelProfesCarrera);

        jPanel1.add(ScrollProfesCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 300, 170));

        ScrollAlumnosdeGrupo.setBorder(null);

        PanelAlumnosDeGrupo.setLayout(new java.awt.GridLayout(4, 1));
        ScrollAlumnosdeGrupo.setViewportView(PanelAlumnosDeGrupo);

        jPanel1.add(ScrollAlumnosdeGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, 170));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoProfe.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        Ventana InterfaceLogin = new Ventana();
        InterfaceLogin.Formulario();
        InterfaceLogin.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_BtnExitActionPerformed

    
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnExit;
    private javax.swing.JLabel EtiquetaCarrera;
    private javax.swing.JLabel EtiquetaCompañeros;
    private javax.swing.JLabel EtiquetaGrado;
    private javax.swing.JLabel EtiquetaGrupo;
    private javax.swing.JLabel EtiquetaMate;
    private javax.swing.JLabel EtiquetaMaterias;
    private javax.swing.JPanel PanelAlumnosDeGrupo;
    private javax.swing.JPanel PanelProfesCarrera;
    private javax.swing.JScrollPane ScrollAlumnosdeGrupo;
    private javax.swing.JScrollPane ScrollProfesCarrera;
    private javax.swing.JLabel TextBienvenido;
    private javax.swing.JLabel TextCarrera;
    private javax.swing.JLabel TextGrado;
    private javax.swing.JLabel TextGrado1;
    private javax.swing.JLabel TextGrupo;
    private javax.swing.JLabel TextGrupo1;
    private javax.swing.JLabel TextMateria;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logotipoEDO;
    // End of variables declaration//GEN-END:variables
}
