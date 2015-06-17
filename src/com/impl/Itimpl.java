/**
 * 2015-6-17
 *iterator_jsonDemo1
 *Itimpl.java
 */    
package com.impl;    

import java.util.Iterator;

import com.model.Users;
    
/**
 * @author zy
 *
 */
public class Itimpl implements Iterator<Users> {
	/**     
	 * @author zy  
	 * @version   
	 * 2015-6-17 下午12:26:32   
	 */
	private int cursor=-1;
	private Iterimpl iter;
	public void setIterimpl(Iterimpl iter){
		this.iter=iter;
	}
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		/**  
		 * 2015-6-17  
		 * @author zy  
		 */
		boolean flag=false;
		if(iter.getUsersList()!=null){
			if(iter.getUsersList().size()>cursor+1)
				flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Users next() {
		// TODO Auto-generated method stub
		/**  
		 * 2015-6-17  
		 * @author zy  
		 */		
		return iter.getUsersList().get(++cursor);
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		/**  
		 * 2015-6-17  
		 * @author zy  
		 */
		iter.getUsersList().remove(cursor);
	}

}
