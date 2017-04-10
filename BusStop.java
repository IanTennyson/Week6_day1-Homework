public class BusStop {
  private Passenger[] stopCapacity;

  public BusStop(){
    this.stopCapacity = new Passenger[10];


  }

  public void addPassengerToStop(Passenger passenger){
    if(isBusStopFull()){
      return;
    }
    int stopPassengerCount = stopPassengerCount();
    this.stopCapacity[stopPassengerCount] = passenger;
  }

  public int stopPassengerCount(){
    int count = 0;
    for(Passenger passenger : this.stopCapacity){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

  public boolean isBusStopFull(){
    return stopPassengerCount() == stopCapacity.length;
  }

  public void busArrives(){
    for(int i = 0; i < stopCapacity.length; i++ ){
      this.stopCapacity[i] = null;
    }
  }


}