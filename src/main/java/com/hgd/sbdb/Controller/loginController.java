package com.hgd.sbdb.Controller;

import com.hgd.sbdb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: wzh
 * @create: 2019-10-31 20:56
 **/

@Controller
public class loginController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session){
        String pass = userMapper.getPassWordById(username);
        if (!StringUtils.isEmpty(username) && pass.equals(password)){
            //session实现在主页面显示用户姓名
            session.setAttribute("loginUser", username);
            return "Dashboard";
        }
        else {
            //map实现错误信息提示
            map.put("msg", "用户名或密码错误");
            return "login";
        }
    }
}
