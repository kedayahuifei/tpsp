package com.kdy.tpsp.login.service;

import com.kdy.tpsp.login.model.User;

public interface IUserService {

	/**
	 * �����û�id��ѯ�û�
	 * 
	 * @param userid
	 * @return
	 */
	public User queryUserById(int userid);

	/**
	 * �����û�
	 * 
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

	/**
	 * �޸��û�
	 * 
	 * @param user
	 * @return
	 */
	public int updateUser(User user);

}