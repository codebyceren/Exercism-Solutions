class NeedForSpeed {

      private int speed;
      private int batteryDrain;
      private int battery = 100;
      private int distanceDriven = 0;
      
    
     public NeedForSpeed(int speed, int batteryDrain) {
         this.speed=speed;
         this.batteryDrain=batteryDrain;

         
    }

    public boolean batteryDrained() {
        if(battery < batteryDrain){
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) { 
            distanceDriven += speed;
            battery -= batteryDrain; }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
       while (!car.batteryDrained() && car.distanceDriven() < distance) {
        car.drive();
       } 
       if (car.distanceDriven() >= distance) {
        return true;
       }
       return false;
    }

    
}
