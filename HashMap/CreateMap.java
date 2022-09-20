import java.util.HashMap;

public class CreateMap {

     public static  void   main(String[]args){
        HashMap<String,String>capCities=new HashMap<>();
        capCities.put("India","Delhi");
        capCities.put("TS","Hyd");
        capCities.put("SriLanks","colombo");

       System.out.println(capCities.get("India"));
         
     }
    
}
