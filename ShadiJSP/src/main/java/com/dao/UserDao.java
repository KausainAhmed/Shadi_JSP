package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.module.UserDetails;

import connection.util.ConnectionUtil;

public class UserDao {
	public void save(UserDetails ud) {
		Connection con = ConnectionUtil.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(
					"insert into shadi(age,name,email,gender,country,city,mnumber) values (?,?,?,?,?,?,?)");
			ps.setInt(1, ud.getAge());
			ps.setString(2, ud.getName());
			ps.setString(3, ud.getEmail());
			ps.setString(4, ud.getGender());
			ps.setString(5, ud.getCountry());
			ps.setString(6, ud.getCity());
			ps.setString(7, ud.getMnumber());

			int ex = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//finding a user
	public UserDetails findUser(int age) {
		UserDetails ud = new UserDetails();
		try {
			Connection con = ConnectionUtil.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from shadi where age=?");
			ps.setInt(1, age);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ud.setId(rs.getInt(1));
				ud.setAge(rs.getInt(2));
				ud.setName(rs.getString(3));
				ud.setEmail(rs.getString(4));
				ud.setGender(rs.getString(5));
				ud.setCountry(rs.getString(6));
				ud.setCity(rs.getString(7));
				ud.setMnumber(rs.getString(8));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ud;
	}

//deleting a user
	public UserDetails userDelete(int age) {
		UserDetails ud = new UserDetails();
		Connection connection = ConnectionUtil.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("delete from shadi where age=?");
			statement.setInt(1, age);
			// ResultSet resultSet = statement.executeQuery();
			int delete = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ud;
	}

	public UserDetails userUpdate(UserDetails ud) {
		// UserBean bean=new UserBean();
		Connection connection = ConnectionUtil.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("update from shadi where age=?");
			// statement.setInt(1, bean.getId());
			statement.setString(1, ud.getName());
			statement.setString(1, ud.getEmail());
			statement.setString(1, ud.getGender());
			statement.setString(1, ud.getCountry());
			statement.setString(1, ud.getCity());
			statement.setString(1, ud.getMnumber());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ud;

	}

}
