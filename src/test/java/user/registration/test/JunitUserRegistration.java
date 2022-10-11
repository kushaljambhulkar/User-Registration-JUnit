package user.registration.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;

class JunitUserRegistration {

	JunitUserRegistration junitUserRegistration = new JunitUserRegistration();
	//JUnit Test to validate the User entry for First Name, Last Name,Email, Mobile, and Password.
		@Test
		public void givenFirstNameIsProperReturnTrue() {
			boolean actualResult = junitUserRegistration.isValidFirstName("Kushcool");
			Assertions.assertEquals(true, actualResult);
		}

		private boolean isValidFirstName(String string) {
		// TODO Auto-generated method stub
		return false;
	}

		@Test
		public void givenFirstNameIsProperReturnFalse() {
			boolean actualResult = junitUserRegistration.isValidFirstName("kushcool");
			Assertions.assertEquals(false, actualResult);
		}

		@Test
		public void givenLastNameIsProperReturnTrue() {
			boolean actualResult = junitUserRegistration.isValidLastName("Cool");
			Assertions.assertEquals(true, actualResult);

		}

		@Test
		public void givenlastNameIsProperReturnFalse() {
			boolean actualResult = junitUserRegistration.isValidLastName("cool");
			Assertions.assertEquals(false, actualResult);
		}
		@Test
		public void givenemailIdIsProperReturnTrue() {
			boolean actualResult = junitUserRegistration.isValidEmail("abc.xyz@bl.co.in");
			Assertions.assertEquals(true, actualResult);
		}
		@Test
		public void givenemailIdIsProperReturnFalse() {
			boolean actualResult = junitUserRegistration.isValidEmail("abc.xyzbl");
			Assertions.assertEquals(false, actualResult);
		}
		@Test
		public void givenmobileNumberProperReturnTrue() {
			boolean actualResult = junitUserRegistration.isValidMobileNumber("+91 8999714817");
			Assertions.assertEquals(true, actualResult);
		}
		@Test
		public void givenmobileNumberProperReturnFalse() {
			boolean actualResult = junitUserRegistration.isValidMobileNumber("8999714817");
			Assertions.assertEquals(false, actualResult);
		}
		@Test
		public void givenPasswordProperReturnTrue() {
			boolean actualResult = junitUserRegistration.isValidPassword("Kushcool@999");
			Assertions.assertEquals(true, actualResult);
		}
		@Test
		public void givenPasswordProperReturnFalse() {
			boolean actualResult = junitUserRegistration.isValidPassword("kcool@987654");
			Assertions.assertEquals(false, actualResult);
		}
		String emailId;
		 Boolean expectedResult;
		 JunitUserRegistration JunitUserRegistration;

		@Before
		public void initialize() {
			JunitUserRegistration = new JunitUserRegistration();
		}

		public void JunitUserRegistrationTest(String emailId, Boolean expectedResult) {
			this.emailId = emailId;
			this.expectedResult = expectedResult;
		}
	//Parameterized Test to validate multiple entry for the Email Address.
		@Parameterized.Parameters
			   public static Collection emailId() {
			      return Arrays.asList(new Object[][] {
			         {"abc.xyz@bl.co.in", true},
			         {"abc-100@yahoo.com", true},
			         {"abc.100@yahoo.com", true},
			         {"abc111@abc.com", true},
			         {"xyz",false}
			      });
			   }

		@Test
		public void isemailIdProperReturnTrue() {
			  System.out.println("email id is : " + emailId);
		      Assertions.assertEquals(expectedResult, JunitUserRegistration.isValidUserEmail(emailId));

		}

		private Object isValidUserEmail(String emailId2) {
			// TODO Auto-generated method stub
			return null;
		}
}
