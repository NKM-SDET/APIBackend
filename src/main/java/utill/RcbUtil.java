package utill;

import io.restassured.path.json.JsonPath;

public class RcbUtil {
	public static JsonPath rawToJson(String res)
	{
		JsonPath js=new JsonPath(res);
		return js;
	}

}
