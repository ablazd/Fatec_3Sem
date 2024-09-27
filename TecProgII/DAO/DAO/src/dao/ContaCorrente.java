package dao;

public class ContaCorrente {
    private int numAge; // NUMERIC(5,0)
    private int numCc; // NUMERIC(10,0)
    private int idCli; // NUMERIC(9,0)
    private double saldo; // NUMERIC(15,2)

    // Construtor vazio
    public ContaCorrente() {}

    // Getters e Setters
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

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
