package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CrmSteps {
	
	@Given("user is logged in")
	public void user_is_logged_in() {
	    System.out.println("User is logged in");
	}
	
	@When("user create new tasks")
	public void user_create_new_tasks() {
		System.out.println("User created new tasks");
	}
	
	@When("user view task details")
	public void user_view_task_details() {
		System.out.println("User viewed the task details");
	}
	
	@When("user deletes a task")
	public void user_deletes_a_task() {
		System.out.println("User deleted the tasks");
	}
	
	@When("user create new contact")
	public void user_create_new_contact() {
		System.out.println("User created new contacts");
	}

	@When("user view contact details")
	public void user_view_contact_details() {
		System.out.println("User viewed the contact details");
	}
	
	@When("user deletes a contact")
	public void user_deletes_a_contact() {
		System.out.println("User deleted the contact");
	}
	
	@When("user create new deals")
	public void user_create_new_deals() {
		System.out.println("User created new deals");
	}
	
	@When("user view deals details")
	public void user_view_deals_details() {
		System.out.println("User viewed deal deatils");
	}
	
	@When("user deletes a deal")
	public void user_deletes_a_deal() {
		System.out.println("User deleted some deals");
	}

	
}
