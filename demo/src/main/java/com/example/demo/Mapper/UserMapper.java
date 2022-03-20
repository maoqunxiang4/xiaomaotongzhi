package com.example.demo.Mapper;

import com.example.demo.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import javax.xml.ws.RequestWrapper;
import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserMapper {
    user searchuser(Map map);

    user regist(String usernumber);

    int adduser (user user);
}
