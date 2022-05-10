 import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

        public String getEmail() {
		return email;
        }

        public Double getcpf() {
		return cpf;
        }
        
        public Int getTelefone() {
		return telefone;
        }

	public void setNome(String nome) {
		this.nome = nome;
	}
       
        public void setEmail(String email) {
		this.email = email;
	}
        
        public void setNome(Double cpf) {
		this.cpf = cpf;
	}

        public void setNome(Int telefone) {
		this.telefone = telefone;
	}



	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
