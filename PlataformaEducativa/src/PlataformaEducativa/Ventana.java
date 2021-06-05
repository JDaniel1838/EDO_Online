package PlataformaEducativa;

//Librerias y Recursos

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana  extends JFrame{
    PanelLogin panelLogin;
    JPanel panelUsr;
    
    //Atributos que necesitamos para los metodos
    private UsrAlumno Alumnos[] = new UsrAlumno[31];
    private UsrProfesor Maestros[] = new UsrProfesor[12];
    private UsrAdministrador Administrador[]  = new UsrAdministrador[1];
        
        
        //Atributos que se mostraran en la interface grafica
        //creamos todos los atributos de los objetos y con el metodo ObtenerDatosParaInterface() le agregamos a nuestro objeto las que necesitamos
        private String Nombre = "", edad="", carrera = "", Grado="", Grupo = "", MateriaImpartida = "", GrupoAsignado = "", GradoAsignado="", CarreraAsignadaProfe="";
        
        
        //Var que tiene el total de usuarios
        private int totalUsr = Alumnos.length + Maestros.length +  Administrador.length;       
        private String NombresDeUsr[] = new String[totalUsr], Contrasenias[] = new String[totalUsr], 
                
        //Atributos del Objeto alumno
        Companieros[] = new String[Alumnos.length], MateriasAlumno[] = new String [Maestros.length], ProfesoresAlumno[] = new String [Maestros.length],
        
        //Atributos del Objeto Profesor
        AlumnosDeUnGrupo[] = new String[Alumnos.length], ProfesoresDeCarrera[] = new String[Maestros.length],
        
        //Atributos del Objeto Administrador
        Carreras[] = new String[Maestros.length]; 
        
       
        
        
        //Variables que necesitamos para la validacion de Usuario y Contraseña
        private String NomUsuario="",password="";
        private int BuscarUsr = 0, BuscarPassw= 0;
        boolean NUsuariotrue = false, passwordtrue= false;
    
    //Metodo Constructor
    public Ventana(){//Metodo Contructor
        setSize(800, 530); //Tamaño de la ventana
        setTitle("EDO - Educacion Online");//Titulo Ventana
        setLocationRelativeTo(null);//Centrar ventana
        setResizable(false);//No se puede redimencionar la ventana
        panelLogin = new PanelLogin();
        panelLogin.setLayout(null);
        aniadirPanelConFondo(1, panelLogin);
        
        
        //Metodos que se autoejecutan
        LeerUsuarios();
        ObtenerDatosUsr();
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Finalizar Ventana
    }
    
    
    
    //Metodo que lee los datos, crea los objetos y asigna los datos como valor a los atributos del objSeto
    private void LeerUsuarios(){
            //Ingreso de datos de Alumno;
            Alumnos[0] = new UsrAlumno("Jaime Garcia González", "22", "Jaime232", "n9r24eq", "Mercadotecnia", "1", "C");
            Alumnos[1] = new UsrAlumno("Maria Ortega Chávez", "19", "Mari405", "193c2s", "Contabilidad", "1","C");
            Alumnos[2] = new UsrAlumno("Carlos Moreno Chávez", "21", "Carlos231", "MiContraseña", "Administración", "1","C");
            Alumnos[3] = new UsrAlumno("Domingo Castillo Barrón", "25", "Domingo15", "4b3w7s2", "Mercadotecnia", "1","C");
            Alumnos[4] = new UsrAlumno("Daniel Torres Orozco", "23", "Daniel246", "2923", "Contabilidad", "1","C");
            Alumnos[5] = new UsrAlumno("Roberto Arenas Trejo", "22", "Roberto12", "1294", "Administración", "1", "C");
            Alumnos[6] = new UsrAlumno("Antonio Montaña Palacios", "19", "Antonio243", "34030", "Mercadotecnia", "1","C");
            Alumnos[7] = new UsrAlumno("Jacobo  Gómez Prado", "21", "Jacobo456", "30w0d", "Contabilidad", "1","C");
            Alumnos[8] = new UsrAlumno("Humberto Avalos Herrera", "25", "Avalos12", "2033esw", "Administración", "1","C");
            Alumnos[9] = new UsrAlumno("Alejandra Ruiz Lara", "23", "Ale244", "1233223", "Mercadotecnia", "1","C");
            Alumnos[10] = new UsrAlumno("Ramiro  Pérez Lunar", "21", "Ramiro233", "200ww", "Contabilidad", "1","C");
            Alumnos[11] = new UsrAlumno("Danilo Ruiz Morales", "25", "Danilo267", "20d0e", "Administración", "1","C");
            Alumnos[12] = new UsrAlumno("Miguel Hernández Prado", "22", "Miguel203", "nxnans", "Mercadotecnia", "1", "C");
            Alumnos[13] = new UsrAlumno("Fernando Herrera Arias", "25", "Fernando124", "cmdmd", "Contabilidad", "1","C");
            Alumnos[14] = new UsrAlumno("Yaír Chávez Moreno", "23", "Yaír122", "dendne", "Administración", "1","C");
            Alumnos[15] = new UsrAlumno("Jessica Arenas Trejo", "22", "Jessica121", "100ssmcdm", "Mercadotecnia", "2", "B");
            Alumnos[16] = new UsrAlumno("Itzel Nuñez Garcia", "19", "Itzel123", "ede99edee", "Contabilidad", "2","B");
            Alumnos[17] = new UsrAlumno("Esteban Reyes Saldaña", "21", "Esteban787", "2uarr38d", "Administración", "2","B");
            Alumnos[18] = new UsrAlumno("Mariana Sánchez Cid", "25", "Mariana236", "10d2232", "Mercadotecnia", "2","B");
            Alumnos[19] = new UsrAlumno("Karla Flores Silva", "23", "Karla056", "1233223", "Contabilidad", "2","B");
            Alumnos[20] = new UsrAlumno("Ariana Delgado Barrón", "21", "Ariana02", "2uarr38d", "Administración", "2","B");
            Alumnos[21] = new UsrAlumno("Andres Flores Aguilar", "25", "Andres342", "10d2232", "Mercadotecnia", "2","B");
            Alumnos[22] = new UsrAlumno("Verónica Hernández González", "22", "Verónica232", "n9r24eq", "Contabilidad", "2", "B");
            Alumnos[23] = new UsrAlumno("Samanta Lara Cortés", "25", "Samanta783", "4b3w7s2", "Administración", "2","B");
            Alumnos[24] = new UsrAlumno("Diana Morales Moreno", "23", "Diana75", "123", "Mercadotecnia", "2","B");
            Alumnos[25] = new UsrAlumno("Laura Chávez Hernández", "22", "Laura124", "12mdmd", "Contabilidad", "2", "B");
            Alumnos[26] = new UsrAlumno("Alejandra Flores Garcia", "19", "Alejandra673", "ldsa22ws", "Administración", "2","B");
            Alumnos[27] = new UsrAlumno("Rosa Reyes Chávez", "21", "Rosa022", "2uarr38d", "Mercadotecnia", "2","B");
            Alumnos[28] = new UsrAlumno("Andrea Cid Herrera", "25", "Andrea205", "10d2232", "Contabilidad", "2","B");
            Alumnos[29] = new UsrAlumno("Angel Sánchez Moreno", "23", "Angel035", "1233223", "Administración", "2","B");
            Alumnos[30] = new UsrAlumno("Ignacio Prado Arias", "21", "Ignacio355", "2uarr38d", "Mercadotecnia", "2","B");
            
            
            //Ingreso de datos de profesor
            Maestros[0] = new UsrProfesor("Patricia Viveros", "30","Pati123","2bx25d","Ingles","1","C", "Administración");
            Maestros[1] = new UsrProfesor("Pablo Maldonado", "35","Pablo343","13334","Estadística","1","C", "Administración");
            Maestros[2] = new UsrProfesor("Pedro Acebedo", "33","Pedro232","w21q24","Estadística","2","B", "Administración");
            Maestros[3] = new UsrProfesor("Ana Gómez", "39","Ana232","4545wew","Derecho Mercantil","2","B", "Administración");
            
            Maestros[4] = new UsrProfesor("Antonio Moreno", "30","Antonio232","2bx25d","Ingles","1","C", "Mercadotecnia");
            Maestros[5] = new UsrProfesor("Rosalía López", "35","Rosalía65","133121","Publicidad","1","C", "Mercadotecnia");
            Maestros[6] = new UsrProfesor("Rosalía Hernández", "33","Rosalía12","w21q24","Comercio Internacional","2","B", "Mercadotecnia");
            Maestros[7] = new UsrProfesor("Diana Silva", "39","Diana232","4545wew","Matematicas","2","B", "Mercadotecnia");
            
            Maestros[8] = new UsrProfesor("Adolfo Acosta", "30","Adolfo3443","2bx25d","Ingles","1","C", "Contabilidad");
            Maestros[9] = new UsrProfesor("Alonso Navarro", "35","Alonso7432","133","Auditoría","1","C", "Contabilidad");
            Maestros[10] = new UsrProfesor("Rafael Andrade", "33","Rafael3434","w21q24","Finanzas","2","B", "Contabilidad");
            Maestros[11] = new UsrProfesor("Javier Ovalle", "39","Javier043","4545wew","Derecho Fiscal","2","B", "Contabilidad");
            
            
            //Ingreso de datos de administrador
            Administrador[0] = new UsrAdministrador("Ruben Sánchez","28","Ruben123","123");
            
            
    }
    
    
    
    //De los objetos creados vamos a obtener el nombre de usuario y su contraseño, estos datos los vamos a guardar el arrays
    
    private  void ObtenerDatosUsr(){
        
        
        int c = 0; //contador
        for(int i=0;i<Alumnos.length;i++){
            
            //System.out.println("Usr:"+Alumnos[i].getNombreUsr());
            NombresDeUsr[c] = Alumnos[i].getNombreUsr();//Agregamos el valor a nuestro array con todos los usuarios
            Contrasenias[c] = Alumnos[i].getcontrasenia();
            c++;
        }
        
        for(int j=0;j<Maestros.length;j++){
            
            //System.out.println("Usr:"+Maestros[j].getNombreUsr());
            NombresDeUsr[c] = Maestros[j].getNombreUsr();//Agregamos el valor a nuestro array con todos los usuarios
            Contrasenias[c] = Maestros[j].getcontrasenia();
            c++;
        }
        
        for(int w=0;w<Administrador.length;w++){
            
            //System.out.println("Usr:"+Administrador[w].getNombreUsr());
            NombresDeUsr[c] = Administrador[w].getNombreUsr();//Agregamos el valor a nuestro array con todos los usuarios
            Contrasenias[c] = Administrador[w].getcontrasenia();
            c++;
        }
        
    }
    
    
    //Metodo que devuelve los compañeros de un alumno
    private void CompanierosDeAlumno(String Carrera, String Grado, String Grupo, UsrAlumno[] Array, int Indice){
        boolean SalonVacio= true;
        
        
        for (int x = 0; x < Array.length; x++) {
           Companieros[x]="";//le damos un valor por defecto a cada posicion del array
            if (Array[x].getcarrera().equals(Carrera) && Array[x].getGrado().equals(Grado) && Array[x].getGrupo().equals(Grupo)) {
                SalonVacio = false;
                if(x!= Indice){
                    Companieros[x] = Array[x].getnombre();
                }    
            }
            
        }
        
        
        if(SalonVacio==true){
            System.out.println("Tu aun no tines compañeros de clase");
        }
        
        
    }
    
    private void AlumnosDeGrupo(String Carrera, String Grado, String Grupo, UsrAlumno[] Array){
        
        for (int x = 0; x < Array.length; x++) {
            AlumnosDeUnGrupo[x]= "";
            
            
            
            if (Array[x].getcarrera().equals(Carrera) && Array[x].getGrado().equals(Grado) && Array[x].getGrupo().equals(Grupo)) {
                
                AlumnosDeUnGrupo[x] = Array[x].getnombre();
                
            }
        }
        
    }
    
    private void MaestrosCarrera(UsrProfesor[] Array, String Carrera ){
        for(int w=0; w<Array.length; w++){
            ProfesoresDeCarrera[w]= "";
            
            if(Array[w].getCarreraAsignada().equals(Carrera)){
                ProfesoresDeCarrera[w]= Array[w].getnombre();
            }
        }
    }
    
    //Metodo que devuelve los profesores que dan una materia, en un grupo determinado
    private void ProfesordeMateria(String Carrera, String Grado, String Grupo, UsrProfesor[] Array){
        
        for (int x = 0; x < Array.length; x++) {
            MateriasAlumno[x]= "";
            ProfesoresAlumno[x]= "";
            
            
            if (Array[x].getCarreraAsignada().equals(Carrera) && Array[x].getGradoAsignado().equals(Grado) && Array[x].getGrupoAsignado().equals(Grupo)) {
                
                MateriasAlumno[x] = Array[x].getMateriaImpartida();
                ProfesoresAlumno[x] = Array[x].getnombre();
            }
        }
        
    }
    
    //Metodo de Administrador que devuelve todas las carreras que estan el plataforma{
    private void CarrerasEnPlataforma(UsrProfesor[] Maestros){
        for(int c=0; c<Maestros.length;c++){
            
            Carreras[c]= Maestros[c].getCarreraAsignada();
            
            
            for(int i=0;i<Carreras.length;i++){
                
                for(int j=0;j<Carreras.length-1;j++){
                    if(i!=j){
			if(Carreras[i]==Carreras[j]){
                            // eliminamos su valor
			Carreras[i]="";
			}
                    }
		}
            }
        }
        
        int n=Carreras.length;
            for (int k=0;k<=n-1;k++){
		if(Carreras[k]!=""){
                    System.out.println( Carreras[k]);
		}
            }
        
        
    }

    //Metodo que sirve para validar si un valor existe en un arreglo
    private static int BuscarUsuario(String[] arreglo, String busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x].equals(busqueda)) {
                System.out.println("Se a encontrado a el usuario: "+busqueda+" en la base de datos");
                return x;
                
            }
        }
        return -1;
    }
    
    //Le pasas el index de el usuario y validara si la contraseña corresponde a ese usuario
    private static int BuscarPassword(int IndexUsuario, String busqueda, String[] Array) {
        
            if (Array[IndexUsuario].equals(busqueda)) {
                System.out.println("La contraseña ingresa coinside con el usuario");
                return IndexUsuario;
                
            }else{
                 return -1;
            }   
    }
    

    //Metodo que añade fondo a la el panel
    public void aniadirPanelConFondo(int opcion, PanelLogin NamePanel){
        if(opcion==1){
            this.getContentPane().add(NamePanel);
        }
        if(opcion==2){
            this.getContentPane().remove(NamePanel);
            panelLogin= null;
        }
    }
    
    
    
    //Metodo que crea una nueva ventana
    
    
    private void ObtenerDatosParaInterface(int indexUsr){
        
        int IndexArrayInterno = 0;
        
        
        if(indexUsr>=0 && indexUsr<Alumnos.length){
            
            IndexArrayInterno = indexUsr;
            
            /*Asignamos los atributos correspodientes dependiendo del tipo de objeto*/
            Nombre = Alumnos[IndexArrayInterno].getnombre();
            edad = Alumnos[IndexArrayInterno].getedad();
            carrera = Alumnos[IndexArrayInterno].getcarrera();
            Grado = Alumnos[IndexArrayInterno].getGrado();
            Grupo = Alumnos[IndexArrayInterno].getGrupo();
            
            
            CompanierosDeAlumno(carrera,Grado,Grupo, Alumnos, IndexArrayInterno);
            ProfesordeMateria(carrera, Grado, Grupo, Maestros);
            
            InterfaceGrafica MiInterface = new InterfaceGrafica(Nombre, edad, carrera, Grado, Grupo, Companieros, MateriasAlumno, ProfesoresAlumno);
            MiInterface.setVisible(true);
            this.setVisible(false);
            
        }
        
        
              
        if(indexUsr>=Alumnos.length && indexUsr<(Alumnos.length+Maestros.length)){
            IndexArrayInterno = (indexUsr-Alumnos.length);
            
            /*Asignamos los atributos correspodientes dependiendo del tipo de objeto*/
            Nombre = Maestros[IndexArrayInterno].getnombre();
            edad = Maestros[IndexArrayInterno].getedad();
            MateriaImpartida = Maestros[IndexArrayInterno].getMateriaImpartida();
            GrupoAsignado = Maestros[IndexArrayInterno].getGrupoAsignado();
            GradoAsignado = Maestros[IndexArrayInterno].getGradoAsignado();
            CarreraAsignadaProfe = Maestros[IndexArrayInterno].getCarreraAsignada();
        
            AlumnosDeGrupo(CarreraAsignadaProfe, GradoAsignado, GrupoAsignado, Alumnos);
            MaestrosCarrera(Maestros, CarreraAsignadaProfe);
            
            InterfaceGraficaProfesor MiInterfaceProfesor = new InterfaceGraficaProfesor(Nombre, MateriaImpartida, CarreraAsignadaProfe, GradoAsignado, GrupoAsignado,AlumnosDeUnGrupo, ProfesoresDeCarrera);
            MiInterfaceProfesor.setVisible(true);
            this.setVisible(false);
            
        }
        
        if(indexUsr>=(Alumnos.length+Maestros.length) && indexUsr<=(Alumnos.length+Maestros.length+Administrador.length)){
            IndexArrayInterno = (indexUsr-(Alumnos.length+Maestros.length));
            
            /*Asignamos los atributos correspodientes dependiendo del tipo de objeto*/
            Nombre = Administrador[IndexArrayInterno].getnombre();
            edad = Administrador[IndexArrayInterno].getedad();
            
            CarrerasEnPlataforma(Maestros);
            
            InterfaceAdministrador MiInterfaceAdministrador = new InterfaceAdministrador(Nombre, Alumnos, Maestros, Carreras, Alumnos, Maestros);
            MiInterfaceAdministrador.setVisible(true);
             this.setVisible(false);
            
        }
           
    }
    
    
    
    public void Formulario(){
        //Estilos 
        
        //Boton de Enviar
        JButton btnEnviar = new JButton();
        btnEnviar.setBounds(300, 285, 200, 40);
        btnEnviar.setEnabled(true);
        btnEnviar.setForeground(java.awt.Color.WHITE);
        btnEnviar.setHorizontalAlignment(SwingConstants.CENTER);
        btnEnviar.setBackground(new java.awt.Color(0,187,250));
        btnEnviar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        btnEnviar.setText("Iniciar sesión");
        btnEnviar.setToolTipText("");
        btnEnviar.setActionCommand("Iniciar sesión");
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setSelected(true);
        panelLogin.add(btnEnviar);
        
        
        //TiJLabeltulo
        JLabel usuario = new JLabel();
        usuario.setText("Iniciar Sesión");
        usuario.setBounds(200, 40, 400, 50);
        usuario.setHorizontalAlignment(SwingConstants.CENTER);
        usuario.setForeground(java.awt.Color.WHITE);
        usuario.setEnabled(true);
        usuario.setFont(new Font("Microsoft YaHei UI", 1, 38));
        panelLogin.add(usuario);
        
        //Primer Input con correo - Estilos
        JTextField InputCorreo = new JTextField();
        InputCorreo.setBounds(200, 120, 400, 50);
        InputCorreo.setText(" Tu usuario...");
        InputCorreo.setBackground(java.awt.Color.WHITE);
        InputCorreo.setFont(new Font("Lato", 0, 25));
        InputCorreo.setForeground(java.awt.Color.BLACK);
        InputCorreo.selectAll();
        
        panelLogin.add(InputCorreo);
        
        
        
        //Primer Input con correo - Estilos
        JTextField InputPassword = new JTextField();
        InputPassword.setBounds(200, 210, 400, 50);
        InputPassword.setText(" Tu contraseña...");
        InputPassword.setBackground(java.awt.Color.WHITE);
        InputPassword.setFont(new Font("Lato", 0, 25));
        InputPassword.setForeground(java.awt.Color.BLACK);
        InputPassword.selectAll();
        panelLogin.add(InputPassword);
        
        
        
        //Aqui se valida el usuario y contraseña 
        //Si el usuario es correcto y la contraseña no,solo se vuelve a pedir la contraseña
        //Si el usuario es incorrecto, se piden ambos
        //Si ambos son correctos, se crea la interface grafica del usuario y se elimina la ventana de registro
        
        ActionListener evento = new ActionListener() {
            
            
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                NomUsuario = InputCorreo.getText();//La var NombUsuario tiene como valor lo que pasamos en el inputcorreo;
                
                System.out.println("El usr es:"+NomUsuario);
                BuscarUsr = BuscarUsuario(NombresDeUsr,NomUsuario); //Con este metodo buscamos  el usuario en el array que tiene todos los nombre de usuario
                //El metodo buscarUsuario retorna -1 si no encuentra nada, y 0 a 1 si es que encontro el usuario 
                
                //Accion del evento al dar click
                if(BuscarUsr>=0){//sI esta variable es >= a 0 es que si encontro el usuario ingresado 
                    InputCorreo.setText(InputCorreo.getText());
                    btnEnviar.setText("Iniciar Sesión");
                    
                    password= InputPassword.getText();
                    BuscarPassw =  BuscarPassword(BuscarUsr, password, Contrasenias);//Pasamos la var BuscarUsr como index del arreglo
                    //pasamos la contraseña ingresada, y el array donde buscaremos la contraseña
                    
                    
                    if(BuscarPassw>=0){
                        InputPassword.setText("Contraseña Correcta");
                        btnEnviar.setText("Iniciar Sesión");
                        //Removiendo el Panel de login
                        ObtenerDatosParaInterface(BuscarUsr);
                        System.out.println("Todo correcto, removiendo panel de registro");
                        
                        
                    }else{
                    InputPassword.setText("Contraseña Incorrecta");
                    }
                    
                    
                }else{
                    InputCorreo.setText("Usuario No registrado");
                    InputPassword.setText("Contraseña Incorrecta");
                }
            }
        };
        
        //agregar evento a el raton
        btnEnviar.addActionListener(evento);
    }
    
    
    
    
    
}
