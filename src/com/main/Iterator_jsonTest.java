/**
 * 2015-6-16
 *iterator_jsonDemo1
 *Iterator_jsonTest.java
 */
package com.main;

import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.impl.Iterimpl;
import com.json.GetJson;
import com.model.Users;

/**
 * @author zy
 *
 */
public class Iterator_jsonTest {

	/**2015-6-16
	 *main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterimpl iter=new Iterimpl();
		Users user=new Users();
		user.setName("zy");
		user.setPassword("123");
		user.setSex("男");
		iter.addUsers(user);
		
		//iterator output:
		for(Users users:iter){
			System.out.println(users);
		}
		//
		Iterator<Users>it=iter.iterator();
		while(it.hasNext()){
			Users users=it.next();
			System.out.println(users);
		}
		//
		JSONArray jsonob=GetJson.getJsonFromList(iter.getUsersList());
		System.out.println("JSON OUTPUT:"+jsonob);
	}

}
