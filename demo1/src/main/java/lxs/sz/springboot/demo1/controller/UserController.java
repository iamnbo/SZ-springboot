package lxs.sz.springboot.demo1.controller;

import lxs.sz.springboot.demo1.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lixishuang
 * @date 2020/02/29 下午 05:10
 */
@Controller
public class UserController {

    @Autowired
    User user;

    @RequestMapping("springboot")
    @ResponseBody
    public String user(){
        System.out.println(user);
        return "hello spring";
    }
}
