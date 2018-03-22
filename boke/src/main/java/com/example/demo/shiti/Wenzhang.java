package com.example.demo.shiti;

import javax.persistence.*;
import java.lang.String;
import java.util.Date;


/**
 * Created by Administrator on 2018/3/16.
 */
@Entity
public class Wenzhang {
    @Id
    @GeneratedValue
    @Column(length = 20)
    private int id;
    @Column(length = 120)
    private String tiltle;
    @Column(length = 50)
    private String lanmu;
    @Column(columnDefinition="TEXT",nullable=true)
    private String conter;
    @Column(length = 50)
    private String biaoqian;
    @Temporal(TemporalType.DATE)
    private Date datetime;

    public Wenzhang() {
    }

    public Wenzhang(String tiltle, String lanmu, String conter, String biaoqian, Date datetime) {
        this.tiltle = tiltle;
        this.lanmu = lanmu;
        this.conter = conter;
        this.biaoqian = biaoqian;
        this.datetime = datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTiltle() {
        return tiltle;
    }

    public void setTiltle(String tiltle) {
        this.tiltle = tiltle;
    }

    public String getLanmu() {
        return lanmu;
    }

    public void setLanmu(String lanmu) {
        this.lanmu = lanmu;
    }

    public String getConter() {
        return conter;
    }

    public void setConter(String conter) {
        this.conter = conter;
    }

    public String getBiaoqian() {
        return biaoqian;
    }

    public void setBiaoqian(String biaoqian) {
        this.biaoqian = biaoqian;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Wenzhang{" +
                "id=" + id +
                ", tiltle='" + tiltle + '\'' +
                ", lanmu='" + lanmu + '\'' +
                ", conter='" + conter + '\'' +
                ", biaoqian='" + biaoqian + '\'' +
                ", time=" + datetime +
                '}';
    }
}
