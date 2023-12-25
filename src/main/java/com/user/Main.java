package com.user;

import com.user.service.UserService;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserService userService = new UserService();
        try{
            userService.write();
            userService.read();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}