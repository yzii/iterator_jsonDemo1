/**
 * 2015-6-17
 *iterator_jsonDemo1
 *GetJson.java
 */    
package com.json;    

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.model.Users;

/**
 * @author zy
 *
 */
public class GetJson {
	/**     
	 * @author zy  
	 * @version   
	 * 2015-6-17 下午3:49:36   
	 * @param <JSONObject>
	 */
	public static JSONArray getJsonFromList(List<Users> users){
		JSONArray jsonObject=JSONArray.fromObject(users);
		return jsonObject;
	}
}
