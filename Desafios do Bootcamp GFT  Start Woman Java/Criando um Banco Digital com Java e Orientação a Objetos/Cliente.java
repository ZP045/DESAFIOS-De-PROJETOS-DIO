public class Cliente {

	private String nome;
        private String email;
        private Double cpf;
        private Int telefone;

	public String getNome() {
		return nome;
	}
        
        public String getEmail() { 
                return email; 
        } 

        public Double getCpf() { 		
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


        public void setCpf(Double cpf) { 	
	        this.cpf = cpf; 	
        }


        public void setTelefone(Int telefone) { 	
	        this.telefone = telefone; 
	} 


}
