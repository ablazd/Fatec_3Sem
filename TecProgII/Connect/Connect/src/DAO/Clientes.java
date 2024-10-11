/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

public class Clientes {
    private int idCli; // NUMERIC(9,0)
    private String nomeCli; // VARCHAR(50)
    private String endeCli; // VARCHAR(50)
    private String numeCli; // VARCHAR(8)
    private String complCli; // VARCHAR(20)
    private String bairCli; // VARCHAR(20)
    private String cidaCli; // VARCHAR(30)
    private String ufCli; // CHAR(2)
    private String cepCli; // CHAR(8)
    private String foneCli; // VARCHAR(13)
    private String cpfCli; // CHAR(11)
    private String dataNasc; // DATETIME
    private String cnpjCli; // CHAR(14)

    // Construtor vazio
    public Clientes() {}
    
    public String dadosSQLInsert(){
        String dadosClientes;
        dadosClientes = "'"
                + this.getIdCli() + "','"
                + this.getNomeCli() + "','"
                + this.getEndeCli() + "','"
                + this.getNumeCli() + "','"
                + this.getComplCli() + "','"
                + this.getBairCli() + "','"
                + this.getCidaCli() + "','"
                + this.getUfCli() + "','"
                + this.getCepCli() + "','"
                + this.getFoneCli() + "','"
                + this.getCpfCli() + "','"
                + this.getDataNasc() + "','"
                + this.getCnpjCli() + "'";
        return dadosClientes;
    }
    
    // Getters e Setters
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getEndeCli() {
        return endeCli;
    }

    public void setEndeCli(String endeCli) {
        this.endeCli = endeCli;
    }

    public String getNumeCli() {
        return numeCli;
    }

    public void setNumeCli(String numeCli) {
        this.numeCli = numeCli;
    }

    public String getComplCli() {
        return complCli;
    }

    public void setComplCli(String complCli) {
        this.complCli = complCli;
    }

    public String getBairCli() {
        return bairCli;
    }

    public void setBairCli(String bairCli) {
        this.bairCli = bairCli;
    }

    public String getCidaCli() {
        return cidaCli;
    }

    public void setCidaCli(String cidaCli) {
        this.cidaCli = cidaCli;
    }

    public String getUfCli() {
        return ufCli;
    }

    public void setUfCli(String ufCli) {
        this.ufCli = ufCli;
    }

    public String getCepCli() {
        return cepCli;
    }

    public void setCepCli(String cepCli) {
        this.cepCli = cepCli;
    }

    public String getFoneCli() {
        return foneCli;
    }

    public void setFoneCli(String foneCli) {
        this.foneCli = foneCli;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCnpjCli() {
        return cnpjCli;
    }

    public void setCnpjCli(String cnpjCli) {
        this.cnpjCli = cnpjCli;
    }
}
