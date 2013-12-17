/**
 * 
 */
package com.vcjain.perf;

/**
 * @author vcjain
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestProfiler
{
  @Autowired
  PerformanceTester performanceTester;
  
  private static ApplicationContext ctx;

  public static void main(String[] args) throws Exception
  {
    ctx = new ClassPathXmlApplicationContext("ProfileConfig.xml");
    TestProfiler tp = ctx.getBean(TestProfiler.class);
    for (int i = 0; i < 10; i++) {
      tp.performanceTester.profileTest(i+"");
    }
  }
}