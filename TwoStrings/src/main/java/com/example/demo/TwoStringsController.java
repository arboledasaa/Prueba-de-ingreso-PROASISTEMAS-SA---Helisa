package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoStringsController {

	//http://localhost:8090/twoStrings?s1=hola&s2=mundo
	@RequestMapping("/twoStrings")
    static String twoStrings(@RequestParam("s1") String s1,@RequestParam("s2") String s2) {
    	return Solution.twoStrings(s1, s2);
    }
}
