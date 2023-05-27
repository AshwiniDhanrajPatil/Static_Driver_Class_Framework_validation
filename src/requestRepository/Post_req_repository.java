package requestRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import commonFunction.Utility_Common_Functions;

public class Post_req_repository {
	public static String base_URI()
	{
		String baseURI="https://reqres.in/";
		return baseURI;
		
	}

public static String post_resource()
{
	String resource="api/users";
	return resource;
}
	
public static String post_req_tc1() throws IOException 
{
	ArrayList<String> data=Utility_Common_Functions.readDataExcel("Post_Test_Data","Post_TC_1");//"post_data","Post_TC_1"
	String req_name=data.get(1);
	String req_job=data.get(2);
	String requestBody="{\r\n"
			+ "    \"name\": \""+req_name+"\",\r\n"
			+ "    \"job\": \""+req_job+"\"\r\n"
			+ "}";
	return requestBody;
}
}
