//Shawn Cummings
//http://tinyurl.com/gw7x22c
//COSC 311
//HW 11/30
//Fall 2016

package cosc.pkg311.hw9;

public class COSC311HW9 {

    public static void main(String[] args) {
        
        String [] data = {"ikeji", "bahorski", "chaudhuri", "evett", "haynes", 
            "maniccam", "moore", "narayanan", "panja", "poh", "sverddlik", 
            "tehranipour", "zeiger", "zhang", "cowan", "francis", "mansour"};
        
        String[] hashTable = new String[8];
        String[] tempTable = null;       
        
        //Data input loop
        for(int i = 0; i < data.length; i++)
        {                                
            //insert data into table
            tableInsert(hashTable, data[i]);
            
            //Check if table if more than 75% full
            if(i >= hashTable.length*0.75)
            {
                //Print hashTable
                for(String s: hashTable)
                    System.out.println(s);
                
                //Create temp array double the size of hashTable
                tempTable = new String[hashTable.length*2];                 
                System.out.println("");
                
                //Rehash and fill new table
                for(int x = 0; x < hashTable.length; x++) 
                {
                    if(hashTable[x] != null)
                        tableInsert(tempTable, hashTable[x]);
                }
                
                //Update hashTable
                hashTable = tempTable;                
            }
        }
          
        //Final Print
        for(String s : hashTable)
            System.out.println(s);        
    }
    
    //Insert Method
    static void tableInsert(String [] table, String data)
    {
        //Hash data
        int index = Math.abs(data.hashCode()%10);
       
        //Check for collision or Out of Bounds Exception
        if(index >= table.length || table[index]!= null)
        {
            for(int x = 0; x < table.length; x++)
            {
                //If at end of array, wrap around
                if(index + x >= table.length) 
                {
                    index = index - (table.length);
                }
                
                //Check location for data
                if(table[index+x] == null)
                {
                    table[index + x] = data;
                    break;
                }
            }
        }
        else //if location not taken, place data there
        {
            table[index] = data;
        }
    }
}
