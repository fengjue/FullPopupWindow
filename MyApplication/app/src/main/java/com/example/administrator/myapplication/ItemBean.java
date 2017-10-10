package com.example.administrator.myapplication;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/1.
 */

public class ItemBean implements Serializable{
    private String zero;

    public String getZero() {
        return zero;
    }

    public void setZero(String zero) {
        this.zero = zero;
    }

    private String first;
    private String second;
    private String third;
    private String fourth;
    private String fifth;
    private String sixth;
    private String seventh;
    private String eighth;
    private String ninth;
    private String tenth;
    private String eleventh;
    private String twelfth;
    private String thirteenth;
    private String fourteenth;
    private String fifteenth;
    private String sixteenth;
    private String seventeenth;
    private String eighteenth;
    private String nineteenth;
    private String twentieth;

    public ItemBean() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemBean itemBean = (ItemBean) o;

        if (!zero.equals(itemBean.zero)) return false;
        if (!first.equals(itemBean.first)) return false;
        if (!second.equals(itemBean.second)) return false;
        if (!third.equals(itemBean.third)) return false;
        if (!fourth.equals(itemBean.fourth)) return false;
        if (!fifth.equals(itemBean.fifth)) return false;
        if (!sixth.equals(itemBean.sixth)) return false;
        if (!seventh.equals(itemBean.seventh)) return false;
        if (!eighth.equals(itemBean.eighth)) return false;
        if (!ninth.equals(itemBean.ninth)) return false;
        if (!tenth.equals(itemBean.tenth)) return false;
        if (!eleventh.equals(itemBean.eleventh)) return false;
        if (!twelfth.equals(itemBean.twelfth)) return false;
        if (!thirteenth.equals(itemBean.thirteenth)) return false;
        if (!fourteenth.equals(itemBean.fourteenth)) return false;
        if (!fifteenth.equals(itemBean.fifteenth)) return false;
        if (!sixteenth.equals(itemBean.sixteenth)) return false;
        if (!seventeenth.equals(itemBean.seventeenth)) return false;
        if (!eighteenth.equals(itemBean.eighteenth)) return false;
        if (!nineteenth.equals(itemBean.nineteenth)) return false;
        return twentieth.equals(itemBean.twentieth);

    }

    @Override
    public int hashCode() {
        int result = zero.hashCode();
        result = 31 * result + first.hashCode();
        result = 31 * result + second.hashCode();
        result = 31 * result + third.hashCode();
        result = 31 * result + fourth.hashCode();
        result = 31 * result + fifth.hashCode();
        result = 31 * result + sixth.hashCode();
        result = 31 * result + seventh.hashCode();
        result = 31 * result + eighth.hashCode();
        result = 31 * result + ninth.hashCode();
        result = 31 * result + tenth.hashCode();
        result = 31 * result + eleventh.hashCode();
        result = 31 * result + twelfth.hashCode();
        result = 31 * result + thirteenth.hashCode();
        result = 31 * result + fourteenth.hashCode();
        result = 31 * result + fifteenth.hashCode();
        result = 31 * result + sixteenth.hashCode();
        result = 31 * result + seventeenth.hashCode();
        result = 31 * result + eighteenth.hashCode();
        result = 31 * result + nineteenth.hashCode();
        result = 31 * result + twentieth.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ItemBean{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", third='" + third + '\'' +
                ", fourth='" + fourth + '\'' +
                ", fifth='" + fifth + '\'' +
                ", sixth='" + sixth + '\'' +
                ", seventh='" + seventh + '\'' +
                ", eighth='" + eighth + '\'' +
                ", ninth='" + ninth + '\'' +
                ", tenth='" + tenth + '\'' +
                ", eleventh='" + eleventh + '\'' +
                ", twelfth='" + twelfth + '\'' +
                ", thirteenth='" + thirteenth + '\'' +
                ", fourteenth='" + fourteenth + '\'' +
                ", fifteenth='" + fifteenth + '\'' +
                ", sixteenth='" + sixteenth + '\'' +
                ", seventeenth='" + seventeenth + '\'' +
                ", eighteenth='" + eighteenth + '\'' +
                ", nineteenth='" + nineteenth + '\'' +
                ", twentieth='" + twentieth + '\'' +
                '}';
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public String getFifth() {
        return fifth;
    }

    public void setFifth(String fifth) {
        this.fifth = fifth;
    }

    public String getSixth() {
        return sixth;
    }

    public void setSixth(String sixth) {
        this.sixth = sixth;
    }

    public String getSeventh() {
        return seventh;
    }

    public void setSeventh(String seventh) {
        this.seventh = seventh;
    }

    public String getEighth() {
        return eighth;
    }

    public void setEighth(String eighth) {
        this.eighth = eighth;
    }

    public String getNinth() {
        return ninth;
    }

    public void setNinth(String ninth) {
        this.ninth = ninth;
    }

    public String getTenth() {
        return tenth;
    }

    public void setTenth(String tenth) {
        this.tenth = tenth;
    }

    public String getEleventh() {
        return eleventh;
    }

    public void setEleventh(String eleventh) {
        this.eleventh = eleventh;
    }

    public String getTwelfth() {
        return twelfth;
    }

    public void setTwelfth(String twelfth) {
        this.twelfth = twelfth;
    }

    public String getThirteenth() {
        return thirteenth;
    }

    public void setThirteenth(String thirteenth) {
        this.thirteenth = thirteenth;
    }

    public String getFourteenth() {
        return fourteenth;
    }

    public void setFourteenth(String fourteenth) {
        this.fourteenth = fourteenth;
    }

    public String getFifteenth() {
        return fifteenth;
    }

    public void setFifteenth(String fifteenth) {
        this.fifteenth = fifteenth;
    }

    public String getSixteenth() {
        return sixteenth;
    }

    public void setSixteenth(String sixteenth) {
        this.sixteenth = sixteenth;
    }

    public String getSeventeenth() {
        return seventeenth;
    }

    public void setSeventeenth(String seventeenth) {
        this.seventeenth = seventeenth;
    }

    public String getEighteenth() {
        return eighteenth;
    }

    public void setEighteenth(String eighteenth) {
        this.eighteenth = eighteenth;
    }

    public String getNineteenth() {
        return nineteenth;
    }

    public void setNineteenth(String nineteenth) {
        this.nineteenth = nineteenth;
    }

    public String getTwentieth() {
        return twentieth;
    }

    public void setTwentieth(String twentieth) {
        this.twentieth = twentieth;
    }
}
