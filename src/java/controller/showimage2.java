/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DataCon;

/**
 *
 * @author amisha
 */
public class showimage2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       //response.setContentType("text/html");  
        //PrintWriter out = response.getWriter();
       System.out.println("welcomee");
        Blob image = null;
       byte[] imgData = null;
       System.out.println("welcome to image");
       String r= request.getParameter("image");
       System.out.println(r);
       String query="select photo from nominees where roll ='"+r+"';";
     DataCon d=new DataCon();
        try {
            ResultSet rs= d.getStatement().executeQuery(query);
            if(rs!=null)
            {
            while(rs.next())
            {
                
            image = rs.getBlob("photo");
 imgData = image.getBytes(1, (int) image.length());
 response.setContentType("image/gif");
 // OutputStream o ;
  response.getOutputStream().write(imgData);
            }
            }
            
        } catch (SQLException ex) {
         
            Logger.getLogger(showimage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    

