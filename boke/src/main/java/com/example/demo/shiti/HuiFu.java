package com.example.demo.shiti;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/11/17.
 */
@Entity
public class HuiFu {
    @Id
    @GeneratedValue
    @Column(length = 20)
    private int hid;
    @Column(length = 50)
    private String hname;
    private String huihua;
    @ManyToOne
    @JoinColumn(name = "id")
    private YongHu yongHu;

    public YongHu getYongHu() {
        return yongHu;
    }

    public void setYongHu(YongHu yongHu) {
        this.yongHu = yongHu;
    }

    public HuiFu() {
    }

    public HuiFu(String hname, String huihua) {
        this.hname = hname;
        this.huihua = huihua;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHuihua() {
        return huihua;
    }

    public void setHuihua(String huihua) {
        this.huihua = huihua;
    }

    @Override
    public String toString() {
        return "HuiFu{" +
                "hid=" + hid +
                ", hname='" + hname + '\'' +
                ", huihua='" + huihua + '\'' +
                '}';
    }
}
