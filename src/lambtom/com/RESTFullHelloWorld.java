package lambtom.com;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

@Path("/Hello")
public class RESTFullHelloWorld {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/GetCustomerXML")
	public String GetCustomerXML() {
		return "{\"name\":\"John\"}";
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/GetKeyApplication")
	public String GetKeyApplication(String input) {
		JSONObject obj = new JSONObject(input);
		String value = obj.getString("key");
		if(value.equals("EXOCLOUD")) {
			return "{\"value\":\"12345678\"}";
		}
		else {
			return "{\"value\":\"\"}";
		}
	}
	
}
