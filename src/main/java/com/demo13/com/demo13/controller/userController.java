package com.demo13.com.demo13.controller;

import com.demo13.com.demo13.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/users")
public class userController {

    @PostMapping
    public String sava(@RequestBody User u){
        System.out.println("save is done post" +u);
        return "save is done post"+u;

    }

    @PutMapping
    public String update(@RequestBody User u){
        System.out.println("update is done PUT"+u);
        return "update is done PUT"+u;

    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        System.out.println("delete is done DELETE id='"+id+"'");
        return "delete is done DELETE id='"+id+"'";

    }

    @GetMapping("/{id}")
    public String getbyid(@PathVariable String id){
        System.out.println(" getby id is done id='"+id+"'");
        return " getby id is done id='"+id+"'";
    }

    @GetMapping
    public String getstud(){
        System.out.println(" getstudgetstud id is done");
        return "getstudgetstud is done ";
    }


}
