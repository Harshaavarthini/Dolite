package com.dolite.backend.Controller;

import com.dolite.backend.DTO.UserDTO;
import com.dolite.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/signin")
    public String saveUser(@RequestBody   UserDTO userDTO){
        userService.saveUser(userDTO);
        return "Saved successfully";
    }
}
