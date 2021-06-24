package exerciseLabWork;
import java.util.Scanner;

public class GoodFan {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	PrintData obj=new PrintData();
	
	while(true) {
		System.out.println("Press a key and enter to pull chain...");
		scan.next();
		obj.pull();
	}
	
	
}
}
class PrintData{
	Fan state=new SwitchOffState();
	public void pull() {
		state.pull(this);
		
		
	}

abstract class Fan{
	public abstract void pull(PrintData fan);
}
class SwitchOffState extends Fan{
	
	public void pull(PrintData fan) {
		System.out.println("switch on state....on");
		fan.state=new SwitchOnState();
	}
	
}
class SwitchOnState extends Fan{
	
	public void pull(PrintData fan) {
		System.out.println("switch on state....medium");
		fan.state=new Medium();
	}
	
}
class Medium extends Fan{
	public void pull(PrintData fan) {
	System.out.println("medium speed state...high");
	fan.state=new High();
	}
}
class High extends Fan{
	public void pull(PrintData fan) {
		System.out.println("high speed state.....off");
		fan.state=new SwitchOffState();
	}
		
}}

