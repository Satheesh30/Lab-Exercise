package exerciseLabWork;

import java.util.Scanner;

public class DogException {
	public static void main(String[] args) {
		Dogs tiger=new Dogs();
		Human h=new Human();
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter .. stick/biscuit");
		String item=scan.next();
		h.PlayWithDog(tiger, item);
	}
	
}
class DogExceptions extends Exception{
	
}
class DogBit extends DogExceptions{
	String msg;
	public DogBit(String msg) {
		this.msg=msg;
		}
	
	public String toString() {
		return "Exception is "+msg;
	}
}
class DogHappy extends DogExceptions{
	String msg;
	public DogHappy(String msg) {
		
		this.msg=msg;
	}
	public String toString() {
		return "Exception is  "+msg;
	}
}
class Dogs{
	public void play(String item)throws DogBit,DogHappy{
		//item.equals("stick");
		try {
		throw new  DogBit("You beat I bite.....");
		
		}catch(DogBit e) {
			item.equals("stick") ;
			
			}
		//}catch (DogHappy h) {
			
		//}
			
		//item.equals("biscuit");
		//throw new DogHappy("I love biscuits...."); 
			
		
	}
}
class Human{
	public void PlayWithDog(Dogs tiger,String item) {
		try {
			tiger.play(item);
		}catch(DogBit bt) {
			System.out.println(bt);
		}
		catch(DogHappy hy) {
			System.out.println(hy);
		}
	}
}