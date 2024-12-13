package lesson26._02.solid.demos._4_interface_segregation.good;

public interface UITouch extends UIComponent {
	void touch(String event);
	void swipe(String event);
}
