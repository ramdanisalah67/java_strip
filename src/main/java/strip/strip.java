package strip;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;

public class strip {

	public static void main(String[] args) throws StripeException {
		System.out.println("welcome to strip");

		Stripe.apiKey ="sk_test_51NDphaKqgASWsXIBpqkT7lQEYpO88IjzPMtkqyuFIKb351lbVckUU6dG17VirbEe25sPvpivp9QWuZOnTqA0GZkb008QiXaVBM";
		//create a customer
		/*	Map <String,Object> customerParameter =new HashMap<String, Object>();
		 customerParameter.put("email", "c@gmail.com");
		 Customer c = Customer.create(customerParameter) ;
		 */
		//retrieve a customer
		 Customer c = Customer.retrieve("cus_NzpQpNKnBzYlsb") ;
		// System.out.println(c);
		 //convert result to json format
		 
	}

}
