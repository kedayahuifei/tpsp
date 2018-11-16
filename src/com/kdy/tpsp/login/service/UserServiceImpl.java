package com.kdy.tpsp.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kdy.tpsp.login.dao.IUserDao;
import com.kdy.tpsp.login.model.User;

@Service("userService")
public class UserServiceImpl implements IUserService {

	// 自动装配
	@Resource
	private IUserDao userDao;

	/**
	 * 根据用户id查询用户
	 */
	public User queryUserById(int userid) {
		return userDao.queryUserById(userid);
	}

	/**
	 * 新增用户
	 */
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	/**
	 * 修改用户
	 */
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

}