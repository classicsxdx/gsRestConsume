/*Spring RESTful tutorial from Spring docs
 * This creates an application that consumes a RESTful Web Service
 * In this case, Facebook graph API (http://graph.facebook.com/gopivotal)
http://spring.io/guides/gs/consuming-rest/

	Jan 14, 2014*/

package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;	

/*It’s annotated with @JsonIgnoreProperties from the Jackson 
JSON processing library to indicate that any properties not 
bound in this type should be ignored.*/

@JsonIgnoreProperties(ignoreUnknown=true)
public class Page {
	
	private String name;
	private String about;
	private String phone;
	private String website;
	private String likes;
	
	public String getName() {
		return name;
	}
	public String getAbout() {
		return about;
	}
	public String getPhone() {
		return phone;
	}
	public String getWebsite() {
		return website;
	}
	public String getLikes() {
		return likes;
	}
		

}
