
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Note {

	private Date	creationMoment;
	private String	remark;
	private String	response;
	private Date	responseMoment;
	private Trip	trip;


	@Past
	public Date getCreationMoment() {
		return this.creationMoment;
	}
	public void setCreationMoment(final Date creationMoment) {
		this.creationMoment = creationMoment;
	}
	@NotBlank
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(final String remark) {
		this.remark = remark;
	}
	@NotBlank
	public String getResponse() {
		return this.response;
	}
	public void setResponse(final String response) {
		this.response = response;
	}
	public Date getResponseMoment() {
		return this.responseMoment;
	}
	public void setResponseMoment(final Date responseMoment) {
		this.responseMoment = responseMoment;
	}

	public Trip getTrip() {
		return this.trip;
	}

	public void setTrip(final Trip trip) {
		this.trip = trip;
	}
}
