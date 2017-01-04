package com.teng.service;
 
import java.util.List;    
import com.teng.model.UserInfo;  
	  
/**  
 * @author teng
 * @version 1.0   
 */  
public interface UserService {  
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	UserInfo getUserById(int id);  
      
	/**
	 * 查询
	 * @return
	 */
    List<UserInfo> getUsers();  
      
    /**
     * 插入
     * @param userInfo
     * @return
     */
    int insert(UserInfo userInfo);  
}  
