package bll;

public class Application {
	private Scanner scan;
	private List<Person> persons;
	
	public Application() {
		 scan = new Scanner(System.in);
		 persons = new ArrayList<Person>();
	}
	public void displayOptions() {
		System.out.println("Gestionar personas");
		System.out.println("1. Agregar");
		System.out.println("2. Guardar");
		System.out.println("3. Abrir");
		System.out.println("4. Salir");
		
	}

	public void show() {
		short option = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1:
					add();
					break;				
				case 2:
					save();
					break;
				case 3:
					open();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
		}while(option!=4);
		
	}
	public void add() {
		PersonForm pf = new PersonForm(scan);
		persons.add(pf.catchPerson());
	}
}
