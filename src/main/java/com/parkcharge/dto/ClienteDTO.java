package com.parkcharge.dto;

import com.parkcharge.model.ServizioEntity;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.util.List;

/**
 * Created by smatino on 25/08/2017.
 */
public class ClienteDTO implements Serializable {

    @NotNull
    @NotEmpty
    private String cf;
    @NotNull
    @NotEmpty
    private String email;
    @NotNull
    @NotEmpty
    private String password;
    @NotNull
    @NotEmpty
    private String nome;
    @NotNull
    @NotEmpty
    private String cognome;

    @NotNull
    @NotEmpty
    private Integer idTipoCliente;

    private List<ServizioDTO> servizio;


    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<ServizioDTO> getServizio() {
        return servizio;
    }

    public void setServizio(List<ServizioDTO> servizio) {
        this.servizio = servizio;
    }

    public Integer getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(Integer idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }
}
