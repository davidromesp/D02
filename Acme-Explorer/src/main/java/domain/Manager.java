
package domain;

import java.util.Collection;

public class Manager extends Actor {

	public Collection<Trip>	trips;


	public Manager() {
		super();
	}

	public Collection<Trip> getTrips() {
		return this.trips;
	}
	public void setTrips(final Collection<Trip> trips) {
		this.trips = trips;
	}
}
