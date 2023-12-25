package com.user.service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.model.User;

import java.io.File;
import java.io.IOException;

public class UserService {

    public void write() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user1 = new User("Pedro");

        String asJson = mapper.writeValueAsString(user1);
        System.out.println(asJson);

        mapper.writeValue(new File("user.json"), user1);
    }



    public void read() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        User user = objectMapper.readValue(new File("user.json"), User.class);

        System.out.println(user);
    }
}

