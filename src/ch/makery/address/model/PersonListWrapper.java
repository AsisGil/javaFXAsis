package ch.makery.address.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "persons")
public class PersonListWrapper {

	private List<Television> persons;

	@XmlElement(name = "person")
	public List<Television> getPersons() {
		return persons;
	}

	public void setPersons(List<Television> persons) {
		this.persons = persons;
	}
}
