package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
	@Before("@sanity or @functional")
	public void preCondition()
	{
		System.out.println("Hook for @sanity");
	}
	 
	@After("@regression")
	public void postCondition()
	{
		System.out.println("Hook for @regression");
	}
	
	
	
//	
//	@Before (order=1)
//	public void beforeHook () {
//		
//		System.out.println("Before hooked 1");
//	}
//	
//	@BeforeStep(order =1)
//		public void beforesteped() {
//		System.out.println("Before steped 1");
//	}
//	
//	@After(order=1)
//	public void afterHook () {
//		
//		System.out.println("After hooked 1");
//
//	}
//	
//	@BeforeStep(order =2)
//	public void beforesteped1() {
//	System.out.println("Before steped 2");
//}
//
//	
//	@Before (order=-1)
//	public void beforeHook2 () {
//		
//		System.out.println("Before hooked 3");
//	}
//	
//	
//	@After(order=-2)
//	public void afterHook2 () {
//		
//		System.out.println("Afer hooked 3");
//
//	}
//	
//	@AfterStep (order =1)
//	public void afterstped()
//	{
//		
//		System.out.println("After steped 1");
//	}
//	
//	@Before(order=2)
//	public void beforeHook1()
//	{
//		System.out.println("before hooked 2");
//	}
//
//	
//  @After(order=2)
//  public void afterHook1()
//  {
//	  
//	  System.out.println("After hooked 2");
//  }
//  
//  @AfterStep(order=2)
//	public void afterstped1()
//	{
//		
//		System.out.println("After steped 2");
//	}
}
