
package Controller;
import Model.User;


public class Controller {
    User novoUsuario;
    
    public void registraUser(String username, String senha) {
        novoUsuario = new User(username, senha);
    }
    
    public boolean validaLogin(String user, String senha) {
        if(user.equals(novoUsuario.getUser()) && senha.equals(novoUsuario.getSenha()) ) {
            return true;
        } else {
            return false;
        }
    }
}
