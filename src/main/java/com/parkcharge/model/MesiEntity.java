package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 28/08/2017.
 */
@Entity
@Table(name = "Mesi", schema = "", catalog = "TestP")
public class MesiEntity {
    private int idMonth;
    private boolean gennaio;
    private boolean febbraio;
    private boolean marzo;
    private boolean aprile;
    private boolean maggio;
    private boolean giugno;
    private boolean luglio;
    private boolean agosto;
    private boolean settembre;
    private boolean ottobre;
    private boolean novembre;
    private boolean dicembre;

    @Id
    @Column(name = "idMonth", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getIdMonth() {
        return idMonth;
    }

    public void setIdMonth(int idMonth) {
        this.idMonth = idMonth;
    }

    @Basic
    @Column(name = "gennaio", nullable = false, insertable = true, updatable = true)
    public boolean isGennaio() {
        return gennaio;
    }

    public void setGennaio(boolean gennaio) {
        this.gennaio = gennaio;
    }

    @Basic
    @Column(name = "febbraio", nullable = false, insertable = true, updatable = true)
    public boolean isFebbraio() {
        return febbraio;
    }

    public void setFebbraio(boolean febbraio) {
        this.febbraio = febbraio;
    }

    @Basic
    @Column(name = "marzo", nullable = false, insertable = true, updatable = true)
    public boolean isMarzo() {
        return marzo;
    }

    public void setMarzo(boolean marzo) {
        this.marzo = marzo;
    }

    @Basic
    @Column(name = "aprile", nullable = false, insertable = true, updatable = true)
    public boolean isAprile() {
        return aprile;
    }

    public void setAprile(boolean aprile) {
        this.aprile = aprile;
    }

    @Basic
    @Column(name = "maggio", nullable = false, insertable = true, updatable = true)
    public boolean isMaggio() {
        return maggio;
    }

    public void setMaggio(boolean maggio) {
        this.maggio = maggio;
    }

    @Basic
    @Column(name = "giugno", nullable = false, insertable = true, updatable = true)
    public boolean isGiugno() {
        return giugno;
    }

    public void setGiugno(boolean giugno) {
        this.giugno = giugno;
    }

    @Basic
    @Column(name = "luglio", nullable = false, insertable = true, updatable = true)
    public boolean isLuglio() {
        return luglio;
    }

    public void setLuglio(boolean luglio) {
        this.luglio = luglio;
    }

    @Basic
    @Column(name = "agosto", nullable = false, insertable = true, updatable = true)
    public boolean isAgosto() {
        return agosto;
    }

    public void setAgosto(boolean agosto) {
        this.agosto = agosto;
    }

    @Basic
    @Column(name = "settembre", nullable = false, insertable = true, updatable = true)
    public boolean isSettembre() {
        return settembre;
    }

    public void setSettembre(boolean settembre) {
        this.settembre = settembre;
    }

    @Basic
    @Column(name = "ottobre", nullable = false, insertable = true, updatable = true)
    public boolean isOttobre() {
        return ottobre;
    }

    public void setOttobre(boolean ottobre) {
        this.ottobre = ottobre;
    }

    @Basic
    @Column(name = "novembre", nullable = false, insertable = true, updatable = true)
    public boolean isNovembre() {
        return novembre;
    }

    public void setNovembre(boolean novembre) {
        this.novembre = novembre;
    }

    @Basic
    @Column(name = "dicembre", nullable = false, insertable = true, updatable = true)
    public boolean isDicembre() {
        return dicembre;
    }

    public void setDicembre(boolean dicembre) {
        this.dicembre = dicembre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesiEntity that = (MesiEntity) o;

        if (idMonth != that.idMonth) return false;
        if (gennaio != that.gennaio) return false;
        if (febbraio != that.febbraio) return false;
        if (marzo != that.marzo) return false;
        if (aprile != that.aprile) return false;
        if (maggio != that.maggio) return false;
        if (giugno != that.giugno) return false;
        if (luglio != that.luglio) return false;
        if (agosto != that.agosto) return false;
        if (settembre != that.settembre) return false;
        if (ottobre != that.ottobre) return false;
        if (novembre != that.novembre) return false;
        if (dicembre != that.dicembre) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMonth;
        result = 31 * result + (gennaio ? 1 : 0);
        result = 31 * result + (febbraio ? 1 : 0);
        result = 31 * result + (marzo ? 1 : 0);
        result = 31 * result + (aprile ? 1 : 0);
        result = 31 * result + (maggio ? 1 : 0);
        result = 31 * result + (giugno ? 1 : 0);
        result = 31 * result + (luglio ? 1 : 0);
        result = 31 * result + (agosto ? 1 : 0);
        result = 31 * result + (settembre ? 1 : 0);
        result = 31 * result + (ottobre ? 1 : 0);
        result = 31 * result + (novembre ? 1 : 0);
        result = 31 * result + (dicembre ? 1 : 0);
        return result;
    }
}
