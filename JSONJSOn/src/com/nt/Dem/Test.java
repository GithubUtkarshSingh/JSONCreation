package com.nt.Dem;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		Demo d=new Demo();
		d.setAdd("HYD");
		d.setId(20);
		d.setNamel("UtkarshSingh");
		d.setNumber(63);
		ObjectMapper om=new ObjectMapper();
		String js=om.writeValueAsString(d);
		System.out.println(js);

	}

}
