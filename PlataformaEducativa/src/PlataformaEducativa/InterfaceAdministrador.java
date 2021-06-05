package PlataformaEducativa;

import javax.swing.JLabel;

public class InterfaceAdministrador extends javax.swing.JFrame {
    
    //Var necesaria para la busqueda
    int UsuariosLengt= 0;    
    UsrAlumno[] UsrAlumnos;
    UsrProfesor[] Profes;
    
    
    public InterfaceAdministrador(String Nombre, UsrAlumno[] Alumnos, UsrProfesor[] Maestros, String[] Carreras, UsrAlumno[] ArrayAlumnos, UsrProfesor[] ArrayProfe) {
        initComponents();
        
        setTitle("Usuario Administrador:"+Nombre);//Titulo Ventana
        setLocationRelativeTo(null);//Centrar ventana
        
        UsrAlumnos = ArrayAlumnos;
        Profes = ArrayProfe;

        UsuariosLengt = (ArrayAlumnos.length+ArrayProfe.length);  
    
        this.TextBienvenido.setText("Bienvenido "+Nombre);
        
        
        int contadorInterno = 0;
        for(int i=0; i<Alumnos.length;i++){
            contadorInterno++;
            
            JLabel EtiqAlumnoGrupo = new javax.swing.JLabel();
            EtiqAlumnoGrupo.setText(Alumnos[i].getnombre());
            EtiqAlumnoGrupo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
            EtiqAlumnoGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            EtiqAlumnoGrupo.setToolTipText("");
            PanelAlumnos.add(EtiqAlumnoGrupo);
                
            if(contadorInterno>4){
                PanelAlumnos.setLayout(new java.awt.GridLayout(0, 1));
                if(contadorInterno>8){
                    ScrollAlumno.setBackground(new java.awt.Color(250, 250, 250));
                    PanelAlumnos.setBackground(new java.awt.Color(250, 250, 250));
                }
            }
        }
        
        //Reseteamos el valor de la variable para reutilizarla
        contadorInterno=0;
        
        
        for(int y=0; y<Maestros.length;y++){
            contadorInterno++;
            
            JLabel EtiqProfesor = new javax.swing.JLabel();
            EtiqProfesor.setText(Maestros[y].getnombre());
            EtiqProfesor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
            EtiqProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            EtiqProfesor.setToolTipText("");
            
            PanelProfesores.add(EtiqProfesor);
            
            if(contadorInterno>6){
                PanelProfesores.setLayout(new java.awt.GridLayout(0, 1));
                if(contadorInterno>8){
                    ScrollProfesor.setBackground(new java.awt.Color(250, 250, 250));
                    PanelProfesores.setBackground(new java.awt.Color(250, 250, 250));
                }
            }
        }
        
        int n=Carreras.length;
            for (int k=0;k<=n-1;k++){
		if(Carreras[k]!=""){
                    
                    JLabel EtiqCarrera = new javax.swing.JLabel();
                    EtiqCarrera.setText(Carreras[k]);
                    EtiqCarrera.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                    EtiqCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    EtiqCarrera.setToolTipText("");
                    PanelCarreras.add(EtiqCarrera);
		}
            }
        
        
        
            
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnExit = new javax.swing.JButton();
        TextBienvenido = new javax.swing.JLabel();
        imgPerfil = new javax.swing.JLabel();
        TipoUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ScrollProfesor = new javax.swing.JScrollPane();
        PanelProfesores = new javax.swing.JPanel();
        ScrollAlumno = new javax.swing.JScrollPane();
        PanelAlumnos = new javax.swing.JPanel();
        ScrollCarreras = new javax.swing.JScrollPane();
        PanelCarreras = new javax.swing.JPanel();
        InputBusqueda = new javax.swing.JTextField();
        BotonBusqueda = new javax.swing.JButton();
        ScrollBusqueda = new javax.swing.JScrollPane();
        PanelBusqueda = new javax.swing.JPanel();
        LabelIntrucciones = new javax.swing.JLabel();
        LabelIntrucciones1 = new javax.swing.JLabel();
        LabelIntrucciones2 = new javax.swing.JLabel();
        LabelIntrucciones3 = new javax.swing.JLabel();
        LabelIntrucciones4 = new javax.swing.JLabel();
        LabelIntrucciones5 = new javax.swing.JLabel();
        logotipoEDO = new javax.swing.JLabel();
        TextTitleBusqueda = new javax.swing.JLabel();
        TextTitleProfesores = new javax.swing.JLabel();
        TextTitleAlumnos = new javax.swing.JLabel();
        TextTitleCarreras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 68, 37));

        TextBienvenido.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        TextBienvenido.setForeground(new java.awt.Color(0, 187, 255));
        TextBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextBienvenido.setText("Bienvenido Juan Daniel Espindola");
        jPanel1.add(TextBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 540, -1));

        imgPerfil.setBackground(new java.awt.Color(255, 255, 255));
        imgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/working.png"))); // NOI18N
        imgPerfil.setToolTipText("");
        imgPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(imgPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 158, 163));

        TipoUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TipoUsuario.setText("Administrador");
        jPanel1.add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 192, 800, -1));

        PanelProfesores.setBackground(new java.awt.Color(250, 250, 250));
        PanelProfesores.setLayout(new java.awt.GridLayout(6, 1));
        ScrollProfesor.setViewportView(PanelProfesores);

        jPanel1.add(ScrollProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 170, 270));

        PanelAlumnos.setLayout(new java.awt.GridLayout(4, 1));
        ScrollAlumno.setViewportView(PanelAlumnos);

        jPanel1.add(ScrollAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 270));

        PanelCarreras.setBackground(new java.awt.Color(250, 250, 250));
        PanelCarreras.setLayout(new java.awt.GridLayout(6, 1));
        ScrollCarreras.setViewportView(PanelCarreras);

        jPanel1.add(ScrollCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 140, 270));

        InputBusqueda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InputBusqueda.setText("Buscar...");
        InputBusqueda.setToolTipText("");
        InputBusqueda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        InputBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(InputBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 120, 30));

        BotonBusqueda.setText("🔎");
        BotonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        PanelBusqueda.setBackground(new java.awt.Color(250, 250, 250));
        PanelBusqueda.setToolTipText("");
        PanelBusqueda.setLayout(new java.awt.GridLayout(6, 1));
        PanelBusqueda.add(LabelIntrucciones);
        PanelBusqueda.add(LabelIntrucciones1);

        LabelIntrucciones2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIntrucciones2.setText("Ingresa el nombre de un");
        PanelBusqueda.add(LabelIntrucciones2);

        LabelIntrucciones3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIntrucciones3.setText("Usuario");
        LabelIntrucciones3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PanelBusqueda.add(LabelIntrucciones3);
        PanelBusqueda.add(LabelIntrucciones4);
        PanelBusqueda.add(LabelIntrucciones5);

        ScrollBusqueda.setViewportView(PanelBusqueda);

        jPanel1.add(ScrollBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 180, 230));

        logotipoEDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo.png"))); // NOI18N
        jPanel1.add(logotipoEDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        TextTitleBusqueda.setBackground(new java.awt.Color(0, 187, 250));
        TextTitleBusqueda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextTitleBusqueda.setForeground(new java.awt.Color(0, 187, 250));
        TextTitleBusqueda.setText("Buscar Usuario");
        jPanel1.add(TextTitleBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        TextTitleProfesores.setBackground(new java.awt.Color(0, 187, 250));
        TextTitleProfesores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextTitleProfesores.setForeground(new java.awt.Color(0, 187, 250));
        TextTitleProfesores.setText("Profesores");
        jPanel1.add(TextTitleProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        TextTitleAlumnos.setBackground(new java.awt.Color(0, 187, 250));
        TextTitleAlumnos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextTitleAlumnos.setForeground(new java.awt.Color(0, 187, 250));
        TextTitleAlumnos.setText("Alumnos");
        jPanel1.add(TextTitleAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        TextTitleCarreras.setBackground(new java.awt.Color(0, 187, 250));
        TextTitleCarreras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextTitleCarreras.setForeground(new java.awt.Color(0, 187, 250));
        TextTitleCarreras.setText("Carreras");
        jPanel1.add(TextTitleCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoAdmi.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void BotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaActionPerformed
       
        //Var necesario para recorrer 2 array como iterador
        int q = 0, Resultado1 = 0, Resultado2=0;
        
        for(int e = 0; e<UsuariosLengt;e++){
            
            if(e<UsrAlumnos.length){
                
                
                if(UsrAlumnos[e].getNombreUsr().equals(InputBusqueda.getText())){
                    PanelBusqueda.removeAll();
                    
                    PanelBusqueda.setLayout(new java.awt.GridLayout(7, 1));
                    
                    JLabel EtResultadoTipoUsr = new javax.swing.JLabel();
                    EtResultadoTipoUsr.setText("Tipo de Usuario: Alumno");
                    EtResultadoTipoUsr.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoTipoUsr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoTipoUsr.setToolTipText("");
                    this.PanelBusqueda.add(EtResultadoTipoUsr);
                    
                    
                    JLabel EtResultadoNombre = new javax.swing.JLabel();
                    EtResultadoNombre.setText("Nombre: "+UsrAlumnos[e].getnombre());
                    EtResultadoNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoNombre.setToolTipText("");
                    PanelBusqueda.add(EtResultadoNombre);
                    
                    JLabel EtResultadoEdad = new javax.swing.JLabel();
                    EtResultadoEdad.setText("Edad: "+UsrAlumnos[e].getedad());
                    EtResultadoEdad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoEdad.setToolTipText("");
                    PanelBusqueda.add(EtResultadoEdad);
                    
                    JLabel EtResultadoCarrera = new javax.swing.JLabel();
                    EtResultadoCarrera.setText("Carrera: "+UsrAlumnos[e].getcarrera());
                    EtResultadoCarrera.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoCarrera.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoCarrera.setToolTipText("");
                    PanelBusqueda.add(EtResultadoCarrera);
                    
                    JLabel EtResultadoGrado = new javax.swing.JLabel();
                    EtResultadoGrado.setText("Grado: "+UsrAlumnos[e].getGrado());
                    EtResultadoGrado.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoGrado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoGrado.setToolTipText("");
                    PanelBusqueda.add(EtResultadoGrado);
                    
                    JLabel EtResultadoGrupo = new javax.swing.JLabel();
                    EtResultadoGrupo.setText("Grupo: "+UsrAlumnos[e].getGrupo());
                    EtResultadoGrupo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoGrupo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoGrupo.setToolTipText("");
                    PanelBusqueda.add(EtResultadoGrupo);
                    
                    JLabel EtResultadoNUsr = new javax.swing.JLabel();
                    EtResultadoNUsr.setText("N. Usuario: "+UsrAlumnos[e].getNombreUsr());
                    EtResultadoNUsr.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoNUsr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoNUsr.setToolTipText("");
                    PanelBusqueda.add(EtResultadoNUsr);
                    
                    
                    PanelBusqueda.updateUI();
                    
                    
                }else{
                    Resultado1++;
                    System.out.println("No resultado en Alumnos Inter:"+Resultado1);
                }
            }
            
            if(e>=UsrAlumnos.length){
                
                if(Profes[q].getNombreUsr().equals(InputBusqueda.getText())){
                    PanelBusqueda.removeAll();
                    
                    PanelBusqueda.setLayout(new java.awt.GridLayout(8, 1));
                    
                    JLabel EtResultadoTipoUsr = new javax.swing.JLabel();
                    EtResultadoTipoUsr.setText("Tipo de Usuario: Profesor");
                    EtResultadoTipoUsr.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoTipoUsr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoTipoUsr.setToolTipText("");
                    this.PanelBusqueda.add(EtResultadoTipoUsr);
                    
                    JLabel EtResultadoNombre = new javax.swing.JLabel();
                    EtResultadoNombre.setText("Nombre: "+Profes[q].getnombre());
                    EtResultadoNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoNombre.setToolTipText("");
                    this.PanelBusqueda.add(EtResultadoNombre);
                    
                    JLabel EtResultadoEdad = new javax.swing.JLabel();
                    EtResultadoEdad.setText("Edad: "+Profes[q].getedad());
                    EtResultadoEdad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoEdad.setToolTipText("");
                    PanelBusqueda.add(EtResultadoEdad);
                    
                    JLabel EtResultadoCarrera = new javax.swing.JLabel();
                    EtResultadoCarrera.setText("Carrera: "+Profes[q].getCarreraAsignada());
                    EtResultadoCarrera.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoCarrera.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoCarrera.setToolTipText("");
                    PanelBusqueda.add(EtResultadoCarrera);
                    
                    JLabel EtResultadoGrado = new javax.swing.JLabel();
                    EtResultadoGrado.setText("Grado Asignado: "+Profes[q].getGradoAsignado());
                    EtResultadoGrado.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoGrado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoGrado.setToolTipText("");
                    PanelBusqueda.add(EtResultadoGrado);
                    
                    JLabel EtResultadoGrupo = new javax.swing.JLabel();
                    EtResultadoGrupo.setText("Grupo Asignado: "+Profes[q].getGrupoAsignado());
                    EtResultadoGrupo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoGrupo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoGrupo.setToolTipText("");
                    PanelBusqueda.add(EtResultadoGrupo);
                    
                    JLabel EtResultadoNUsr = new javax.swing.JLabel();
                    EtResultadoNUsr.setText("N. Usuario: "+Profes[q].getNombreUsr());
                    EtResultadoNUsr.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoNUsr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoNUsr.setToolTipText("");
                    PanelBusqueda.add(EtResultadoNUsr);
                    
                    
                    JLabel EtResultadoMateriaImp = new javax.swing.JLabel();
                    EtResultadoMateriaImp.setText("Materia: "+Profes[q].getMateriaImpartida());
                    EtResultadoMateriaImp.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtResultadoMateriaImp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtResultadoMateriaImp.setToolTipText("");
                    PanelBusqueda.add(EtResultadoMateriaImp);
                    

                    
                    PanelBusqueda.updateUI();
                }
                else{
                    
                    Resultado2++;
                    System.out.println("No resultado en Profes Inter:"+Resultado2);
                }
                
                //A este if solo entrara si no existe ningun resultado 
                if(Resultado1== UsrAlumnos.length&& Resultado2==Profes.length){
                    System.out.println("Mensaje por defecto");
                    PanelBusqueda.setLayout(new java.awt.GridLayout(6, 1));
                    
                    
                    PanelBusqueda.removeAll();
                    
                    JLabel EtSinResul = new javax.swing.JLabel();
                    EtSinResul.setText("");
                    EtSinResul.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtSinResul.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtSinResul.setToolTipText("");
                    PanelBusqueda.add(EtSinResul);
                    
                    JLabel EtSinResul1 = new javax.swing.JLabel();
                    EtSinResul1.setText("");
                    EtSinResul1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtSinResul1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    EtSinResul1.setToolTipText("");
                    PanelBusqueda.add(EtSinResul1);
                    
                    
                    
                    JLabel EtSinResul3 = new javax.swing.JLabel();
                    EtSinResul3.setText("Sin resultados...");
                    EtSinResul3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
                    EtSinResul3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    EtSinResul3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                    EtSinResul3.setToolTipText("");
                    PanelBusqueda.add(EtSinResul3);
                    
                    PanelBusqueda.updateUI();
                }
                q++;
            }
            
        }
        Resultado1=0;
        Resultado2=0;
        
        
    }//GEN-LAST:event_BotonBusquedaActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        Ventana InterfaceLogin = new Ventana();
        InterfaceLogin.Formulario();
        InterfaceLogin.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void InputBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputBusquedaActionPerformed

    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBusqueda;
    private javax.swing.JButton BtnExit;
    private javax.swing.JTextField InputBusqueda;
    private javax.swing.JLabel LabelIntrucciones;
    private javax.swing.JLabel LabelIntrucciones1;
    private javax.swing.JLabel LabelIntrucciones2;
    private javax.swing.JLabel LabelIntrucciones3;
    private javax.swing.JLabel LabelIntrucciones4;
    private javax.swing.JLabel LabelIntrucciones5;
    private javax.swing.JPanel PanelAlumnos;
    private javax.swing.JPanel PanelBusqueda;
    private javax.swing.JPanel PanelCarreras;
    private javax.swing.JPanel PanelProfesores;
    private javax.swing.JScrollPane ScrollAlumno;
    private javax.swing.JScrollPane ScrollBusqueda;
    private javax.swing.JScrollPane ScrollCarreras;
    private javax.swing.JScrollPane ScrollProfesor;
    private javax.swing.JLabel TextBienvenido;
    private javax.swing.JLabel TextTitleAlumnos;
    private javax.swing.JLabel TextTitleBusqueda;
    private javax.swing.JLabel TextTitleCarreras;
    private javax.swing.JLabel TextTitleProfesores;
    private javax.swing.JLabel TipoUsuario;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logotipoEDO;
    // End of variables declaration//GEN-END:variables
}
