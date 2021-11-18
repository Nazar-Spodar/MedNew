package com.example.mednew.dao;

import com.example.mednew.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public UserDto saveUserInDB(UserDto userDto) {
        entityManager.persist(userDto);
        return userDto;
    }

    public List<UserDto> getAll() {
        Query nativeQuery = entityManager.createNativeQuery("select * from users", UserDto.class);
        List<UserDto> resultList = nativeQuery.getResultList();
        return resultList;
    }
}
