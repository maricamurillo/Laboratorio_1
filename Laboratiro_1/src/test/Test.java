package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Pickup;
import carros.Sedan;
import motores.MotorGasolina;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorGasolina motorGasolina = new MotorGasolina();//composicion
		
		//inyectando una instancia de motor gasolina al carro sedan
		//esto lo permite el polimorfismo
		
		CarroBase carro = new Pickup(motorGasolina);//polimorfismo
		carro.imprimirCategoria();
		
		CarroBase carro1 = new Sedan(motorGasolina);//polimorfismo
		carro1.imprimirCategoria();
		
		CarroBase carro2= new Crossover(motorGasolina);//polimorfismo
		carro2.imprimirCategoria();
		
		
	}

}
