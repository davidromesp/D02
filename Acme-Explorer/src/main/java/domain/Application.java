
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@Entity
@Access(AccessType.PROPERTY)
public class Application extends DomainEntity {

	private Date		momentMade;
	private String		status;
	private String		comment;
	private CreditCard	creditCard;
	private String		reasonDenied;
	private Trip		trip;


	@Past
	public Date getMomentMade() {
		return this.momentMade;
	}

	public void setMomentMade(final Date momentMade) {
		this.momentMade = momentMade;
	}
	@Pattern(regexp = "^PENDING|REJECTED|DUE|ACCEPTED|CANCELLED$")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public String getReasonDenied() {
		return this.reasonDenied;
	}

	public void setReasonDenied(final String reasonDenied) {
		this.reasonDenied = reasonDenied;
	}

	public Trip getTrip() {
		return this.trip;
	}

	public void setTrip(final Trip trip) {
		this.trip = trip;
	}

}
