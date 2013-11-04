package processes;

/**
 * @author Suslenko Alexandr
 */
public class DoingStuff {

	public static void main(String[] args) {
		BoilingWater p = new BoilingWater(0.1f, 85, 1);
		p.boilWater();
		HeatingBeef process = new HeatingBeef(0.1f, 10, 2000);
		process.heatUpBeef(3);
		System.out.println("Processes are over");
	}
}
