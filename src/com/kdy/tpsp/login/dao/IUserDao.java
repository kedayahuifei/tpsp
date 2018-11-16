
package com.kdy.tpsp.login.dao;

import com.kdy.tpsp.login.model.User;

public interface IUserDao {

	public User queryUserById(int userId);

	public int insertUser(User user);

	public int updateUser(User user);
}
