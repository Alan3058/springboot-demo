/*
 * @Project Name: springboot-demo
 * @File Name: UserService.java
 * @Package Name: com.ctosb.springboot.service
 * @Date: 2017年9月1日下午1:02:06
 * @Creator: liliangang-1163
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.ctosb.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ctosb.springboot.dao.UserRepository;
import com.ctosb.springboot.model.User;

/**
 * TODO
 * @author liliangang-1163
 * @date 2017年9月1日下午9:02:06
 * @see
 */
@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getByName(String name) {
		return userRepository.getByNameLike("%"+name+"%");
	}

	public User insert(User user) {
		return userRepository.save(user);
	}
}
