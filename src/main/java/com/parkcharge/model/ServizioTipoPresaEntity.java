package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 24/08/2017.
 */
@Entity
@Table(name = "ServizioTipoPresa", schema = "", catalog = "parkandchargeDB")
public class ServizioTipoPresaEntity {
    private int idServizioTipoPresa;
    private int idServizio;
    private int idTipoPresa;

    @Id
    @Column(name = "idServizioTipoPresa", nullable = false, insertable = true, updatable = true)
    public int getIdServizioTipoPresa() {
        return idServizioTipoPresa;
    }

    public void setIdServizioTipoPresa(int idServizioTipoPresa) {
        this.idServizioTipoPresa = idServizioTipoPresa;
    }

    @Basic
    @Column(name = "idServizio", nullable = false, insertable = true, updatable = true)
    public int getIdServizio() {
        return idServizio;
    }

    public void setIdServizio(int idServizio) {
        this.idServizio = idServizio;
    }

    @Basic
    @Column(name = "idTipoPresa", nullable = false, insertable = true, updatable = true)
    public int getIdTipoPresa() {
        return idTipoPresa;
    }

    public void setIdTipoPresa(int idTipoPresa) {
        this.idTipoPresa = idTipoPresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServizioTipoPresaEntity that = (ServizioTipoPresaEntity) o;

        if (idServizioTipoPresa != that.idServizioTipoPresa) return false;
        if (idServizio != that.idServizio) return false;
        if (idTipoPresa != that.idTipoPresa) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idServizioTipoPresa;
        result = 31 * result + idServizio;
        result = 31 * result + idTipoPresa;
        return result;
    }
}
