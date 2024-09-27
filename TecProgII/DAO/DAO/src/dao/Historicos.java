package dao;

public class Historicos {
    private int idHis; // NUMERIC(4,0)
    private String desHis; // VARCHAR(30)

    // Construtor vazio
    public Historicos() {}

    // Getters e Setters
    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public String getDesHis() {
        return desHis;
    }

    public void setDesHis(String desHis) {
        this.desHis = desHis;
    }
}
