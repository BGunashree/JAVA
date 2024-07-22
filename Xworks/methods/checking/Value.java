public class Value{  
    // Static variable  
     int cnt = 0;  
    public Value() {  
        cnt++;  
		         
    }  
    public static void main(String[] args) {  
        Value c1 = new Value();
        Value c2 = new Value();  
		System.out.println("Count  variable Value: " + cnt);
       		
       
 
    }  
}  