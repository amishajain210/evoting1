/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DataCon;

/**
 *
 * @author amisha
 */
public class Update 
{
    int r=0;
    public void updateData()
    {
        DataCon d=new DataCon();
        try
        {
        r=d.getStatement().executeUpdate("update nominees set appeal='not set';");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        if(r>0)
            System.out.println(r);
    }
    
}
    

