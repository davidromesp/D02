
package domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class PersonalRecord {

	private String	name;
	private String	photo;
	private String	email;
	private String	phone;
	private String	linkedInLink;


	@NotBlank
	public String getName() {
		return this.name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	@NotBlank
	@URL
	public String getPhoto() {
		return this.photo;
	}
	public void setPhoto(final String photo) {
		this.photo = photo;
	}
	@NotBlank
	@Email
	public String getEmail() {
		return this.email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	@NotBlank
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(final String phone) {
		this.phone = phone;
	}
	@NotBlank
	@URL
	public String getLinkedInLink() {
		return this.linkedInLink;
	}
	public void setLinkedInLink(final String linkedInLink) {
		this.linkedInLink = linkedInLink;
	}
}
