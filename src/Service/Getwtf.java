package Service;

//
///public class Getwtf {
///}
//
//


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Model.PersonBaseModel;
import Model.ReportDAO;

@WebServlet("/Getwtf")
public class Getwtf extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
			ReportDAO vamos = new ReportDAO();
			URL url = new URL("http://demo6023489.mockable.io/covid/1/passengers");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String output, json = "";
			
			while((output = br.readLine()) != null) {
				json += output;
			}
			
			Gson gson = new Gson();
			PersonBaseModel persons = gson.fromJson(json, PersonBaseModel.class);
			System.out.println(json);
			System.out.println(persons.getPersons());
			request.setAttribute("persons", persons.getPersons());
			
			request.getRequestDispatcher("NewFile.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}





