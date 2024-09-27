package dao;

import java.util.Date;

public class Movimentacao {
    private int numAge; // NUMERIC(5,0)
    private int numCc; // NUMERIC(10,0)
    private Date dataMov; // DATETIME
    private String numDocto; // VARCHAR(6)
    private char debitoCredito; // CHAR(1)
    private int idHis; // NUMERIC(4,0)
    private String complHis; // VARCHAR(30)
    private double valor; // NUMERIC(9,2)
    private double saldo; // NUMERIC(15,2)

    // Construtor vazio
    public Movimentacao() {}

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

    public Date getDataMov() {
        return dataMov;
    }

    public void setDataMov(Date dataMov) {
        this.dataMov = dataMov;
    }

    public String getNumDocto() {
        return numDocto;
    }

    public void setNumDocto(String numDocto) {
        this.numDocto = numDocto;
    }

    public char getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(char debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public String getComplHis() {
        return complHis;
    }

    public void setComplHis(String complHis) {
        this.complHis = complHis;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
