/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appDt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Sroor For Laptop
 */
public class Spring {
   ApplicationContext context = new ClassPathXmlApplicationContext("/com/store/bll/config/bll-spring-context.xml");
   
}
