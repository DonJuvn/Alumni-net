//package net.javaguides.sms.controller;
//
//
//import net.javaguides.sms.service.LoginService;
//import org.apache.tomcat.jni.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Objects;
//
//@Controller
//public class LoginController {
//
//    @Autowired
//    private LoginService userService;
//
//    @GetMapping("/login")
//
//    public ModelAndView login() {
//        ModelAndView mav = new ModelAndView("login");
//        mav.addObject("user", new net.javaguides.sms.domain.Login());
//        return mav;
//    }
//
//
//    @PostMapping("/login")
//    public String login(@ModelAttribute("user") net.javaguides.sms.domain.Login user) {
//        net.javaguides.sms.domain.Login oauthUser = userService.login(user.getUsername(), user.getPassword());
//
//        System.out.print(oauthUser);
//        if (Objects.nonNull(oauthUser)) return "redirect:/";
//        else return "redirect:/login";
//    }
//
//    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
//    public String logoutDo(HttpServletRequest request, HttpServletResponse response){
//        return "redirecting:/login";
//    }
//}
