package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 24/08/2017.
 */
@Entity
@Table(name = "TipoServizio", schema = "", catalog = "TestP")
public class TipoServizioEntity {
    private int idTipoServizio;
    private String descrizione;

    @Id
    @Column(name = "idTipoServizio", nullable = false, insertable = true, updatable = true)
    public int getIdTipoServizio() {
        return idTipoServizio;
    }

    public void setIdTipoServizio(int idTipoServizio) {
        this.idTipoServizio = idTipoServizio;
    }

    @Basic
    @Column(name = "descrizione", nullable = true, insertable = true, updatable = true, length = 50)
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

        TipoServizioEntity that = (TipoServizioEntity) o;

        if (idTipoServizio != that.idTipoServizio) return false;
        if (descrizione != null ? !descrizione.equals(that.descrizione) : that.descrizione != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoServizio;
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        return result;
    }
}
