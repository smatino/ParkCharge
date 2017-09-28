package com.parkcharge.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by smatino on 24/08/2017.
 */
@Entity
@Table(name = "Servizio", schema = "", catalog = "TestP")
public class ServizioEntity {
    private int idServizio;
    private ClienteEntity idCliente;
    private Double costo;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date inizioServizio;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date fineServizio;
    private TipoServizioEntity tipoServizio;
    private Double coordinataX;
    private TipoPresaEntity tipoPresa;
    private Double coordinataY;
    private DisponibilitaEntity disponibilita;
    private TipoParcheggioEntity tipoParcheggio;




    @Id
    @Column(name = "idServizio", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getIdServizio() {
        return idServizio;
    }

    public void setIdServizio(int idServizio) {
        this.idServizio = idServizio;
    }

    @Basic
    @Column(name = "costo", nullable = true, insertable = true, updatable = true)
    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Basic
    @Column(name = "inizio_servizio", nullable = true, insertable = true, updatable = true)
    public Date getInizioServizio() {
        return inizioServizio;
    }

    public void setInizioServizio(Date inizioServizio) {
        this.inizioServizio = inizioServizio;
    }

    @Basic
    @Column(name = "fine_servizio", nullable = true, insertable = true, updatable = true)
    public Date getFineServizio() {
        return fineServizio;
    }

    public void setFineServizio(Date fineServizio) {
        this.fineServizio = fineServizio;
    }

    @ManyToOne
    @JoinColumn(name = "idTipoServizio")
    public TipoServizioEntity getIdTipoServizio() {
        return tipoServizio;
    }

    public void setIdTipoServizio(TipoServizioEntity idTipoServizio) {
        this.tipoServizio = idTipoServizio;
    }

    @Basic
    @Column(name = "coordinata_X", nullable = true, insertable = true, updatable = true, length = 50)
    public Double getCoordinataX() {
        return coordinataX;
    }

    public void setCoordinataX(Double coordinataX) {
        this.coordinataX = coordinataX;
    }

    @ManyToOne
    @JoinColumn(name = "idTipoPresa")
    public TipoPresaEntity getIdTipoPresa() {
        return tipoPresa;
    }

    public void setIdTipoPresa(TipoPresaEntity idTipoPresa) {
        this.tipoPresa = idTipoPresa;
    }

    @Basic
    @Column(name = "coordinata_Y", nullable = true, insertable = true, updatable = true, length = 50)
    public Double getCoordinataY() {
        return coordinataY;
    }

    public void setCoordinataY(Double coordinataY) {
        this.coordinataY = coordinataY;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente")
    public ClienteEntity getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ClienteEntity idCliente) {
        this.idCliente = idCliente;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDisponibilita")
    public DisponibilitaEntity getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(DisponibilitaEntity disponibilita) {
        this.disponibilita = disponibilita;
    }


    @ManyToOne
    @JoinColumn(name = "idTipoParcheggio")
    public TipoParcheggioEntity getTipoParcheggio() {
        return tipoParcheggio;
    }

    public void setTipoParcheggio(TipoParcheggioEntity tipoParcheggio) {
        this.tipoParcheggio = tipoParcheggio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServizioEntity that = (ServizioEntity) o;

        if (idServizio != that.idServizio) return false;
        if (costo != null ? !costo.equals(that.costo) : that.costo != null) return false;
        if (inizioServizio != null ? !inizioServizio.equals(that.inizioServizio) : that.inizioServizio != null)
            return false;
        if (fineServizio != null ? !fineServizio.equals(that.fineServizio) : that.fineServizio != null) return false;
        if (tipoServizio != null ? !tipoServizio.equals(that.tipoServizio) : that.tipoServizio != null)
            return false;
        if (coordinataX != null ? !coordinataX.equals(that.coordinataX) : that.coordinataX != null) return false;
        if (tipoPresa != null ? !tipoPresa.equals(that.tipoPresa) : that.tipoPresa != null) return false;
        if (coordinataY != null ? !coordinataY.equals(that.coordinataY) : that.coordinataY != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idServizio;
        result = 31 * result + (costo != null ? costo.hashCode() : 0);
        result = 31 * result + (inizioServizio != null ? inizioServizio.hashCode() : 0);
        result = 31 * result + (fineServizio != null ? fineServizio.hashCode() : 0);
        result = 31 * result + (tipoServizio != null ? tipoServizio.hashCode() : 0);
        result = 31 * result + (coordinataX != null ? coordinataX.hashCode() : 0);
        result = 31 * result + (tipoPresa != null ? tipoPresa.hashCode() : 0);
        result = 31 * result + (coordinataY != null ? coordinataY.hashCode() : 0);
        return result;
    }
}
