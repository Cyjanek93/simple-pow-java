public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        int liczba = 5;
        int wykladnik = 3;
        int wynik = 1;
        
        if(wykladnik!=0)
        {
        for(int i = 1;i<=wykladnik;i++){
            
            wynik*=liczba;
            
        }
        }
        else
        {
            wynik = 1;
        }
        
        System.out.println(wynik);
     }
     


}
