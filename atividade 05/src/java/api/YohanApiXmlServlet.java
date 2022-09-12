/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "YohanApiXmlServlet", urlPatterns = {"/yohan-dados.xml"})
public class YohanApiXmlServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ra="1290482112006",nome="Yohan Gabriel Eduardo Queiroz dos Santos Ferreira Aquino";
        String[] disciplina = new String[]{"Banco de dados", "Engenharia de Software III", "Programação Orientada a Objetos"
                , "Linguagem de programação","Sistemas Operacionais II",
            "Ingles IV","Metodologia da Pesquisa Cientifico-Tecnologia"};
        
            response.setContentType("application/xml;charset=UTF-8");
    response.getWriter().println("<?xml version='1.0'"
            + " encoding='UTF-8'?>");
    response.getWriter().println("<server>");
    response.getWriter().println("<aluno>"
            + "<ra>RA:"+ra+" </ra>"
            + "<nome>Nome: "+nome+"</nome>");
    response.getWriter().println("<disciplina>Lista de disciplinas matriculadas:");
    for(int i=0;i<disciplina.length;i++)
    {
    response.getWriter().println(disciplina[i]);
    }
    response.getWriter().println("</disciplina>");
    response.getWriter().println("</aluno>");
    response.getWriter().println("</server>");
    }

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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
