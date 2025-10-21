package listadeatividades7;

public class Pauta {
	//atributos
	private int matricula;
	private String nomeAluno;
	private int numFalta;
	private double nota1;
	private double nota2;
	//construtores
	public Pauta() {
		this.matricula=0;
		this.nomeAluno="";
		this.numFalta=0;
		this.nota1=0;
		this.nota2=0;

	}
	public Pauta(int m,String nome,int numF,double n1,double n2) {
		this.matricula = m;
		this.nomeAluno=nome;
		this.numFalta=numF;
		this.nota1=n1;
		this.nota2=n2;
	}
	//get
	public int getMatricula() {
		return this.matricula;
	}
	public String getnomeAluno() {
		return this.nomeAluno;
	}
	public int getnumFalta() {
		return this.numFalta;

	}
	public double getnota1() {
		return this.nota1;
	}
	public double getnota2() {
		return this.nota2;
	}
	//sets
	public  void setMatricula(int novoValor) {
		this.matricula=novoValor;
	}
	public void setnomeAluno(String novoValor) {
		this.nomeAluno=novoValor;
	}
	public void setnumFalta(int novoValor) {
		this.numFalta=novoValor;
	}
	public void setnota1(double novoValor) {
		this.nota1=novoValor;
	}
	public void setnota2(double novoValor) {
		this.nota2=novoValor;
	}
	//toString
	public String toString() {
		return " Matricula: "+this.matricula+
				" \nNome: "+this.nomeAluno+
				" \nNúmero de faltas: "+this.numFalta+
				" \nNota 1: "+this.nota1+
				" \nNota 2: "+this.nota2;		
	}
	public boolean verificarFaltas() {
		if (this.numFalta>25) {
			return true;
		}else {
			return false;
		}
	}
	public double calcularMedia() {
		return (this.nota1+this.nota2)/2;
	}
	public String verificarSituacao() {
		if (this.calcularMedia()>=7 && (!this.verificarFaltas())) {
			return "aprovado";
		}else {
			return "reprovado";
		}
	}
}
