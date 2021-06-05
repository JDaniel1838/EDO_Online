package PlataformaEducativa;

public class UsrProfesor extends Usuarios {
    private String MateriaImpartida = "", GrupoAsignado = "", GradoAsignado="", CarreraAsignada="";
    
    public UsrProfesor(String nombre,String edad,String NombreUsr, String contrasenia, String MateriaImpartida, String GradoAsignado, String GrupoAsignado, String CarreraAsignada){
        this.nombre = nombre;
        this.edad = edad;
        this.NombreUsr = NombreUsr;
        this.contrasenia = contrasenia;
        this.MateriaImpartida = MateriaImpartida;
        this.GrupoAsignado = GrupoAsignado;
        this.GradoAsignado = GradoAsignado;
        this.CarreraAsignada = CarreraAsignada;
    }
    
    public String getMateriaImpartida(){
       return  MateriaImpartida;
    }
    
    public String getGrupoAsignado(){
       return  GrupoAsignado;
    }
    
    public String getGradoAsignado(){
       return  GradoAsignado;
    }
    
    public String getCarreraAsignada(){
       return  CarreraAsignada;
    }
}
