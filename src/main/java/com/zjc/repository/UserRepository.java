package com.zjc.repository;/*

    @author  zjc
    @create 2021-02-03-15:43
     
*/

import com.zjc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 继承JpaRepository 来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {
}
