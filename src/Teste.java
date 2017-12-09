import java.util.ArrayList;

public class Teste 
{
	public static void main(String[] args) 
	{
		ArrayList<Empregado> empregado = new ArrayList<>();
		
		empregado.add(new Mensalista("joão",2000.00));
		empregado.add(new Mensalista("Maria",5000.00));
		empregado.add(new Gerente("jose",7000.00));
		empregado.add(new Gerente("Mariana",12000.00));
		
		for(Empregado emp:empregado)
		{
			System.out.print(emp + "\n");
			if(emp instanceof Premio)
			{
				Premio premio = (Premio) emp;
				System.out.println(premio.bonus());
			}	
		}
	}
}