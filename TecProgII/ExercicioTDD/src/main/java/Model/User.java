package Model;
public class User {
    //Atributos
    private String user;
    private String senha;

    //Construtores
    public User (String user, String senha) {
        this.user = user;
        this.senha = senha;
    }
    
    //gets
    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }
    
    //sets sem, uso por enquanto
    public void setUser(String user) {
        this.user = user;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
