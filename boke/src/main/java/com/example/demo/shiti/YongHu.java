package com.example.demo.shiti;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/11/17.
 */
@Entity
public class YongHu {
    @Id
    @GeneratedValue
    @Column(length = 20)
    private int id;
    @Column(length = 120)
    private String dizhi;
    @Column(length = 50)
    private String name;
    @Temporal(TemporalType.DATE)
    private Date time;
    private String jizi;
    @OneToMany(mappedBy = "yongHu")
    private List<HuiFu> list=new ArrayList<HuiFu>();

    public YongHu() {
    }

    public YongHu(String dizhi, String name, Date time, String jizi) {
        this.dizhi = dizhi;
        this.name = name;
        this.time = time;
        this.jizi = jizi;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getJizi() {
        return jizi;
    }

    public void setJizi(String jizi) {
        this.jizi = jizi;
    }


    public List<HuiFu> getList() {
        return list;
    }

    public void setList(List<HuiFu> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "YongHu{" +
                "id=" + id +
                ", dizhi='" + dizhi + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", jizi='" + jizi + '\'' +

                '}';
    }
}
