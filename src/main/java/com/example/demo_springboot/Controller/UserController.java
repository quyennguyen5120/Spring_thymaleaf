package com.example.demo_springboot.Controller;

import com.example.demo_springboot.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("listCategroy", categoryService.getListByDto());
        return "userView";
    }

    @GetMapping("/indexxx")
    public String indexxx(){
        return "testFragment";
    }
}
