package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 01/09/2017.
 */
@Entity
@Table(name = "TipoCliente", schema = "", catalog = "parkandchargeDB")
public class TipoClienteEntity {
    private int idTipoCliente;
    private String descrizione;

    @Id
    @Column(name = "idTipoCliente", nullable = false, insertable = true, updatable = true)
    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    @Basic
    @Column(name = "descrizione", nullable = false, insertable = true, updatable = true, length = 50)
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoClienteEntity that = (TipoClienteEntity) o;

        if (idTipoCliente != that.idTipoCliente) return false;
        if (descrizione != null ? !descrizione.equals(that.descrizione) : that.descrizione != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoCliente;
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        return result;
    }
}
