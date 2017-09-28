package com.parkcharge.dto;

import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;

/**
 * Created by smatino on 31/08/2017.
 */
public class FeedbackDTO implements Serializable {

    @NotNull
    @NotEmpty
    private String idCliente;

    @NotNull
    @NotEmpty
    private String idServizio;

    @NotNull
    @NotEmpty
    private Integer valutazione;

    @NotNull
    @NotEmpty
    private String descrizione;


    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdServizio() {
        return idServizio;
    }

    public void setIdServizio(String idServizio) {
        this.idServizio = idServizio;
    }

    public Integer getValutazione() {
        return valutazione;
    }

    public void setValutazione(Integer valutazione) {
        this.valutazione = valutazione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
