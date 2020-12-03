/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parmacy_management;

import appDt.HomePage;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.store.bll.delegate.StoreGetWay;
/**
 *
 * @author ahmed hamady
 */
public class PARMACY_MANAGEMENT {
// ApplicationContext context = new ClassPathXmlApplicationContext("/com/store/bll/config/bll-spring-context.xml");
   // StoreGetWay getway = context.getBean("getway", StoreGetWay.class);
           
     
      public static void main(String[] args) {
           new HomePage();
     

      }
      
}
