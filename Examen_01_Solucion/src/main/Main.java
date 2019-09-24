package main;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import model.BloodAnalysis;
import model.Person;

/**
 * El sistema medir� la presi�n arterial de una persona.
 * Para ello se realizar�n mediciones periodicas, las cuales estar�n formadas:
 *   - Tensi�n alta (doble o float)
 *   - Tensi�n baja (doble o float)
 *   - Nivel de glucosa (doble o float)
 *   - Fecha de realizaci�n
 *   
 * Para hacer estas mediciones se pide implmentar un sistema de validaci�n de 
 * estos que compruebe las siguientes condiciones:
 *   - No se pueden introducir valores nulos.
 *   - No se deben introducir valores negativos
 *   - El rango de valores permitidos son:
 *   	- Tensi�n alta: [8, 20]
 *   	- Tensi�n baja: [5, 11]
 *   	- Nivel de glucosa: [25, 500]
 *   	- La fecha de realizaci�n no puede ser superior al momento actual.
 *   - La tensi�n baja no puede ser superior a la tensi�n alta.
 *   - La diferencia minima entre dos mediciones es un dia
 * 
 * @author Iv�n Gonz�lez Mahagamage
 *
 */
public class Main {

	public static void main(String[] args) {
		try {
			Person person = new Person();
			person.setBirthDate(new LocalDate(1990, 12, 22));

			BloodAnalysis analysis = new BloodAnalysis();
			analysis.setHigh(11);
			analysis.setLow(10);
			analysis.setSugar(50);
			analysis.setDate(new LocalDateTime());
			person.addBloodAnalysis(analysis);
			person.show();
		} catch (IllegalArgumentException e) {
			System.err.println("Ha ocurrido un error:\n\t-" + e.getMessage());
		}
	}

}
