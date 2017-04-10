import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Passenger passenger;
  BusStop busStop;

  @Before
  public void before(){
    bus = new Bus();
    passenger = new Passenger();
    busStop = new BusStop();

  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canAddPassenger(){
    this.bus.add(this.passenger);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i < 5; i++){
      this.bus.add(this.passenger);
    }
    assertEquals(true, this.bus.isBusFull());
  }

  @Test
  public void cannotAddPassengerWhenBusIsFull(){
    for(int i = 0; i < 10; i++){
      this.bus.add(this.passenger);
    }
    assertEquals(5, bus.passengerCount());
  }

  @Test
  public void busEmptiesAtStop(){
    this.bus.add(this.passenger);
    this.bus.busStop();
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void movePassengerFromStopToBus(){
    this.busStop.addPassengerToStop(this.passenger);
    this.bus.moveFromStopToBus();
    assertEquals(0, busStop.stopPassengerCount());
  }

}