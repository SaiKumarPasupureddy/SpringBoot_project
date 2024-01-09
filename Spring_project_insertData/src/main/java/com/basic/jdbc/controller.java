package com.basic.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	code c;
	@PostMapping("/i-D")
	Map<String,String> insertdata(@RequestBody pojo obj){
		Map<String,String> hm=new HashMap<>();
		int i=c.insertData(obj);
		try {
			if(i>0)
				hm.put("1","Success");
			else
				hm.put("2","fail");
		}
		catch(Exception e) {
			hm.put("3",e.toString());
		}
		return hm;
	}
}
