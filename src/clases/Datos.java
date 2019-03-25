package clases;

public class Datos {
    
    Usuario misUsuarios[] = new Usuario[50];
    
    public Datos(){
        Usuario miUsuario = new Usuario("admin", "Jhon", "Doe", "123", 1);
        
        misUsuarios[0] = miUsuario;
    }
    public boolean validarUsuario(String usuario, String contrasena){
        
        for (int i = 0; i < misUsuarios.length ; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario) && misUsuarios[i].getClave().equals(contrasena)){
                return true;
            }
        }
        return false;
    }
}
