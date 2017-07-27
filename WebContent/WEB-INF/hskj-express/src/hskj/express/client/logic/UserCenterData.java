package hskj.express.client.logic;

import java.util.*;

public class UserCenterData {
     HashMap <String , UserData> users = new HashMap<String , UserData>();
     private static UserCenterData ucd = new UserCenterData();
     
     public static UserCenterData getUCD(){
    	 return ucd;
     }
     // 登陆的时候添加新的用户
     public void addNewUser(UserData ud){
    	 users.put(ud.getLinkroleid(), ud);
    	 System.out.print("\n"+ud.getLinkroleid()+" 用户登陆系统, 用户信息= "+ud.slString());
     }
     // 通过用户ID获得用户信息    
     public UserData getUserDataByUserId(String uid){
    	 return users.get(uid);
     }
     // 获得在线人数
     public int getOnLineNumber(){
    	 return users.size();
     }
     // 删除用户信息
     public void removeUserById(String uid){
    	 users.remove(uid);
     }
     
     
     
     
}
