public class TesteFinalize{
	
	public static class Teste {
		
		 protected void finalize( ) throws Throwable{
		 super.finalize();
		 System.out.print("Finalize foi chamada. ");
		 }
	
	}
	//
	public static void main(String[ ] args){
		Teste te = new Teste();
		 te = new Teste ( );
		 System.gc();
		 for (int i=1; i <1000000; i++);
		 		System.out.print("Acabou!");
	}
	
}
