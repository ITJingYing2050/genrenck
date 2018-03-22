package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2018/3/14.
 */
@Controller
public class NewCollite {
    @GetMapping("/news/Blog.html")
    public String blog(){

        return "news/Blog";

    }
    @GetMapping("/news/login.html")
    public String login(){

        return "news/login";

    }
    @GetMapping("/news/index.html")
    public String index(){

        return "news/index";

    }
    @GetMapping("/news/add-article.html")
    public String addaticle(){

        return "news/add-article";

    }
    @GetMapping("/news/add-category.html")
    public String addcategory(){

        return "news/add-category";

    }
    @GetMapping("/news/add-flink.html")
    public String addflink(){

        return "news/add-flink";

    }
    @GetMapping("/news/add-notice.html")
    public String addnotice(){

        return "news/add-notice";

    }

    @GetMapping("/news/category.html")
    public String category(){

        return "news/category";

    }

    @GetMapping("/news/flink.html")
    public String flink(){

        return "news/flink";

    }
    @GetMapping("/news/loginlog.html")
    public String loginlog(){

        return "news/loginlog";

    }

    @GetMapping("/news/notice.html")
    public String notice(){

        return "news/notice";

    }
    @GetMapping("/news/readset.html")
    public String readset(){

        return "news/readset";

    }
    @GetMapping("/news/setting.html")
    public String setting(){

        return "news/setting";

    }
    @GetMapping("/news/update-article.html")
    public String updatearticle(){

        return "news/update-article";

    }
    @GetMapping("/news/update-category.html")
    public String updatecategory(){

        return "news/update-category";

    }
    @GetMapping("/news/update-flink.html")
    public String updateflink(){

        return "news/upadte-flink";

    }

}
