package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 28/08/2017.
 */
@Entity
@Table(name = "Disponibilita", schema = "", catalog = "parkandchargeDB")
public class DisponibilitaEntity {
    private int idDisponibilita;

    private MesiEntity mesi;

    private GiorniEntity giorni;

    private FasceOrarieEntity fasceOrarie;


    public final Boolean allDay(){
        if( giorni.isDomenica() && giorni.isLunedi() && giorni.isMartedi()
                && giorni.isMercoledi()&& giorni.isGiovaedi() && giorni.isVenerdi()
                && giorni.isSabato() ){
            return true;
        }else{
            return  false;
        }
    }


    public  final Boolean allHours(){
        if( fasceOrarie.isH00() && fasceOrarie.isH21() && fasceOrarie.isH01() && fasceOrarie.isH02() && fasceOrarie.isH03()
                && fasceOrarie.isH04()
                && fasceOrarie.isH05()
                && fasceOrarie.isH06()
                && fasceOrarie.isH07()
                && fasceOrarie.isH08()
                && fasceOrarie.isH09()
                && fasceOrarie.isH10()&& fasceOrarie.isH11()
                && fasceOrarie.isH12()
                && fasceOrarie.isH13()
                && fasceOrarie.isH14()
                && fasceOrarie.isH15()
                && fasceOrarie.isH16()
                && fasceOrarie.isH17()&& fasceOrarie.isH18()&& fasceOrarie.isH19()
                && fasceOrarie.isH22()&& fasceOrarie.isH23()&& fasceOrarie.isH24() &&fasceOrarie.isH20()){
            return true;
        }else{
            return  false;
        }
    }


    @Id
    @Column(name = "idDisponibilita", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getIdDisponibilita() {
        return idDisponibilita;
    }

    public void setIdDisponibilita(int idDisponibilita) {
        this.idDisponibilita = idDisponibilita;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idMonth")
    public MesiEntity getMesiEntity() {
        return mesi;
    }

    public void setMesiEntity(MesiEntity mesiEntity) {
        this.mesi = mesiEntity;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDay")
    public GiorniEntity getGiorniEntity() {
        return giorni;
    }

    public void setGiorniEntity(GiorniEntity giorniEntity) {
        this.giorni = giorniEntity;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idHour")
    public FasceOrarieEntity getFasceOrarieEntity() {
        return fasceOrarie;
    }

    public void setFasceOrarieEntity(FasceOrarieEntity fasceOrarieEntity) {
        this.fasceOrarie = fasceOrarieEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisponibilitaEntity that = (DisponibilitaEntity) o;

        if (idDisponibilita != that.idDisponibilita) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idDisponibilita;
    }
}
