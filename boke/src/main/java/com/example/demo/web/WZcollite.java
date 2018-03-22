package com.example.demo.web;

import com.example.demo.dao.WenZhangdao;
import com.example.demo.shiti.Wenzhang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2018/3/16.
 */
@Controller
public class WZcollite {
    @Autowired
    WenZhangdao wenZhangdao;
    @GetMapping("/delwz")
    public String addaticle(Integer id){
        wenZhangdao.delete(id);
        return "redirect:/news/article.html";

    }
    @PostMapping("/addwz")
    public String articl(Wenzhang wenzhang){
        //System.out.println(wenzhang);
        wenZhangdao.save(wenzhang);
        return "redirect:/news/article.html";

    }
    @GetMapping("/view/jingys")
    public String tice(Model model){
        model.addAttribute("wz7",wenZhangdao.findOne(21));
        return "view/jingys";

    }
    @GetMapping("/view/yidong")
    public String wenz(Model model){
        model.addAttribute("wz15",wenZhangdao.findOne(15));
        return "view/yidong";

    }
    @GetMapping("/view/gerenrj")
    public String gerj(Model model){
        model.addAttribute("wz19",wenZhangdao.findOne(19));
        return "view/gerenrj";

    }
    @GetMapping("/view/grrj")
    public String gerj2(Model model){
        model.addAttribute("wz20",wenZhangdao.findOne(20));
        return "view/grrj";

    }
    @GetMapping("/view/jswz")
    public String jswz(Model model){
        model.addAttribute("wz16",wenZhangdao.findOne(16));
        return "view/jswz";

    }
    @GetMapping("/view/jswz2")
    public String jswz2(Model model){
        model.addAttribute("wz17",wenZhangdao.findOne(17));
        return "view/jswz2";

    }
    @GetMapping("/view/jswz3")
    public String jswz3(Model model){
        model.addAttribute("wz18",wenZhangdao.findOne(18));
        return "view/jswz3";

    }
    @GetMapping("/view/suibian")
    public String jswz4(Model model){
        model.addAttribute("wz100",wenZhangdao.findOne(22));
        return "view/suibian";

    }
    @GetMapping("/view/suibian2")
    public String jswz5(Model model){
        model.addAttribute("wz23",wenZhangdao.findOne(25));
        return "view/suibian2";

    }
}
