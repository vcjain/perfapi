/**
 * 
 */
package com.vcjain.perf;


import java.util.Random;

import org.perf4j.aop.Profiled;
import org.springframework.stereotype.Component;

/**
 * @author vcjain
 *
 */
@Component
public class PerformanceTester {

       
    @Profiled
    public void profileTest(String name) {
        try {
			long sleepinterval = Math.round((Math.random()*(1000)));
			System.out.println("Sleep interval for Thread "+name+"is "+sleepinterval);
          Thread.sleep(sleepinterval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
}