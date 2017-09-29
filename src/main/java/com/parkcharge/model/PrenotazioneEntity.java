package com.parkcharge.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by smatino on 29/08/2017.
 */
@Entity
@Table(name = "Prenotazione", schema = "", catalog = "parkandchargeDB")
public class PrenotazioneEntity {
    private int idPrenotazione;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dataPrenotazione;
    private Double costoPrenotazione;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dataInizioServizio;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dataFineServizio;
    private ServizioEntity servizio;
    private ClienteEntity cliente;

    @Id
    @Column(name = "idPrenotazione", nullable = false, insertable = true, updatable = true)
    public int getIdPrenotazione() {
        return idPrenotazione;
    }

    public void setIdPrenotazione(int idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    @Basic
    @Column(name = "dataPrenotazione", nullable = true, insertable = true, updatable = true)
    public Date getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(Date dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    @Basic
    @Column(name = "costoPrenotazione", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getCostoPrenotazione() {
        return costoPrenotazione;
    }

    public void setCostoPrenotazione(Double costoPrenotazione) {
        this.costoPrenotazione = costoPrenotazione;
    }

    @Basic
    @Column(name = "dataInizioServizio", nullable = true, insertable = true, updatable = true)
    public Date getDataInizioServizio() {
        return dataInizioServizio;
    }

    public void setDataInizioServizio(Date dataInizioServizio) {
        this.dataInizioServizio = dataInizioServizio;
    }

    @Basic
    @Column(name = "dataFineServizio", nullable = true, insertable = true, updatable = true)
    public Date getDataFineServizio() {
        return dataFineServizio;
    }

    public void setDataFineServizio(Date dataFineServizio) {
        this.dataFineServizio = dataFineServizio;
    }

    @ManyToOne
    @JoinColumn(name = "idServizio")
    public ServizioEntity getServizio() {
        return servizio;
    }

    public void setServizio(ServizioEntity servizio) {
        this.servizio = servizio;
    }

    @ManyToOne
    @JoinColumn(name = "idCliente")
    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrenotazioneEntity that = (PrenotazioneEntity) o;

        if (idPrenotazione != that.idPrenotazione) return false;
        if (dataPrenotazione != null ? !dataPrenotazione.equals(that.dataPrenotazione) : that.dataPrenotazione != null)
            return false;
        if (costoPrenotazione != null ? !costoPrenotazione.equals(that.costoPrenotazione) : that.costoPrenotazione != null)
            return false;
        if (dataInizioServizio != null ? !dataInizioServizio.equals(that.dataInizioServizio) : that.dataInizioServizio != null)
            return false;
        if (dataFineServizio != null ? !dataFineServizio.equals(that.dataFineServizio) : that.dataFineServizio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrenotazione;
        result = 31 * result + (dataPrenotazione != null ? dataPrenotazione.hashCode() : 0);
        result = 31 * result + (costoPrenotazione != null ? costoPrenotazione.hashCode() : 0);
        result = 31 * result + (dataInizioServizio != null ? dataInizioServizio.hashCode() : 0);
        result = 31 * result + (dataFineServizio != null ? dataFineServizio.hashCode() : 0);
        return result;
    }


}
