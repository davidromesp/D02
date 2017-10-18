
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;

@Entity
@Access(AccessType.PROPERTY)
public class Folder extends DomainEntity {

	// Attributes
	private String	name;
	private boolean	systemFolder;


	@NotBlank
	@NotNull
	@SafeHtml(whitelistType = WhiteListType.NONE)
	public String getName() {
		return this.name;
	}
	public void setName(final String name) {
		this.name = name;
	}

	public boolean getSystemFolder() {
		return this.systemFolder;
	}
	public void setSystemFolder(final boolean systemFolder) {
		this.systemFolder = systemFolder;
	}


	// Relationships
	private Collection<Message>	messages;
	private Collection<Folder>	children;


	@Valid
	// TODO: Relationship pattern
	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

	@Valid
	// TODO: Relationship pattern
	public Collection<Folder> getChildren() {
		return this.children;
	}

	public void setChildren(final Collection<Folder> children) {
		this.children = children;
	}
}
