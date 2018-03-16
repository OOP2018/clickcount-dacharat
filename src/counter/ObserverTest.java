package counter;

import java.util.Scanner;

/**
 * Test the Observer behavior for Counter object.
 * 
 * @author Dacharat Pankong
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// 1.create subject (Observable)
		Counter counter = new Counter();
		// 2.Create the observer with reference to subject
		ConsoleView view = new ConsoleView(counter);
		// 3. Add observer to subject
		counter.addObserver(view);
		//Create another observer
		// CounterView view2 = new CounterView(counter);
		// view2.run();
		// 4.run the app.
		while (true) {
			System.out.println("hom much?: ");
			int howmuch = console.nextInt();
			counter.add(howmuch);
		}
	}
}
