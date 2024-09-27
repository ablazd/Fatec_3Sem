package dao;

public class Agencias {
    private int numAge; // NUMERIC(5,0)
    private String nomeAge; // VARCHAR(30)
    private String endeAge; // VARCHAR(50)
    private String numeAge; // VARCHAR(8)
    private String complAge; // VARCHAR(20)
    private String bairAge; // VARCHAR(20)
    private String cidaAge; // VARCHAR(30)
    private String ufAge; // CHAR(2)
    private String cepAge; // CHAR(8)
    private String foneAge; // VARCHAR(13)

    // Construtor vazio
    public Agencias() {}

    // Getters e Setters
    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public String getNomeAge() {
        return nomeAge;
    }

    public void setNomeAge(String nomeAge) {
        this.nomeAge = nomeAge;
    }

    public String getEndeAge() {
        return endeAge;
    }

    public void setEndeAge(String endeAge) {
        this.endeAge = endeAge;
    }

    public String getNumeAge() {
        return numeAge;
    }

    public void setNumeAge(String numeAge) {
        this.numeAge = numeAge;
    }

    public String getComplAge() {
        return complAge;
    }

    public void setComplAge(String complAge) {
        this.complAge = complAge;
    }

    public String getBairAge() {
        return bairAge;
    }

    public void setBairAge(String bairAge) {
        this.bairAge = bairAge;
    }

    public String getCidaAge() {
        return cidaAge;
    }

    public void setCidaAge(String cidaAge) {
        this.cidaAge = cidaAge;
    }

    public String getUfAge() {
        return ufAge;
    }

    public void setUfAge(String ufAge) {
        this.ufAge = ufAge;
    }

    public String getCepAge() {
        return cepAge;
    }

    public void setCepAge(String cepAge) {
        this.cepAge = cepAge;
    }

    public String getFoneAge() {
        return foneAge;
    }

    public void setFoneAge(String foneAge) {
        this.foneAge = foneAge;
    }
}
