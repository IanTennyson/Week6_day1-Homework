public class Bus{
  private Passenger[] capacity; 
  private BusStop busStop;

  public Bus(){
    this.capacity = new Passenger[5];
    this.busStop = new BusStop();
  }

  public void add(Passenger passenger){
    if(isBusFull()){
      return;
    }
    int passengerCount = passengerCount();
    this.capacity[passengerCount] = passenger; 
  }

  public int passengerCount(){

    int count = 0;
    for(Passenger passenger : this.capacity){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

  public boolean isBusFull(){
    return passengerCount() == capacity.length;
  }

  public void busStop(){
    for(int i = 0; i < capacity.length; i++ ){
      this.capacity[i] = null;
    }
  }

  public void moveFromStopToBus(){
    busStop.busArrives();
  }


}