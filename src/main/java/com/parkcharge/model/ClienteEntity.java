package com.parkcharge.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by smatino on 24/08/2017.
 */
@Entity
@Table(name = "Cliente", schema = "", catalog = "parkandchargeDB")
public class ClienteEntity implements Serializable {
    private int idCliente;
    private String cf;
    private String email;
    private String password;
    private String nome;
    private String cognome;
    private TipoClienteEntity tipoCliente;


    @Id
    @Column(name = "idCliente", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    @Basic
    @Column(name = "CF", nullable = false, insertable = true, updatable = true, length = 50)
    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nome", nullable = true, insertable = true, updatable = true, length = 50)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "cognome", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @ManyToOne
    @JoinColumn(name = "idTipoCliente")
    public TipoClienteEntity getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoClienteEntity tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClienteEntity that = (ClienteEntity) o;

        if (idCliente != that.idCliente) return false;
        if (cf != null ? !cf.equals(that.cf) : that.cf != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (cognome != null ? !cognome.equals(that.cognome) : that.cognome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCliente;
        result = 31 * result + (cf != null ? cf.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cognome != null ? cognome.hashCode() : 0);
        return result;
    }
}
