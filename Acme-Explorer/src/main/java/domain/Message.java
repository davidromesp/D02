
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Message extends DomainEntity {

	private Date	sendMoment;
	private String	subject;
	private String	body;
	private String	priority;


	@Past
	public Date getSendMoment() {
		return this.sendMoment;
	}
	public void setSendMoment(final Date sendMoment) {
		this.sendMoment = sendMoment;
	}
	@NotBlank
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(final String subject) {
		this.subject = subject;
	}
	@NotBlank
	public String getBody() {
		return this.body;
	}
	public void setBody(final String body) {
		this.body = body;
	}
	@Pattern(regexp = "^HIGH|NEUTRAL|LOW$")
	public String getPriority() {
		return this.priority;
	}
	public void setPriority(final String priority) {
		this.priority = priority;
	}

}
