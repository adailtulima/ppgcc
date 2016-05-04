package algoritmos;

public class Primos {
	
	
	public static void primo(Integer i){
		Integer j = 2;
		while ( j < i & ( (i % j )!=0) )
			j=j+1;
		
		if(i==j){
			
		}else {
			
		}
			//System.out.println("É primo");
		//else
			//System.out.println("Não é primo");
	}

	
	public static void main(String args[]){
		
		int cont = 1;
		while(cont < 100000000){
			Long before = System.currentTimeMillis();
			primo(cont);
			Long after = System.currentTimeMillis();
			cont = cont + 500000;
			System.out.println(""+cont+","+(after-before));
		}
		
		
		
	}
}
