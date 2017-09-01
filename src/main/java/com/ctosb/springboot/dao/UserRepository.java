/*
 * @Project Name: springboot-demo
 * @File Name: UserMapper.java
 * @Package Name: com.ctosb.springboot.mapper.UserMapper
 * @Date: 2017年9月1日下午12:57:29
 * @Creator: liliangang-1163
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.ctosb.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctosb.springboot.model.User;

/**
 * TODO
 * @author liliangang-1163
 * @date 2017年9月1日下午12:57:29
 * @see
 */
public interface UserRepository extends JpaRepository<User, String>{

	List<User> getByNameLike(String userName);

}
