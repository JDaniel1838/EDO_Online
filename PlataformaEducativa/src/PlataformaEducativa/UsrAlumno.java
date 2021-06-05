package PlataformaEducativa;

public class UsrAlumno extends Usuarios{
    private String carrera = "",
           Grado="",
           Grupo = "";          
   
public UsrAlumno(String nombre,String edad,String NombreUsr, String contrasenia, String carrera, String Grado, String Grupo){
        this.nombre = nombre;
        this.edad = edad;
        this.NombreUsr = NombreUsr;
        this.contrasenia = contrasenia;
        this.carrera = carrera;
        this.Grado = Grado;
        this.Grupo = Grupo;
}  

   public String getcarrera(){
       return  carrera;
   }
   
   public String getGrado(){
       return  Grado;
   }
   
   public String getGrupo(){
       return  Grupo;
   }
   
   
}
