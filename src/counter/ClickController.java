package counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the Counter buttons user interface.
 * @author jim
 *
 */
public class ClickController {
	@FXML
	private Button plusbutton;
	@FXML
	private Button minusbutton;
	/** The counter that records button clicks. */
	private Counter counter;

	/**
	 * @param counter the counter to be set.
	 */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	
	/**
	 * Add counter value by 1.
	 * 
	 * @param event
	 */
	public void plusButtonHandler(ActionEvent event) {
		counter.add(1);
	}
	
	/**
	 * Decrease counter value by 1.
	 * 
	 * @param event
	 */
	public void minusButtonHandler(ActionEvent event) {
		counter.add(-1);
	}
}
