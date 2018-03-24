package simPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Object;
import java.io.FileOutputStream;
import java.util.SortedMap;
import java.net.*;


public class SimbirSoft  {

	public static final String PATH_TO_PROPERTIES = "java.properties";
			
		 public static void main(String[] args) {


		FileInputStream fileInputStream;
		
		Properties prop = new Properties();
	
		try {

			fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
		       prop.load(new InputStreamReader(fileInputStream, "UTF-8"));
		
			String DOB = prop.getProperty("DOB");
			String FIO = prop.getProperty("FIO");
			String email = prop.getProperty("email");
			String mobile_phone = prop.getProperty("mobile_phone");
			String skype = prop.getProperty("skype");
			String education = prop.getProperty("education");
			String target = prop.getProperty("target");
			String avatar = prop.getProperty("avatar");

			PrintWriter writer = new PrintWriter("index.html", "UTF-8");

			int br;
			writer.println("<meta charset=\"UTF-8\"> <link rel=\"stylesheet\" href=\\\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\\\"> " +
					"<style>" +
                    " .layer1 {\n" +
                    "    float: left; /* ��������� �� ������� ���� */\n" +
                    "    padding: 10px; /* ���� ������ ������ */\n" +
                    "    margin-right: 20px; /* ������ ������ */\n" +
                    "    width: 40%; /* ������ ����� */\n" +
                    "   }" +
                    " .rightpic{\n"+
                    " padding-top: 20px; \n" +
                    " width: 200px; \n" +
                    " height: 200px \n" +
                    "}"+
                    "</style>" +
					 "<body>" + 
					    "<center><b><h4>������</h4></b><br> �� ���������: java - ������ <br></center>"+
					
					                   "  <div class=\"layer1\">\n" +
					                   " <b>���: </b>" + FIO +
					                    "<b><br>���� ��������: </b>" + DOB +
					                    "<b><br>e-mail: </b>" + email +
					                    "<b><br>�������: </b>" + mobile_phone +
					                    "<b><br>Skype: </b>" + skype +
					                    "\n" +
					                    "  </div>\n" +
					                    "  <div>\n" +
					                    "   <img class=\"rightpic\"  src=\"" + avatar + "\"></p><br>" +
					                    "  </div>\n" +
					                    "<div class = \"layer1\">\n" +
					                    " <br><h3><b>����: </b></h3>" + target +
					                    " <br><h3><b>�����������: </b></h3>" + education +
					                    "</div>" +
					                    " </body>"
										
			);// html page.

			writer.close();

		} catch (IOException e) {
			System.out.println("������ � �����"+ PATH_TO_PROPERTIES);
				e.printStackTrace();

		}
	}
		 
}

