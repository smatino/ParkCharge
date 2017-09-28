package com.parkcharge.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by smatino on 31/08/2017.
 */
@Entity
@Table(name = "Feedback", schema = "", catalog = "TestP")
public class FeedbackEntity {
    private int idFeedback;
    private ClienteEntity cliente;
    private ServizioEntity servizio;
    private int valutazione;
    private String descrizione;

    @Id
    @Column(name = "idFeedback", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(int idFeedback) {
        this.idFeedback = idFeedback;
    }

    @ManyToOne
    @JoinColumn(name = "idCliente")
    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity idCliente) {
        this.cliente = idCliente;
    }

    @ManyToOne
    @JoinColumn(name = "idServizio")
    public ServizioEntity getServizio() {
        return servizio;
    }

    public void setServizio(ServizioEntity idServizio) {
        this.servizio = idServizio;
    }

    @Basic
    @Column(name = "valutazione", nullable = false, insertable = true, updatable = true)
    public int getValutazione() {
        return valutazione;
    }

    public void setValutazione(int valutazione) {
        this.valutazione = valutazione;
    }

    @Basic
    @Column(name = "descrizione", nullable = false, insertable = true, updatable = true, length = 500)
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

        FeedbackEntity that = (FeedbackEntity) o;

        if (idFeedback != that.idFeedback) return false;
        if (valutazione != that.valutazione) return false;
        if (cliente != null ? !cliente.equals(that.cliente) : that.cliente != null) return false;
        if (servizio != null ? !servizio.equals(that.servizio) : that.servizio != null) return false;
        if (descrizione != null ? !descrizione.equals(that.descrizione) : that.descrizione != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFeedback;
        result = 31 * result + (cliente != null ? cliente.hashCode() : 0);
        result = 31 * result + (servizio != null ? servizio.hashCode() : 0);
        result = 31 * result + valutazione;
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        return result;
    }
}
