/**
 * 2015-6-17
 *iterator_jsonDemo1
 *Users.java
 */    
package com.model;    
    
/**
 * @author zy
 *
 */
public class Users {
	/**     
	 * @author zy  
	 * @version   
	 * 2015-6-17 下午12:07:13   
	 */
	private String name;
	private String password;
	private String sex;
	
	public String toString()
	{
		return "name:"+name+","+"password:"+password+","+"sex:"+sex;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
