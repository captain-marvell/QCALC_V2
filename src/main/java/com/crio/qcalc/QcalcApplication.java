package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// StandardCalculator calc = new StandardCalculator();
		// int result = calc.add(1, 1);
		// System.out.println(result);

		// // SpringApplication.run(QcalcApplication.class, args);
		// System.out.println("Hello world!");

		// System.out.println("Starting QCalc..");

		// StandardCalculator calc = new StandardCalculator();
 
		// calc.add(1, 2);
 
		// System.out.println(calc.getResult());

		
LogicCalculator calc = new LogicCalculator();

extracted(calc);

calc.printResult();


	
	}

	private static void extracted(LogicCalculator calc) {
		calc.OR(8, 7);
	}

}
