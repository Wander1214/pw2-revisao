
public class ExercicioSete {
	public static void main(String[] args) {
		double l1 = 3;
		double l2 = 3;
		double l3 = 4;
		
		
		if (l1 == l2 && l2 == l3) {
			System.out.println("O tri�ngulo � equil�tero");
		}
		
		
		
		else if (l1!=l2 && l2!= l3) {
			System.out.println("O tri�ngulo � escaleno");
		}
		
		else  {
			System.out.println("O tri�ngulo � isosceles");
		}
		
		
	}
}
