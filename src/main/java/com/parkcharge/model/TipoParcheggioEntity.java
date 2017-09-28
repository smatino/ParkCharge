package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 01/09/2017.
 */
@Entity
@Table(name = "TipoParcheggio", schema = "", catalog = "TestP")
public class TipoParcheggioEntity {
    private int idTipoParcheggio;
    private String descizione;

    @Id
    @Column(name = "idTipoParcheggio", nullable = false, insertable = true, updatable = true)
    public int getIdTipoParcheggio() {
        return idTipoParcheggio;
    }

    public void setIdTipoParcheggio(int idTipoParcheggio) {
        this.idTipoParcheggio = idTipoParcheggio;
    }

    @Basic
    @Column(name = "descizione", nullable = false, insertable = true, updatable = true, length = 50)
    public String getDescizione() {
        return descizione;
    }

    public void setDescizione(String descizione) {
        this.descizione = descizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoParcheggioEntity that = (TipoParcheggioEntity) o;

        if (idTipoParcheggio != that.idTipoParcheggio) return false;
        if (descizione != null ? !descizione.equals(that.descizione) : that.descizione != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoParcheggio;
        result = 31 * result + (descizione != null ? descizione.hashCode() : 0);
        return result;
    }
}
