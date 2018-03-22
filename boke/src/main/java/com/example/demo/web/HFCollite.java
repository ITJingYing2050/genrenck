package com.example.demo.web;

import com.example.demo.dao.HuiFudao;
import com.example.demo.shiti.HuiFu;
import com.example.demo.shiti.YongHu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2018/2/2.
 */
@Controller
public class HFCollite {
    @Autowired
    HuiFudao huiFudao;

    @PostMapping("/addhf")
    public String addyh(HuiFu huiFu){
        huiFudao.save(huiFu);
        return "redirect:/view/liuyan";
    }
    @GetMapping("/delhf")
    public String delyh(Integer id){
        huiFudao.delete(id);
        return "redirect:/view/liuyan";
    }

    @GetMapping("/view/zhesin")
    public String zhe(){
        return "view/zhesin";
    }


}
