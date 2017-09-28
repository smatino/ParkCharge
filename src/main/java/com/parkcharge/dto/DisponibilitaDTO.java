package com.parkcharge.dto;

import com.parkcharge.model.FasceOrarieEntity;
import com.parkcharge.model.GiorniEntity;
import com.parkcharge.model.MesiEntity;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by smatino on 28/08/2017.
 */
public class DisponibilitaDTO implements Serializable{


    public static final Map<Integer, String> mesi;
    static
    {
        mesi = new HashMap<Integer, String>();
        mesi.put(1, "Gennaio");
        mesi.put(2, "Febbraio");
        mesi.put(3, "Marzo");
        mesi.put(4, "Aprile");
        mesi.put(5, "Maggio");
        mesi.put(6, "Giugno");
        mesi.put(7, "Luglio");
        mesi.put(8, "Agosto");
        mesi.put(9, "Settembre");
        mesi.put(10, "Ottobre");
        mesi.put(11, "Novembre");
        mesi.put(12, "Dicembre");

    }


    public static final Map<Integer, String> giorni;
    static
    {
        giorni = new HashMap<Integer, String>();
        giorni.put(1, "Lunedi");
        giorni.put(2, "Martedi");
        giorni.put(3, "Mercoledi");
        giorni.put(4, "Giovedi");
        giorni.put(5, "Venerdi");
        giorni.put(6, "Sabato");
        giorni.put(0, "Domenica");
    }


    public static final Map<Integer, String> ore;
    static
    {
        ore = new HashMap<Integer, String>();
        ore.put(1, "H01");
        ore.put(2, "H02");
        ore.put(3, "H03");
        ore.put(4, "H04");
        ore.put(5, "H05");
        ore.put(6, "H06");
        ore.put(7, "H07");
        ore.put(8, "H08");
        ore.put(9, "H09");
        ore.put(10, "H10");
        ore.put(11, "H11");
        ore.put(12, "H12");
        ore.put(13, "H13");
        ore.put(14, "H14");
        ore.put(15, "H15");
        ore.put(16, "H16");
        ore.put(17, "H17");
        ore.put(18, "H18");
        ore.put(19, "H19");
        ore.put(20, "H20");
        ore.put(21, "H21");
        ore.put(22, "H22");
        ore.put(23, "H23");
        ore.put(24, "H24");

    }
    



    @NotNull
    @NotEmpty
    private MesiEntity months;


    @NotNull
    @NotEmpty
    private GiorniEntity days;


    @NotNull
    @NotEmpty
    private FasceOrarieEntity fasceOrarie;


    public MesiEntity getMonths() {
        return months;
    }

    public void setMonths(MesiEntity months) {
        this.months = months;
    }

    public GiorniEntity getDays() {
        return days;
    }

    public void setDays(GiorniEntity days) {
        this.days = days;
    }

    public FasceOrarieEntity getFasceOrarie() {
        return fasceOrarie;
    }

    public void setFasceOrarie(FasceOrarieEntity fasceOrarie) {
        this.fasceOrarie = fasceOrarie;
    }
}
