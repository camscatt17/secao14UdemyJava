package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFunc;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}
	
	public void setNumFun(int numFunc) {
		this.numFunc = numFunc;
	}
	
	public int getNumFunc () {
		return numFunc;
	}
	
	@Override
	public double impostoPago() {
		if (getNumFunc()<10)
			return getRendaAnual()*0.16;
		else
			return getRendaAnual()*0.14;
	}
}
