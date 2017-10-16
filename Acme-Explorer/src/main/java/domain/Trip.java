
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Trip {

	private String						ticker;
	private String						title;
	private String						description;
	private Double						price;
	private String						requirement;
	private Date						publicationDate;
	private Date						startMoment;
	private Date						endMoment;
	private Boolean						cancelled;
	private String						reason;
	private LegalText					legalText;
	private Category					category;
	private Collection<Tag>				tag;
	private Collection<SurvivalClass>	survivalClass;
	private Collection<Stage>			stage;
	private Collection<Story>			story;
	private Collection<Audit>			audit;
	private Collection<Note>			note;


	@NotBlank
	@Column(unique = true)
	public String getTicker() {
		return this.ticker;
	}
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}
	public void setDescription(final String description) {
		this.description = description;
	}
	@Min(0)
	public Double getPrice() {
		return this.price;
	}
	public void setPrice(final Double price) {
		this.price = price;
	}
	public String getRequirement() {
		return this.requirement;
	}
	public void setRequirement(final String requirement) {
		this.requirement = requirement;
	}
	@Past
	public Date getPublicationDate() {
		return this.publicationDate;
	}
	public void setPublicationDate(final Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public Date getStartMoment() {
		return this.startMoment;
	}
	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}
	public Date getEndMoment() {
		return this.endMoment;
	}
	public void setEndMoment(final Date endMoment) {
		this.endMoment = endMoment;
	}
	public Boolean getCancelled() {
		return this.cancelled;
	}
	public void setCancelled(final Boolean cancelled) {
		this.cancelled = cancelled;
	}
	public String getReason() {
		return this.reason;
	}
	public void setReason(final String reason) {
		this.reason = reason;
	}
	public LegalText getLegalText() {
		return this.legalText;
	}

	public void setLegalText(final LegalText legalText) {
		this.legalText = legalText;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}

	public Collection<Tag> getTag() {
		return this.tag;
	}

	public void setTag(final Collection<Tag> tag) {
		this.tag = tag;
	}

	public Collection<SurvivalClass> getSurvivalClass() {
		return this.survivalClass;
	}

	public void setSurvivalClass(final Collection<SurvivalClass> survivalClass) {
		this.survivalClass = survivalClass;
	}

	public Collection<Stage> getStage() {
		return this.stage;
	}

	public void setStage(final Collection<Stage> stage) {
		this.stage = stage;
	}

	public Collection<Story> getStory() {
		return this.story;
	}

	public void setStory(final Collection<Story> story) {
		this.story = story;
	}

	public Collection<Audit> getAudit() {
		return this.audit;
	}

	public void setAudit(final Collection<Audit> audit) {
		this.audit = audit;
	}

	public Collection<Note> getNote() {
		return this.note;
	}

	public void setNote(final Collection<Note> note) {
		this.note = note;
	}

}