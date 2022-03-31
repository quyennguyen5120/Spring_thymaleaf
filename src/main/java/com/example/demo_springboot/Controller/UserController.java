package com.example.demo_springboot.Controller;

import com.example.demo_springboot.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/index")
    public String index(Model model, @CookieValue(value = "school") String schoolzxc) {
        System.out.println(schoolzxc);
        model.addAttribute("listCategroy", categoryService.getListByDto());
        return "userView";
    }

    @GetMapping("/indexxx")
    public String indexxx(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("school", "NIIT");
        cookie.setMaxAge(10);
        response.addCookie(cookie);
        return "testFragment";
    }
}
