
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Manager extends Actor {

	// Relationship
	public Collection<Trip>	trips;


	@Valid
	// TODO: Relationship pattern
	public Collection<Trip> getTrips() {
		return this.trips;
	}
	public void setTrips(final Collection<Trip> trips) {
		this.trips = trips;
	}
}
