package com.ws.model.wechat.model;

public class User {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.passWrod
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	private String passwrod;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.username
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.pic
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	private String pic;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.passWrod
	 * @return  the value of user.passWrod
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	public String getPasswrod() {
		return passwrod;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.passWrod
	 * @param passwrod  the value for user.passWrod
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.username
	 * @return  the value of user.username
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.username
	 * @param username  the value for user.username
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.pic
	 * @return  the value of user.pic
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	public String getPic() {
		return pic;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.pic
	 * @param pic  the value for user.pic
	 * @mbggenerated  Sun Jul 09 00:06:00 CST 2017
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", passwrod=" + passwrod + ", username="
				+ username + "]";
	}
    
}