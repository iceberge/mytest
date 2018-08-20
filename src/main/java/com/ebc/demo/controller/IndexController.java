package com.ebc.demo.controller;

import com.ebc.demo.entity.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping(value = {"", "index"}, method = RequestMethod.GET)
    public String index(Model model){
        UserBean person = new UserBean();
        person.setName("张三");
        person.setAge(22);

        List<UserBean> people = new ArrayList<>();
        UserBean p1 = new UserBean();
        p1.setName("李四");
        p1.setAge(23);
        people.add(p1);

        UserBean p2 = new UserBean();
        p2.setName("王五");
        p2.setAge(24);
        people.add(p2);

        UserBean p3 = new UserBean();
        p3.setName("赵六");
        p3.setAge(25);
        people.add(p3);

        model.addAttribute("person", person);
        model.addAttribute("people", people);

        return "index";
    }
}
