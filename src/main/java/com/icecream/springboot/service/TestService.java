package com.icecream.springboot.service;

import com.icecream.springboot.entity.Teacher;
import com.icecream.springboot.entity.User;
import com.icecream.springboot.repository.TeacherRepository;
import com.icecream.springboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TestService {

    private UserRepository userRepository;
    private TeacherRepository teacherRepository;

    public List<User> getUserList() {
       return userRepository.findAll();
    }

    public List<Teacher> getTeacherList() {
        return teacherRepository.findAll();
    }

    public String getUser(Long userId) {
        return "{\n" +
                "\t\t\"id\": 1,\n" +
                "\t\t\"name\": \"김길동\",\n" +
                "\t\t\"age\": 16,\n" +
                "\t\t\"학교\": \"길동중\"\n" +
                "\t}";

    }
}
