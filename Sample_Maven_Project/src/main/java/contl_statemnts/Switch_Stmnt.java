package contl_statemnts;

public class Switch_Stmnt {

	public static void main(String[] args) 
	{
		String albhabet="E";
		switch (albhabet)
		{
		case "A":
		case "E": 
		case "I": 
		case "O": 
		case "U": System.out.println("Vowel");
		break;
		default: System.out.println("Consonent");
		break;
	}

}
}