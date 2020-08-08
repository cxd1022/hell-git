package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserAction {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")  //接收用户的数据
    public String register(User user, HttpSession session) throws Exception {
        //调用业务
        userService.register(user);
        session.setAttribute("flag", "Y");
        return "redirect:/user/showAll";
    }

    @RequestMapping("/showAll")
    public String showAll(Model model) throws Exception {
        List<User> users = userService.showAll();
        model.addAttribute("users", users);
        return "showAll";
    }

    @RequestMapping("/deleteByID")
    public String deleteByID(Integer id) throws Exception {
        userService.delete(id);
        return "redirect:/user/showAll";
    }

    //登陆
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session) throws Exception {
        User user = userService.login(username, password);
        if (user != null) {
            //登陆成功存储标志位
            session.setAttribute("flag", "Y");
            return "redirect:/user/showAll";
        } else {
            return "login";
        }
    }
}
