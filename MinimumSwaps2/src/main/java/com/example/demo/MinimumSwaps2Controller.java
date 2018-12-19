package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinimumSwaps2Controller {

	//http://localhost:8091/?arr=1,3,2,4
	@RequestMapping
    static int minimumSwaps(@RequestParam("arr") int[] arr) {
		return Solution.minimumSwaps(arr);
    	
    }

}
