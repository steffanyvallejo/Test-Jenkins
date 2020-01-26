package cucumber;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Suma.Suma;
import cucumber.api.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class Steps {
	private int result;
	private Suma suma;

	
	@Given("I have a suma with {int} and {int}")
	    public void i_have_a_suma_with(Integer a, Integer b) throws Throwable {
	        suma = new Suma(a,b);
	    }
	 
	    @When("I add")
	    public void i_add() throws Throwable {
	        result = suma.calcular();
	    }
	 
	    @Then("the result is {int}")
	    public void the_result_is(Integer resultado)  {
	       assertEquals(resultado.intValue(),result ,0);
	    }


}
