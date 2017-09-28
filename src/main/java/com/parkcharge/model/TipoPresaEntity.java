package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 24/08/2017.
 */
@Entity
@Table(name = "TipoPresa", schema = "", catalog = "TestP")
public class TipoPresaEntity {
    private int idTipoPresa;
    private String tipo;
    private String potenza;

    @Id
    @Column(name = "idTipoPresa", nullable = false, insertable = true, updatable = true)
    public int getIdTipoPresa() {
        return idTipoPresa;
    }

    public void setIdTipoPresa(int idTipoPresa) {
        this.idTipoPresa = idTipoPresa;
    }

    @Basic
    @Column(name = "tipo", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Basic
    @Column(name = "potenza", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPotenza() {
        return potenza;
    }

    public void setPotenza(String potenza) {
        this.potenza = potenza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoPresaEntity that = (TipoPresaEntity) o;

        if (idTipoPresa != that.idTipoPresa) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;
        if (potenza != null ? !potenza.equals(that.potenza) : that.potenza != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoPresa;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (potenza != null ? potenza.hashCode() : 0);
        return result;
    }
}
