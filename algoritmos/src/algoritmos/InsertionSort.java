package algoritmos;

public class InsertionSort {
	
	
	public static void ordena(Integer[] A, int n){
		
		for(int j=2;j<n;j++){
			Integer chave = A[j];
		}
		
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
