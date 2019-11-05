
public class Main {

	public static void main(String[] args) {
		Kalkulator kal = new Kalkulator();
        kal.setValue1(7.0);
        kal.setValue2(5.0);

        System.out.printf("VALUE 1 = %.1f%n", kal.getValue1());
        System.out.printf("VALUE 2 = %.1f%n", kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject("This project shown you how to manage method in java");
        System.out.printf("Result Add is = %.1f%n", kal.add(kal.getValue1(), kal.getValue2()));
        System.out.printf("Result Minus is = %.1f%n", kal.minus(kal.getValue1(), kal.getValue2()));
        System.out.printf("Result Multiplication is = %.1f%n", kal.multiplication(kal.getValue1(), kal.getValue2()));
        System.out.printf("Result Division is = %.1f%n", kal.division(kal.getValue1(), kal.getValue2()));
    
	}

}
