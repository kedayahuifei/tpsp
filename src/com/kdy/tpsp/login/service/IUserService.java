package com.kdy.tpsp.login.service;

import com.kdy.tpsp.login.model.User;

public interface IUserService {

	/**
	 * 根据用户id查询用户
	 * 
	 * @param userid
	 * @return
	 */
	public User queryUserById(int userid);

	/**
	 * 新增用户
	 * 
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

	/**
	 * 修改用户
	 * 
	 * @param user
	 * @return
	 */
	public int updateUser(User user);

}