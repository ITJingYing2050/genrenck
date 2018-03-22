package com.example.demo.web;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.HuiFudao;
import com.example.demo.dao.YongHudao;
import com.example.demo.shiti.YongHu;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/1/22.
 */
@Controller
public class YongCollite {
    @Autowired
    YongHudao yongHudao;
    @Autowired
    HuiFudao huiFudao;

    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/index/layout")
    public String layout(){
        return "index/layout";
    }
    @GetMapping("/index/vue")
    public String layout1(){
        return "index/vue";
    }
    @GetMapping("/index")
    public String about1(){
        return "index";
    }
    @GetMapping("/listpic")
    public String about2(){
        return "listpic";
    }
    @GetMapping("/newlistpic")
    public String about3(){
        return "newlistpic";
    }
    @GetMapping("/newlistpic2")
    public String about31(){
        return "newlistpic2";
    }
    @GetMapping("/newlistpic3")
    public String about32(){
        return "newlistpic3";
    }
    @GetMapping("/view/liuyan")
    public String about4(Model model){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session =request.getSession();
        model.addAttribute("yhs",yongHudao.findAll());
        model.addAttribute("session",session);
        return "view/liuyan";
    }
    @GetMapping("/news/comment.html")
    public String about41(Model model){
        model.addAttribute("yhs",yongHudao.findAll());
        return "news/comment";
    }
    @GetMapping("/news/manage-user.html")
    public String manageuser(Model model){
        model.addAttribute("yhs",yongHudao.findAll());
        return "news/manage-user";

    }
    @GetMapping("/Comment/see")
    @ResponseBody
    public String about42(Integer id){
      YongHu yongHu = yongHudao.findOne(id);
      String jsonString = JSON.toJSONString(yongHu);
        System.out.println(jsonString);
        return jsonString;
    }
    @GetMapping("/view/xinling")
    public String xin(){
        return "view/xinling";
    }
    @PostMapping("/add")
    public String addyh(YongHu yongHu){
        yongHudao.save(yongHu);
        return "redirect:/view/liuyan";
    }
    @PostMapping("/add1")
    public String addyh1(YongHu yongHu,Model model){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session =request.getSession();
        session.setAttribute("yh", yongHu);
        return "redirect:/view/liuyan";
    }
    @GetMapping("/del")
    public String delyh(Integer id){
        huiFudao.deleteHuiFuByYongHu(id);
        yongHudao.delete(id);
        return "redirect:/view/liuyan";
    }
    @GetMapping("/del2")
    public String delyh2(Integer id){
        huiFudao.deleteHuiFuByYongHu(id);
        yongHudao.delete(id);
        return "redirect:/news/comment.html";
    }
    @GetMapping("/del3")
    public String delyh3(Integer id){
        huiFudao.deleteHuiFuByYongHu(id);
        yongHudao.delete(id);
        return "redirect:/news/manage-user.html";
    }
    @GetMapping("/dels")
    public String delsession(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session =request.getSession();
        session.invalidate();
        return "redirect:/view/liuyan";
    }

}
