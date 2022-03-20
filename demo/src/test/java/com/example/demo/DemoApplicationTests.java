package com.example.demo;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("user.java"));
        String number = bufferedReader.readLine();
        String pwd = bufferedReader.readLine();
        HashMap<String, String> map = new HashMap<>();
        map.put("number",number);map.put("pwd",pwd);

        int i=0;
        try{
            user user = userMapper.searchuser(map);
            System.out.println("\n\n");
            if(user!=null){
                i=1;
            }
        }catch (NullPointerException e){
        }finally {
            if (i==1){
                System.out.println("登陆成功");
            }else{
                System.out.println("登陆失败");
            }
            System.out.println("\n\n");
            bufferedReader.close();
        }
    }

    @Test
    void test2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("regist.java"));
        String number = bufferedReader.readLine();
        String pwd =bufferedReader.readLine();
        String work =bufferedReader.readLine();
        user user = userMapper.regist(number);

        int i=0;
        try {
            System.out.println("\n\n");
            if (user!=null){
                i=1;
            }
        }catch (NullPointerException e){
        }finally {
            if (i==1){
                System.out.println("已存在该用户");
            }
            else {
                int s = userMapper.adduser(new user(number, pwd, work));
                if (s==0){
                    System.out.println("注册失败");
                }else {
                    System.out.println("注册成功");
                }
            }
            System.out.println("\n\n");
        }
    }

}
