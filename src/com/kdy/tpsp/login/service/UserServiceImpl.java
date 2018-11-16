package com.kdy.tpsp.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kdy.tpsp.login.dao.IUserDao;
import com.kdy.tpsp.login.model.User;

@Service("userService")
public class UserServiceImpl implements IUserService {

	// �Զ�װ��
	@Resource
	private IUserDao userDao;

	/**
	 * �����û�id��ѯ�û�
	 */
	public User queryUserById(int userid) {
		return userDao.queryUserById(userid);
	}

	/**
	 * �����û�
	 */
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	/**
	 * �޸��û�
	 */
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

}