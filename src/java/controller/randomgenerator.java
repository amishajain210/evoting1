/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author amisha
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 import java.util.concurrent.ThreadLocalRandom;
import model.DataCon;

public class randomgenerator {
   static int r;
	public static int random() {
		int randomInt = ThreadLocalRandom.current().nextInt(1000, 9999);
		return randomInt;
	}
        public static int datacheck() throws SQLException
        {
           DataCon d=new DataCon();
        
      ResultSet rs=d.getStatement().executeQuery("select * from student1;");
     
       
        
     if(rs!=null)
     {
       //result=r;
         r=1;
       System.out.println("successful");
     }
            return r;
        }    
}

