package main;

import classes.Nota;

public class App {

	public static void main(String[] args) {
		Nota med = new Nota();
		
		med.setNum1(5);
		med.setNum2(5);
		med.setNum3(7);
		med.setNum4(10);
		med.setMedia();

		System.out.println("-------- NOTAS --------\n"
						 + "- Nota 1: " + med.getNum1() + "           -\n"
						 + "- Nota 2: " + med.getNum2() + "           -\n"
						 + "- Nota 3: " + med.getNum3() + "           -\n"
						 + "- Nota 4: " + med.getNum4() + "          -\n"
						 + "-" + med.getMedia() + "          -\n"
						 + "-----------------------");
		

	}

}
