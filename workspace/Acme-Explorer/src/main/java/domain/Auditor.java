
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Auditor extends Actor {

	// Relationships
	private Collection<Note>	notes;
	private Collection<Audit>	audits;


	@Valid
	// TODO: Relationship pattern
	public Collection<Note> getNotes() {
		return this.notes;
	}
	public void setNotes(final Collection<Note> notes) {
		this.notes = notes;
	}

	@Valid
	// TODO: Relationship pattern
	public Collection<Audit> getAudits() {
		return this.audits;
	}
	public void setAudits(final Collection<Audit> audits) {
		this.audits = audits;
	}

}
