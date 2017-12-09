public class Gerente extends Mensalista implements Premio 
{
	public Gerente(String nome, double salario) 
	{
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double bonus() 
	{
		return 0.05 * super.salario();
	}

	@Override
	public String toString() {
		return "Gerente [bonus()=" + bonus() + ", toString()=" + super.toString() + "]";
	}


}
