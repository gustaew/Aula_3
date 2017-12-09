public class Mensalista extends Empregado 
{
	private double salario;

	public Mensalista(String nome, double salario) 
	{
		super(nome);
		this.salario = salario;
	}

	@Override
	public double salario() 
	{
		return salario;
	}

	@Override
	public String toString() {
		return "Mensalista [salario=" + salario + ", toString()=" + super.toString() + "]";
	}
}