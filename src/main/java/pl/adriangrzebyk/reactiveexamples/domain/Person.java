package pl.adriangrzebyk.reactiveexamples.domain;

public class Person {
	private Integer id;
	private String firstName;
	private String lastName;

	public Person() {
	}

	public Person(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
