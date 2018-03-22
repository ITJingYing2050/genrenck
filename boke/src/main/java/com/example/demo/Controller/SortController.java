package com.example.demo.Controller;

import com.example.demo.dao.WenZhangdao;
import com.example.demo.shiti.Wenzhang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;

@Controller
public class SortController {

    @Autowired
    private WenZhangdao dao;

    int size=5;

    @GetMapping("/news/article.html")
    public String get(Model model){
        //排序，第一个参数是排序的方式，第二个参数是根据什么属性进行排序
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        //分页的方法，第一个参数是第几页，第二参数是每一页有多少条数据，第三个参数是排序
        //前端从1开始，jpa从0开始
        Pageable pageable = new PageRequest(0, size, sort);
        //获取表里面的所有数据存到page对象里面
        Page<Wenzhang> page = dao.findAll(pageable);
        //把数据响应回客户端
        model.addAttribute("wzs",page);
        //hasPrevious()--判断是否有上一页，有的话返回true，否则返回flash
        model.addAttribute("previous",page.hasPrevious());
        //page.hasNext()--判断是否有下一页，有的话返回true，否则返回flash
        model.addAttribute("next",page.hasNext());
        //page.getNumber()--当前页数
        model.addAttribute("unmber",page.getNumber());
        //page.getTotalPages()--总页面
        model.addAttribute("all",page.getTotalPages());
        return "news/article";
    }


    //上一页
    @GetMapping("/news/isPrevious")
    public String get2(Model model,int id){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        int no=id-1;
        Pageable pageable = new PageRequest(no, size, sort);
        Page<Wenzhang> page = dao.findAll(pageable);
        model.addAttribute("wzs",page);
        //判断是否有上一页
        model.addAttribute("previous",page.hasPrevious());
        //判断是否有下一页
        model.addAttribute("next",page.nextPageable());
        model.addAttribute("unmber",page.getNumber());
        //总页面
        model.addAttribute("all",page.getTotalPages());
        return "/news/article.html";
    }

    //下一页
    @GetMapping("/news/isNext")
    public String get1(Model model,int id){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        int no=id+1;
        Pageable pageable = new PageRequest(no, size, sort);
        Page<Wenzhang> page = dao.findAll(pageable);
        model.addAttribute("wzs",page);
        //判断是否有上一页
        model.addAttribute("previous",page.hasPrevious());
        //判断是否有下一页
        model.addAttribute("next",page.hasNext());
        model.addAttribute("unmber",page.getNumber());
        //总页面
        model.addAttribute("all",page.getTotalPages());
        return "/news/article.html";
    }

    //1
    @GetMapping("/news/on")
    public String on(Model model,int id){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        int no=0;
        Pageable pageable = new PageRequest(no, size, sort);
        Page<Wenzhang> page = dao.findAll(pageable);
        model.addAttribute("wzs",page);
        //判断是否有上一页
        model.addAttribute("previous",page.hasPrevious());
        //判断是否有下一页
        model.addAttribute("next",page.hasNext());
        model.addAttribute("unmber",page.getNumber());
        //总页面
        model.addAttribute("all",page.getTotalPages());
        return "/news/article.html";
    }

    //2
    @GetMapping("/news/two")
    public String two(Model model,int id){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        int no=1;
        Pageable pageable = new PageRequest(no, size, sort);
        Page<Wenzhang> page = dao.findAll(pageable);
        model.addAttribute("wzs",page);
        //判断是否有上一页
        model.addAttribute("previous",page.hasPrevious());
        //判断是否有下一页
        model.addAttribute("next",page.hasNext());
        model.addAttribute("unmber",page.getNumber());
        //总页面
        model.addAttribute("all",page.getTotalPages());
        return "/news/article.html";
    }

    //3
    @GetMapping("/news/three")
    public String three(Model model,int id){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        int no=2;
        Pageable pageable = new PageRequest(no, size, sort);
        Page<Wenzhang> page = dao.findAll(pageable);
        model.addAttribute("wzs",page);
        //判断是否有上一页
        model.addAttribute("previous",page.hasPrevious());
        //判断是否有下一页
        model.addAttribute("next",page.hasNext());
        model.addAttribute("unmber",page.getNumber());
        //总页面
        model.addAttribute("all",page.getTotalPages());
        return "/news/article.html";
    }

    //4
    @GetMapping("/news/si")
    public String si(Model model,int id){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        int no=3;
        Pageable pageable = new PageRequest(no, size, sort);
        Page<Wenzhang> page = dao.findAll(pageable);
        model.addAttribute("wzs",page);
        //判断是否有上一页
        model.addAttribute("previous",page.hasPrevious());
        //判断是否有下一页
        model.addAttribute("next",page.hasNext());
        model.addAttribute("unmber",page.getNumber());
        //总页面
        model.addAttribute("all",page.getTotalPages());
        return "/news/article.html";
    }

}
