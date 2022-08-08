package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
//import service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    UserService userService;
    private Integer userId;


//    public UserController(Integer userId) {
//        this.userId = userId;
//    }

    //添加用户
    @RequestMapping("/addUser")
    public Map addUser(String userName,String sex,String phone,String  password,Integer state,Integer administratir){
        int flag = userService.addUser(userName,sex,phone,password,state,administratir);
        Map<String,Object> map = new HashMap<String,Object>();
        if(flag == 1){
            map.put("msg","新增用户成功");
            return map;
        }else{
            map.put("msg","新增用户失败");
            return map;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/deleteUser")
    public  String dropUser(Integer user_id){
        int flag = userService.dropUser(user_id);

        if(flag == 1){
            return "users";
        }else{
            return "error";
        }
    }

    @RequestMapping("/modifyUser")
    public Map modifyUser(Integer userId,String state,String password ){
        int flag = userService.modifyUser(userId,state,password);
        Map<String,Object> map = new HashMap<>();
        if(flag == 1){
            map.put("msg","修改用户信息成功");
            return map;
        }else {
            map.put("msg","修改用户信息失败");
            return map;
        }
    }

    @RequestMapping("/user+{user_id}")
    public String queryUser(@PathVariable("user_id")Integer user_id,ModelMap modelMap){
        User user = userService.queryUserByUserId(userId);
        modelMap.addAttribute("user",user);
        return "userInfo";
    }

    @RequestMapping("/users")
    public List<User> showUsers(){
        List<User> userList = userService.queryAllUser();


        return userList;
    }
}
