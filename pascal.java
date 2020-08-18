class Main {
  public static void main(String[] args) {
		int row, column, i, pas[][];
		i = 7; // Number of steps
		pas = new int[i][i]; // Initialize Triangle
    		int s = i-1; // For calculating Spacing
		
		for(row=0; row<i; row++){ // Iterates through rows
			for(column=0; column<=row; column++){ // Iterates through columns
				if(column==0 || column==row){ // Inserts 1 at beginning/end of col
					pas[row][column] = 1;
				}else{
					pas[row][column] = pas[row-1][column-1] + pas[row-1][column]; // According to wikipeedia formula
				}
			}
		}
		
		for(row=0;row<i;row++){
			for(column=0;column<=s;column++)
				    System.out.print(" ");

				s--;

			for(column=0;column<=row;column++)
			    System.out.print(pas[row][column]+" ");

	        	System.out.println();
		} 
  	}
}
