package br.edu.infnet.ecommerce.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEndereco")
public class Endereco {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // coluna auto increment
    @Column(name = "id")
    private Integer id;

    @Column(name = "uf")
    private String uf;

    @Column(name="localidade")
    private String localidade;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="bairro")
    private String bairro;

    @Column(name="numero")
    private Integer numero;

    @Column(name="complemento")
    private String complemento;

    @Column(name="cep")
    private String cep;

//    public void copyFrom(EnderecoViaCep enderecoViaCep) {
//        this.cep = enderecoViaCep.getCep();
//        this.logradouro = enderecoViaCep.getLogradouro();
//        //this.complemento = enderecoViaCep.getComplemento();
//        this.bairro = enderecoViaCep.getBairro();
//        this.localidade = enderecoViaCep.getLocalidade();
//        this.uf = enderecoViaCep.getUf();
//
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
