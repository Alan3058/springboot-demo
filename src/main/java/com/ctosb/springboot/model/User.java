/*
 * @Project Name: springboot-demo
 * @File Name: User.java
 * @Package Name: com.ctosb.springboot.model
 * @Date: 2017年9月1日下午12:59:00
 * @Creator: liliangang-1163
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.ctosb.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * TODO
 * @author liliangang-1163
 * @date 2017年9月1日下午12:59:00
 * @see
 */
@Entity
public class User {

	@Id
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	//@SequenceGenerator(name = "id_generator", sequenceName = "id_sequence", initialValue = 23)
	@GeneratedValue(generator = "system-uuid")
	private String id;
	@Column
	private String name;
	@Column
	private Integer age;

	public User() {
	}

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
