package com.parkcharge.model;

import javax.persistence.*;

/**
 * Created by smatino on 28/08/2017.
 */
@Entity
@Table(name = "FasceOrarie", schema = "", catalog = "TestP")
public class FasceOrarieEntity {
    private int idHours;

    @Id
    @Column(name = "idHours", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getIdHours() {
        return idHours;
    }

    public void setIdHours(int idHours) {
        this.idHours = idHours;
    }

    private boolean H00;

    @Basic
    @javax.persistence.Column(name = "H00", nullable = false, insertable = true, updatable = true)
    public boolean isH00() {
        return H00;
    }

    public void setH00(boolean h00) {
        H00 = h00;
    }

    private boolean H01;

    @Basic
    @javax.persistence.Column(name = "H01", nullable = false, insertable = true, updatable = true)
    public boolean isH01() {
        return H01;
    }

    public void setH01(boolean h01) {
        H01 = h01;
    }

    private boolean H02;

    @Basic
    @javax.persistence.Column(name = "H02", nullable = false, insertable = true, updatable = true)
    public boolean isH02() {
        return H02;
    }

    public void setH02(boolean h02) {
        H02 = h02;
    }

    private boolean H03;

    @Basic
    @javax.persistence.Column(name = "H03", nullable = false, insertable = true, updatable = true)
    public boolean isH03() {
        return H03;
    }

    public void setH03(boolean h03) {
        H03 = h03;
    }

    private boolean H04;

    @Basic
    @javax.persistence.Column(name = "H04", nullable = false, insertable = true, updatable = true)
    public boolean isH04() {
        return H04;
    }

    public void setH04(boolean h04) {
        H04 = h04;
    }

    private boolean H05;

    @Basic
    @javax.persistence.Column(name = "H05", nullable = false, insertable = true, updatable = true)
    public boolean isH05() {
        return H05;
    }

    public void setH05(boolean h05) {
        H05 = h05;
    }

    private boolean H06;

    @Basic
    @javax.persistence.Column(name = "H06", nullable = false, insertable = true, updatable = true)
    public boolean isH06() {
        return H06;
    }

    public void setH06(boolean h06) {
        H06 = h06;
    }

    private boolean H07;

    @Basic
    @javax.persistence.Column(name = "H07", nullable = false, insertable = true, updatable = true)
    public boolean isH07() {
        return H07;
    }

    public void setH07(boolean h07) {
        H07 = h07;
    }

    private boolean H08;

    @Basic
    @javax.persistence.Column(name = "H08", nullable = false, insertable = true, updatable = true)
    public boolean isH08() {
        return H08;
    }

    public void setH08(boolean h08) {
        H08 = h08;
    }

    private boolean H09;

    @Basic
    @javax.persistence.Column(name = "H09", nullable = false, insertable = true, updatable = true)
    public boolean isH09() {
        return H09;
    }

    public void setH09(boolean h09) {
        H09 = h09;
    }

    private boolean H10;

    @Basic
    @javax.persistence.Column(name = "H10", nullable = false, insertable = true, updatable = true)
    public boolean isH10() {
        return H10;
    }

    public void setH10(boolean h10) {
        H10 = h10;
    }

    private boolean H11;

    @Basic
    @javax.persistence.Column(name = "H11", nullable = false, insertable = true, updatable = true)
    public boolean isH11() {
        return H11;
    }

    public void setH11(boolean h11) {
        H11 = h11;
    }

    private boolean H12;

    @Basic
    @javax.persistence.Column(name = "H12", nullable = false, insertable = true, updatable = true)
    public boolean isH12() {
        return H12;
    }

    public void setH12(boolean h12) {
        H12 = h12;
    }

    private boolean H13;

    @Basic
    @javax.persistence.Column(name = "H13", nullable = false, insertable = true, updatable = true)
    public boolean isH13() {
        return H13;
    }

    public void setH13(boolean h13) {
        H13 = h13;
    }

    private boolean H14;

    @Basic
    @javax.persistence.Column(name = "H14", nullable = false, insertable = true, updatable = true)
    public boolean isH14() {
        return H14;
    }

    public void setH14(boolean h14) {
        H14 = h14;
    }

    private boolean H15;

    @Basic
    @javax.persistence.Column(name = "H15", nullable = false, insertable = true, updatable = true)
    public boolean isH15() {
        return H15;
    }

    public void setH15(boolean h15) {
        H15 = h15;
    }

    private boolean H16;

    @Basic
    @javax.persistence.Column(name = "H16", nullable = false, insertable = true, updatable = true)
    public boolean isH16() {
        return H16;
    }

    public void setH16(boolean h16) {
        H16 = h16;
    }

    private boolean H17;

    @Basic
    @javax.persistence.Column(name = "H17", nullable = false, insertable = true, updatable = true)
    public boolean isH17() {
        return H17;
    }

    public void setH17(boolean h17) {
        H17 = h17;
    }

    private boolean H18;

    @Basic
    @javax.persistence.Column(name = "H18", nullable = false, insertable = true, updatable = true)
    public boolean isH18() {
        return H18;
    }

    public void setH18(boolean h18) {
        H18 = h18;
    }

    private boolean H19;

    @Basic
    @javax.persistence.Column(name = "H19", nullable = false, insertable = true, updatable = true)
    public boolean isH19() {
        return H19;
    }

    public void setH19(boolean h19) {
        H19 = h19;
    }

    private boolean H20;

    @Basic
    @javax.persistence.Column(name = "H20", nullable = false, insertable = true, updatable = true)
    public boolean isH20() {
        return H20;
    }

    public void setH20(boolean h20) {
        H20 = h20;
    }

    private boolean H21;

    @Basic
    @javax.persistence.Column(name = "H21", nullable = false, insertable = true, updatable = true)
    public boolean isH21() {
        return H21;
    }

    public void setH21(boolean h21) {
        H21 = h21;
    }

    private boolean H22;

    @Basic
    @javax.persistence.Column(name = "H22", nullable = false, insertable = true, updatable = true)
    public boolean isH22() {
        return H22;
    }

    public void setH22(boolean h22) {
        H22 = h22;
    }

    private boolean H23;

    @Basic
    @javax.persistence.Column(name = "H23", nullable = false, insertable = true, updatable = true)
    public boolean isH23() {
        return H23;
    }

    public void setH23(boolean h23) {
        H23 = h23;
    }

    private boolean H24;

    @Basic
    @javax.persistence.Column(name = "H24", nullable = false, insertable = true, updatable = true)
    public boolean isH24() {
        return H24;
    }

    public void setH24(boolean h24) {
        H24 = h24;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FasceOrarieEntity that = (FasceOrarieEntity) o;

        if (idHours != that.idHours) return false;
        if (H00 != that.H00) return false;
        if (H01 != that.H01) return false;
        if (H02 != that.H02) return false;
        if (H03 != that.H03) return false;
        if (H04 != that.H04) return false;
        if (H05 != that.H05) return false;
        if (H06 != that.H06) return false;
        if (H07 != that.H07) return false;
        if (H08 != that.H08) return false;
        if (H09 != that.H09) return false;
        if (H10 != that.H10) return false;
        if (H11 != that.H11) return false;
        if (H12 != that.H12) return false;
        if (H13 != that.H13) return false;
        if (H14 != that.H14) return false;
        if (H15 != that.H15) return false;
        if (H16 != that.H16) return false;
        if (H17 != that.H17) return false;
        if (H18 != that.H18) return false;
        if (H19 != that.H19) return false;
        if (H20 != that.H20) return false;
        if (H21 != that.H21) return false;
        if (H22 != that.H22) return false;
        if (H23 != that.H23) return false;
        if (H24 != that.H24) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHours;
        result = 31 * result + (H00 ? 1 : 0);
        result = 31 * result + (H01 ? 1 : 0);
        result = 31 * result + (H02 ? 1 : 0);
        result = 31 * result + (H03 ? 1 : 0);
        result = 31 * result + (H04 ? 1 : 0);
        result = 31 * result + (H05 ? 1 : 0);
        result = 31 * result + (H06 ? 1 : 0);
        result = 31 * result + (H07 ? 1 : 0);
        result = 31 * result + (H08 ? 1 : 0);
        result = 31 * result + (H09 ? 1 : 0);
        result = 31 * result + (H10 ? 1 : 0);
        result = 31 * result + (H11 ? 1 : 0);
        result = 31 * result + (H12 ? 1 : 0);
        result = 31 * result + (H13 ? 1 : 0);
        result = 31 * result + (H14 ? 1 : 0);
        result = 31 * result + (H15 ? 1 : 0);
        result = 31 * result + (H16 ? 1 : 0);
        result = 31 * result + (H17 ? 1 : 0);
        result = 31 * result + (H18 ? 1 : 0);
        result = 31 * result + (H19 ? 1 : 0);
        result = 31 * result + (H20 ? 1 : 0);
        result = 31 * result + (H21 ? 1 : 0);
        result = 31 * result + (H22 ? 1 : 0);
        result = 31 * result + (H23 ? 1 : 0);
        result = 31 * result + (H24 ? 1 : 0);
        return result;
    }
}
