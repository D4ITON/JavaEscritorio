package clases;

public class Datos {
    public boolean validarUsuario(String usuario, String contrasena){
        if(usuario.equals("admin") && contrasena.equals("123") ){
            return true;
        }
        else{
            return false;
        }
    }
}
