package com.example.demo_springboot.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/User")
    public String userView(){
        return "userView";
    }
//    @RequestMapping(path = "/home", method = RequestMethod.GET)
//    public String index(Model model){
//        ArrayList<Integer> smm = new ArrayList<Integer>();
//        smm.add(1);
//        smm.add(3);
//        model.addAttribute("smm",smm);
//        return "index";
//    }
//
//
//    @RequestMapping(path = "/home_get", method = RequestMethod.GET)
//    public String index_get(Model model){
//        model.addAttribute("SearchDto", new SearchDto());
//        return "index_post";
//    }
//
//
//    @RequestMapping(value = "/home_post", method = RequestMethod.POST)
//    public String index_post(SearchDto searchDto, RedirectAttributes redirectAttributes){
//        System.out.println(searchDto.id + " " + searchDto.name);
//        redirectAttributes.addFlashAttribute("Thong bao", "Success");
//        return "redirect:/home_get";
////        return "index_post";
//    }
//
//    @GetMapping("/indexxxx")
//    public String indexxxx(Model model){
//        List<StudentModal> smm = StudentModal.smmmm;
//        model.addAttribute("smm",smm);
//        model.addAttribute("StudentModal", new StudentModal());
//        return "index";
//    }
//    @PostMapping("create")
//    public String create(StudentModal studentModal, RedirectAttributes redirectAttributes){
//        StudentModal.smmmm.add(studentModal);
//        redirectAttributes.addFlashAttribute("message","Thêm mới thành công");
//        return "redirect:/indexxxx";
//    }
}
