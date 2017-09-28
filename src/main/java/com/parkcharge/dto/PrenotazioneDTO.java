package com.parkcharge.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by smatino on 29/08/2017.
 */
public class PrenotazioneDTO implements Serializable {

    @NotNull
    @NotEmpty
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Date dataInizioServizio;
    @NotNull
    @NotEmpty
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    private Date dataFineServizio;
    @NotNull
    @NotEmpty
    private String idCliente;
    @NotNull
    @NotEmpty
    private String idServizio;


    public Date getDataInizioServizio() {
        return dataInizioServizio;
    }

    public void setDataInizioServizio(Date dataInizioServizio) {
        this.dataInizioServizio = dataInizioServizio;
    }

    public Date getDataFineServizio() {
        return dataFineServizio;
    }

    public void setDataFineServizio(Date dataFineServizio) {
        this.dataFineServizio = dataFineServizio;
    }

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
}
