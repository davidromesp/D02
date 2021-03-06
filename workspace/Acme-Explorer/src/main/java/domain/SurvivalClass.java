
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class SurvivalClass extends DomainEntity {

	private String	title;
	private String	description;
	private Date	momentOrganized;


	@NotBlank
	@NotNull
	@SafeHtml(whitelistType = WhiteListType.NONE)
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	@NotNull
	@SafeHtml(whitelistType = WhiteListType.NONE)
	public String getDescription() {
		return this.description;
	}
	public void setDescription(final String description) {
		this.description = description;

	}

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@NotNull
	public Date getMomentOrganized() {
		return this.momentOrganized;
	}

	public void setMomentOrganized(final Date momentOrganized) {
		this.momentOrganized = momentOrganized;
	}


	// Relationship

	private Location	location;


	@Valid
	// TODO: Relationship pattern	
	public Location getLocation() {
		return this.location;
	}
	public void setLocation(final Location location) {
		this.location = location;
	}

}
