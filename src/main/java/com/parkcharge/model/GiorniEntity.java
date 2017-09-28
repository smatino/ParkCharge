package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 28/08/2017.
 */
@Entity
@Table(name = "Giorni", schema = "", catalog = "TestP")
public class GiorniEntity {
    private int idDay;
    private boolean lunedi;
    private boolean martedi;
    private boolean mercoledi;
    private boolean giovaedi;
    private boolean venerdi;
    private boolean sabato;
    private boolean domenica;

    @Id
    @Column(name = "idDay", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getIdDay() {
        return idDay;
    }

    public void setIdDay(int idDay) {
        this.idDay = idDay;
    }

    @Basic
    @Column(name = "lunedi", nullable = false, insertable = true, updatable = true)
    public boolean isLunedi() {
        return lunedi;
    }

    public void setLunedi(boolean lunedi) {
        this.lunedi = lunedi;
    }

    @Basic
    @Column(name = "martedi", nullable = false, insertable = true, updatable = true)
    public boolean isMartedi() {
        return martedi;
    }

    public void setMartedi(boolean martedi) {
        this.martedi = martedi;
    }

    @Basic
    @Column(name = "mercoledi", nullable = false, insertable = true, updatable = true)
    public boolean isMercoledi() {
        return mercoledi;
    }

    public void setMercoledi(boolean mercoledi) {
        this.mercoledi = mercoledi;
    }

    @Basic
    @Column(name = "giovaedi", nullable = false, insertable = true, updatable = true)
    public boolean isGiovaedi() {
        return giovaedi;
    }

    public void setGiovaedi(boolean giovaedi) {
        this.giovaedi = giovaedi;
    }

    @Basic
    @Column(name = "venerdi", nullable = false, insertable = true, updatable = true)
    public boolean isVenerdi() {
        return venerdi;
    }

    public void setVenerdi(boolean venerdi) {
        this.venerdi = venerdi;
    }

    @Basic
    @Column(name = "sabato", nullable = false, insertable = true, updatable = true)
    public boolean isSabato() {
        return sabato;
    }

    public void setSabato(boolean sabato) {
        this.sabato = sabato;
    }

    @Basic
    @Column(name = "domenica", nullable = false, insertable = true, updatable = true)
    public boolean isDomenica() {
        return domenica;
    }

    public void setDomenica(boolean domenica) {
        this.domenica = domenica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GiorniEntity that = (GiorniEntity) o;

        if (idDay != that.idDay) return false;
        if (lunedi != that.lunedi) return false;
        if (martedi != that.martedi) return false;
        if (mercoledi != that.mercoledi) return false;
        if (giovaedi != that.giovaedi) return false;
        if (venerdi != that.venerdi) return false;
        if (sabato != that.sabato) return false;
        if (domenica != that.domenica) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDay;
        result = 31 * result + (lunedi ? 1 : 0);
        result = 31 * result + (martedi ? 1 : 0);
        result = 31 * result + (mercoledi ? 1 : 0);
        result = 31 * result + (giovaedi ? 1 : 0);
        result = 31 * result + (venerdi ? 1 : 0);
        result = 31 * result + (sabato ? 1 : 0);
        result = 31 * result + (domenica ? 1 : 0);
        return result;
    }
}
