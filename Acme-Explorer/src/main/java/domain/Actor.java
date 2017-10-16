
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Actor extends DomainEntity {

	private String						name;
	private String						surname;
	private String						email;
	private String						phone;
	private String						address;
	private Collection<SocialIdentity>	socialIdentity;
	private Collection<Folder>			folder;
	private Collection<Message>			message;


	public Actor() {
		super();
	}

	@NotBlank
	public String getName() {
		return this.name;
	}
	@NotBlank
	public String getSurname() {
		return this.surname;
	}
	@NotBlank
	@Email
	public String getEmail() {
		return this.email;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getAddress() {
		return this.address;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public void setSurname(final String surname) {
		this.surname = surname;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	/*
	 * @Pattern(regexp = "^([+-]\\d+\\s+)?(\\([0-9]+\\)\\s+)?([\\d\\w\\s-]+)$")
	 */
	public void setPhone(final String phone) {
		this.phone = phone;
	}
	public void setAddress(final String address) {
		this.address = address;
	}

	public Collection<SocialIdentity> getSocialIdentity() {
		return this.socialIdentity;
	}

	public void setSocialIdentity(final Collection<SocialIdentity> socialIdentity) {
		this.socialIdentity = socialIdentity;
	}

	public Collection<Folder> getFolder() {
		return this.folder;
	}

	public void setFolder(final Collection<Folder> folder) {
		this.folder = folder;
	}

	public Collection<Message> getMessage() {
		return this.message;
	}

	public void setMessage(final Collection<Message> message) {
		this.message = message;
	}
}
