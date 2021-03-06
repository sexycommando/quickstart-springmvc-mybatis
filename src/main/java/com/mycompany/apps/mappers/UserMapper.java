package com.mycompany.apps.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mycompany.apps.entities.User;

/**
 * @author stnetadmin
 *
 */
public interface UserMapper {

	@Select("select user_id as userId, username as userName from user where user_id=#{userId}")
	public User findUserById(Integer userId);

	@Select("select user_id as userId, username as userName from user")
	public List<User> findAllUsers();
}
