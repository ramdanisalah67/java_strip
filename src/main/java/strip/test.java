package strip;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.Token;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("welcome to strip");
		Stripe.apiKey ="sk_test_51NDphaKqgASWsXIBpqkT7lQEYpO88IjzPMtkqyuFIKb351lbVckUU6dG17VirbEe25sPvpivp9QWuZOnTqA0GZkb008QiXaVBM";
		//create a customer
		/*	Map <String,Object> customerParameter =new HashMap<String, Object>();
		 customerParameter.put("email", "c@gmail.com");
		 Customer c = Customer.create(customerParameter) ;
		 */
		//retrieve a customer
		 Customer c = Customer.retrieve("cus_NzqnpphJWka9ES") ;
		// System.out.println(c);
		 //convert result to json format
		 
		 //add card to customer
	/*	 Map <String,Object> customerCard =new HashMap<String, Object>();
		 customerCard.put("number", "4242424242424242");
		 customerCard.put("exp_month", "11");
		 customerCard.put("exp_year", "2023");
		 customerCard.put("cvc", "123");
		 Map <String,Object> tokenParam =new HashMap<String, Object>();
		 tokenParam.put("card", customerCard);
		 	
		Token token = Token.create(tokenParam);
			
		Map <String,Object> source =new HashMap<String, Object>();
		 source.put("source", token.getId());
		 c.create(source)	;*/
		 
		 Gson json = new GsonBuilder().setPrettyPrinting().create();
		 System.out.println(json.toJson(c));
		 
	}	

}
