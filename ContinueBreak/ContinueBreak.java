class ContinueBreak {

	public static void main(String args[]) {
		
		System.out.println("-----Break Statment-----");


		outer:

		for (int i = 0; i < 5; i++) {
			
			inner:

			for (int j = 0; j < 5; j++) {
		
				System.out.println("j ="+j+", i="+i);

				if(i == 3) {
				
					break outer;
				}
			}
		}


		System.out.println("-----Continue Statment-----");

		for (int i = 0; i < 5; i++) {
			
			if(i == 3){
				
				System.out.println("3 is omitted " );

				continue;
			}

			System.out.println("i = "+ i);
		}
	}
}
