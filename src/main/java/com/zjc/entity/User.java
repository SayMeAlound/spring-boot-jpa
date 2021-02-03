package com.zjc.entity;/*

    @author  zjc
    @create 2021-02-03-15:36
     
*/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Getter
@Setter
@ToString
//使用JPA注解配置映射关系
@Entity
@Table(name = "tbl_user")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class User implements Serializable {
    @Id   //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //自增主键
    private Integer id;
    @Column(name = "last_name",length = 50)
    private String lastName;
    @Column  //省略默认 列名就是属性名
    private String email;
}
