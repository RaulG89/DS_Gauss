import org.joda.time.LocalDate;

/**
 * El sistema medirá la presión arterial de una persona.
 * Para ello se realizarán mediciones periodicas, las cuales estar�n formadas:
 *   - Tensión alta (doble o float)
 *   - Tensión baja (doble o float)
 *   - Nivel de glucosa (doble o float)
 *   - Fecha de realización
 *   
 * Para hacer estas mediciones se pide implmentar un sistema de validación de 
 * estos que compruebe las siguientes condiciones:
 *   - No se pueden introducir valores nulos.
 *   - Se debe introducir unicamente valores númericos a excepción de la fecha
 *     en el cual solo se permitirá fechas con dia y hora.
 *   - No se deben introducir valores negativos
 *   - El rango de valores permitidos son:
 *   	- Tensión alta: [8, 20]
 *   	- Tensión baja: [5, 11]
 *   	- Nivel de glucosa: [25, 500]
 *   	- La fecha de realización no puede ser superior al momento actual.
 *   - La tensión baja no puede ser superior a la tensión alta.
 *   - La diferencia minima entre dos mediciones es un dia (Opcional)
 * 
 * @author Iv�n Gonz�lez Mahagamage
 *
 */
public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setBirthDate(new LocalDate(1990, 12, 22));
	}

}
