/**
 * 2015-6-17
 *iterator_jsonDemo1
 *Iterimpl.java
 */    
package com.impl;    

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.model.Users;
    
/**
 * @author zy
 *
 */
public class Iterimpl implements Iterable<Users> {
	/**     
	 * @author zy  
	 * @version   
	 * 2015-6-17 下午12:21:20   
	 */
	List<Users>usersList=new ArrayList<Users>();
	public void addUsers(Users users){
		this.usersList.add(users);
	}
	public List<Users>getUsersList(){
		return usersList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Users> iterator() {
		// TODO Auto-generated method stub
		/**  
		 * 2015-6-17  
		 * @author zy  
		 */
		Itimpl it=new Itimpl();
		it.setIterimpl(this);
		return it;
	}

}
