/**
 * Created by Nikos on 6/27/2017.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class readForm extends HttpServlet {

        // GET method request.
        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            Boolean flag = false;

            PrintWriter outputStream = null;
            try {
                outputStream = new PrintWriter(new FileWriter("surveyData.csv",true));

                String l =  request.getParameter("name") + "," + request.getParameter("sirname") + "," +
                            request.getParameter("e_mail") + "," + request.getParameter("gender") + "," +
                            request.getParameter("satisfaction_level") + "," + request.getParameter("recommend") + "," +
                            request.getParameter("future_use") + "," + request.getParameter("use_length") + "," +
                            request.getParameter("use_frequency");
                outputStream.println(l);
                flag = true;
            }
            finally {
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            response.setContentType("text/html");

            PrintWriter out = response.getWriter();

            String docType = "<!DOCTYPE html>\n";

            if(flag == true) {
                out.println(docType + "<html>\n" +
                        "<head><title>" + "Form Reader" + "</title></head>\n" +
                        "<body align=\"center\">\n" +
                        "<h2>" + "Form Succesfully Read" + "</h2>\n" +
                        "<p>" + "Thank you for your participation." + "</p>\n" +
                        "<p><input type=\"button\" value=\"Close this window\" onclick=\"self.close()\"</p>"+
                        "</body></html>");
            }
            else {
                out.println(docType + "<html>\n" +
                        "<head><title>" + "Form Reader" + "</title></head>\n" +
                        "<body align=\"center\">\n" +
                        "<h2>" + "Something went wrong..." + "</h2>\n" +
                        "<p>" + "No data written to file" + "</p>\n" +
                        "<p><input type=\"button\" value=\"Close this window\" onclick=\"self.close()\"</p>>"+
                        "</body></html>");
            }
        }
        //POST method request.
        public void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            doGet(request, response);
        }
    }

