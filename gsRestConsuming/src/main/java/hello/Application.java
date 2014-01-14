/*Spring RESTful tutorial from Spring docs
 * This creates an application that consumes a RESTful Web Service
 * In this case, Facebook graph API (http://graph.facebook.com/gopivotal)
http://spring.io/guides/gs/consuming-rest/

	Jan 14, 2014*/

package hello;

import org.springframework.web.client.RestTemplate;

public class Application {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Page page = restTemplate.getForObject("http://graph.facebook.com/gopivotal", Page.class);
		
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
        System.out.println("Phone:   " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());
        System.out.println("Likes: " + page.getLikes());
	}

}
