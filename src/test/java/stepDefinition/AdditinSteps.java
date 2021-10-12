package stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditinSteps {
	 int a,b,c;

		@Given("I have two variables {string} & {string}")
		public void i_have_two_variables(String num1, String num2) {
		    
		    a=Integer.parseInt(num1);
		    b=Integer.parseInt(num2);
		}
		@Given("I have two variables as below")
			public void i_have_two_variables_as_below(List<String> num) {
				a=Integer.parseInt(num.get(0));
				b=Integer.parseInt(num.get(1));
		}
		@Given("I have two variables as Map")
				public void i_have_two_variables_as_map(io.cucumber.datatable.DataTable dataTable) {
				Map<String,String> data=dataTable.asMap(String.class, String.class);
				 a=Integer.parseInt(data.get("num1"));  
				 b=Integer.parseInt(data.get("num2")); 
	    }
     @When("I do addition")
		public void i_do_addition() {
			c=a+b;
		    
		}
		@Then("result should display in Console")
		public void result_should_display_in_console() {
			System.out.println("Addition "    +c);
		    
		}



}