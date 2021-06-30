import java.util.ArrayList;

public class VacationHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] continents = new String[6];
		continents[0] = "You should vist Africa";
		continents[1] = "You should vist North America";
		continents[2] = "You should vist South America";
		continents[3] = "You should vist Australia";
		continents[4] = "You should vist Europe";
		continents[5] = "You should vist Asia";
		System.out.print(continents[1]);
	
		ArrayList continentsList = new ArrayList();
		continentsList.add("You should vist Africa");
		continentsList.add("You should vist North America");
		continentsList.add("You should vist South America");
		continentsList.add("You should vist Australia");
		continentsList.add("You should vist Europe");
		continentsList.add("You should vist Asia");
		System.out.print(continentsList);
		
	}
	
}

