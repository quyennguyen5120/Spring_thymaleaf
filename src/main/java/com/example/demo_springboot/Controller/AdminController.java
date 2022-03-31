package com.example.demo_springboot.Controller;

import com.example.demo_springboot.Modal.CategoryModal;
import com.example.demo_springboot.Repository.CategoryRepository;
import com.example.demo_springboot.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("listCategroy", categoryService.getAll());
        return "adminView";
    }

    @GetMapping("/create")
    public String create(Model model){
        List<String> lstParentCode = categoryRepository.getAllPerentCode();
        model.addAttribute("obj", new CategoryModal());
        model.addAttribute("lstParentCode",lstParentCode);
        return "createForm";
    }

    @PostMapping("/createCategory")
    public String create(CategoryModal CategoryModal){
        categoryService.createOrUpdateCategory(CategoryModal);
        return "redirect:/admin/index";
    }

    @GetMapping("/delete/")
    public String removeCategory(@RequestParam(value = "id", required = false) int id){
        categoryService.removeCategory(id);
        return "redirect:/admin/index";
    }

    @GetMapping("/update/")
    public String updateCategory(@RequestParam(value = "id", required = false) int id,Model model){
        CategoryModal cm = CategoryModal.lstCategoryModal.stream().filter(x->x.getId() == id).findAny().orElse(null);
        List<String> lstParentCode = categoryRepository.getAllPerentCode();
        model.addAttribute("object",cm);
        model.addAttribute("lstParentCode",lstParentCode);
        model.addAttribute("obj",new CategoryModal());
        return "editCategory";
    }

    @PostMapping("/updateCategory")
    public String updateCategory(CategoryModal CategoryModal){
        categoryService.createOrUpdateCategory(CategoryModal);
        return "redirect:/admin/index";
    }

}
