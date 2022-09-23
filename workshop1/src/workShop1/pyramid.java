/*
 * 	Student name: Deepkumar Rajendrakumar Patel
	Student Email: drpatel33@myseneca.ca
	Student number: 153693189
	Section: ZAA
 * */
package workShop1;

public class pyramid {
	public static void main(String[] args) {
		int totalRows = 8;
		
		for (int i = 1; i <= totalRows; i++) {
			int count = 1;
			
			//manage spaces
			for (int j = 0; j <= totalRows-i; j++){
				
                System.out.print("    ");
            }			
			//pyramid
			for(int j = 1; j < 2*i; j+=2){		
			//print first half
				System.out.printf(" %3d",count);
				
				if(j == 2*i - 1){
				//divide for other half
					int temp = count/2;
					//other half
					for(int k=j-1; k >=1; k-=2)	{		
						//print other half
						System.out.printf(" %3d",temp);				
						temp=temp/2;		
					}	
				}		
				//multiply by two
				count=count*2;
			}
			//change line
			System.out.println("");		
		}		
	}
}
