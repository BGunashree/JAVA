

public class LocalVariable{  
    // Static variable  
    int cnt = 0;  
    public LocalVariable() {  
        cnt++;  
    }  
    public static void main(String[] args) {  
        LocalVariable c1 = new LocalVariable();  
        LocalVariable c2 = new LocalVariable();  
        System.out.println("Count  variable Value: " + LocalVariable.count);  
    }  
}  