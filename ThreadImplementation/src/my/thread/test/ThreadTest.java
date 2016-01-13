package my.thread.test;

import java.util.ArrayList;  
import java.util.List;  
  
  
public class ThreadTest {  
  
 public static List<RegistryBean> registryList= new ArrayList<RegistryBean>();  
 public static void main(String args[]){  
    
  RegistryBean obj1= new RegistryBean(1,false);  
  RegistryBean obj2= new RegistryBean(2,false);  
  RegistryBean obj3= new RegistryBean(3,false);  
  RegistryBean obj4= new RegistryBean(4,false);  
  RegistryBean obj5= new RegistryBean(5,false);  
  registryList.add(obj1);  
  registryList.add(obj2);  
  registryList.add(obj3);  
  registryList.add(obj4);  
  registryList.add(obj5);  
    
    
  SignupProcessThread thread1=new SignupProcessThread();  
  SignupProcessThread thread2=new SignupProcessThread();  
  SignupProcessThread thread3=new SignupProcessThread();  
  SignupProcessThread thread4=new SignupProcessThread();  
  SignupProcessThread thread5=new SignupProcessThread();  
    
  thread1.start();  
  thread2.start();  
  thread3.start();  
  thread4.start();  
  thread5.start();  
 }  
   
 public static synchronized RegistryBean getRegistryRequest(String name){  
    
  for(int i=0;i<registryList.size();i++){  
   if(!((RegistryBean)registryList.get(i)).isStatus()){  
    System.out.println(name+" : thread name Got the object " +  
      "with reg num : "+((RegistryBean)registryList.get(i)).getRegNo()+" " +  
        "and Status : "+((RegistryBean)registryList.get(i)).isStatus());  
      
    for(int j=0;j<50000;j++){}  
      
    ((RegistryBean)registryList.get(i)).setStatus(true);  
    return  (RegistryBean)registryList.get(i);  
   }     
  }  
  return null;  
 }  
}  