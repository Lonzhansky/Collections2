package lesson26._02.solid.demos._4_interface_segregation.good;

public class Desktop implements UINonTouch {

	public void mouseover(String event) {
		System.out.println("Mouse click Event Fired");
	}

	public void validate() {
		System.out.println("All UI events are valid");
	}
}
