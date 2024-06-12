
public interface IConta {
	
	double sacar(double valor);
	
	boolean depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
