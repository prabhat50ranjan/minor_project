/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import junit.extensions.TestSetup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.learning.TrainingSet;



/**
 *
 * @author RIDHHI
 */
@WebServlet(urlPatterns = {"/predection"})
public class Predection extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
                 String context = getServletConfig().getServletContext().getRealPath("/");
            String filePath = context + "upload";
           File f=new File(filePath+"//myann1.nnet");
            System.out.println("fpath="+f.getAbsolutePath());
        double d1 = 0, d2 = 0, d3 = 0, d4 = 0,d5=0;
        Document doc = Jsoup.connect("https://www.google.co.in/search?q=dow+jones+industrial+average+stock+quotes&oq=dow+jones+INDUSTRIAL+stock+quotes&gs_l=serp.3.0.0i7i30k1.2170492.2182680.0.2184679.24.18.0.0.0.0.267.2550.0j13j2.15.0....0...1c.1.64.serp..9.15.2540...0j0i13k1j0i13i5i30k1j35i39k1j0i67k1j0i30k1j0i8i30k1.9DBIvAvJWgU").get();
        Elements elems = doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
        for (Element e : elems) {

            d4 = Double.parseDouble(e.text().replace(",", ""));
            System.out.println(e.text());
        }
        elems = doc.select("#fac-ut > div.vk_c.card-section.fac-lstng > div:nth-child(5) > table > tbody > tr:nth-child(1) > td._Sl > div");
        for (Element e : elems) {
            d1 = Double.parseDouble(e.text().replace(",", ""));
            System.out.println(e.text());
        }
        elems = doc.select("#fac-ut > div.vk_c.card-section.fac-lstng > div:nth-child(5) > table > tbody > tr:nth-child(2) > td._Sl > div");

        for (Element e : elems) {
            d2 = Double.parseDouble(e.text().replace(",", ""));
            System.out.println(e.text());
        }
        elems = doc.select("#fac-ut > div.vk_c.card-section.fac-lstng > div:nth-child(5) > table > tbody > tr:nth-child(3) > td._Sl > div");

        for (Element e : elems) {
            d3 = Double.parseDouble(e.text().replace(",", ""));
            System.out.println(e.text());
        }
           
        
 CSVReader reader=new CSVReader();
            TrainingSet trainingSet= reader.loadCSVFile("dowjones.csv");
            NeuralNetwork initializeANN= reader.initializeANN(trainingSet);
            TrainingSet trainingSet1  =reader.createTestSet(d1, d2, d3, d4);
           double output= reader.getOutput(initializeANN, trainingSet1);
            out.print("Predicted Value="+output);
        } finally {
            out.close();
        }
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
