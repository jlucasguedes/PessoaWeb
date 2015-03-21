/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.bean;

import java.io.Serializable;

/**
 *
 * @author lucas
 */
public class Endereco implements Serializable {
    private String rua;
    private String bairro;
    private String cep;

    public Endereco() {
        this.rua = "";
        this.bairro = "";
        this.cep = "";
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
}
