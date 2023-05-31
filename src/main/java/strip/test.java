package strip;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;

public class test {

	public static void main(String[] args) throws StripeException {
		// TODO Auto-generated method stub
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
		 Gson json = new GsonBuilder().setPrettyPrinting().create();
		 System.out.println(json.toJson(c));
	}

}
