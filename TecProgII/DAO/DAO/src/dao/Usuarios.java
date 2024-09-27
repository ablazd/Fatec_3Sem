package dao;

public class Usuarios {
    private String id; // VARCHAR(20)
    private String senha; // VARCHAR(20)
    private int numAge; // NUMERIC(5,0)
    private int numCc; // NUMERIC(10,0)

    // Construtor vazio
    public Usuarios() {}

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public int getNumCc() {
        return numCc;
    }

    public void setNumCc(int numCc) {
        this.numCc = numCc;
    }
}
