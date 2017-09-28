package com.parkcharge.dto;

import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by smatino on 25/08/2017.
 */
public class ServizioDTO implements Serializable{

    @NotEmpty
    @NotNull
    private Double costo;
    @NotEmpty
    @NotNull
    private Date inizioServizio;
    @NotEmpty
    @NotNull
    private Date fineServizio;
    @NotEmpty
    @NotNull
    private Double coordinataX;
    @NotEmpty
    @NotNull
    private Double coordinataY;
    private Integer tipoPresa;
    private Integer tipoServizio;
    private DisponibilitaDTO disponibilita;
    private Integer idTipoParcheggio;

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Date getInizioServizio() {
        return inizioServizio;
    }

    public void setInizioServizio(Date inizioServizio) {
        this.inizioServizio = inizioServizio;
    }

    public Date getFineServizio() {
        return fineServizio;
    }

    public void setFineServizio(Date fineServizio) {
        this.fineServizio = fineServizio;
    }

    public Double getCoordinataX() {
        return coordinataX;
    }

    public void setCoordinataX(Double coordinataX) {
        this.coordinataX = coordinataX;
    }

    public Double getCoordinataY() {
        return coordinataY;
    }

    public void setCoordinataY(Double coordinataY) {
        this.coordinataY = coordinataY;
    }

    public Integer getTipoPresa() {
        return tipoPresa;
    }

    public void setTipoPresa(Integer tipoPresa) {
        this.tipoPresa = tipoPresa;
    }

    public Integer getTipoServizio() {
        return tipoServizio;
    }

    public void setTipoServizio(Integer tipoServizio) {
        this.tipoServizio = tipoServizio;
    }

    public DisponibilitaDTO getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(DisponibilitaDTO disponibilita) {
        this.disponibilita = disponibilita;
    }

    public Integer getIdTipoParcheggio() {
        return idTipoParcheggio;
    }

    public void setIdTipoParcheggio(Integer idTipoParcheggio) {
        this.idTipoParcheggio = idTipoParcheggio;
    }
}
