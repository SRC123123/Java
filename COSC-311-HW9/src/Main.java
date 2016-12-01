
public class Main {

	public static void main(String[] args) {
		
        String [] data = {"ikeji", "bahorski", "chaudhuri", "evett", "haynes", 
                "maniccam", "moore", "narayanan", "panja", "poh", "sverddlik", 
                "tehranipour", "zeiger", "zhang", "cowan", "francis", "mansour"};
            
            String[] hashTable = new String[8];
            
            int index = 20;
            
            for(int i = 0; i < hashTable.length; i++)
            {
            	
            	if(index+i >= hashTable.length) //wrap around
                {
                    index = index - (hashTable.length);
                }
            	System.out.println(index+i);
            	
            	
	            
            }
            }

	}


