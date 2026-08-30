public class Lasagna {
    
    public int expectedMinutesInOven() {
         return 40;
    }
    

    
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return 40 - actualMinutesInOven;
    }
   
    
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
   
    

    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        
       return (layers * 2) + actualMinutesInOven;
    }
    
    
}
