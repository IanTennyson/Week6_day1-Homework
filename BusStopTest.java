import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  BusStop busStop;
  Passenger passenger;

  @Before
  public void before(){
    busStop = new BusStop();
    passenger = new Passenger();
  }

  @Test
  public void busStopStartsEmpty(){
    assertEquals(0, busStop.stopPassengerCount());
  }

  @Test
  public void canAddPassengerToBusStop(){
    this.busStop.addPassengerToStop(this.passenger);
    assertEquals(1, busStop.stopPassengerCount());
  }

  @Test
  public void busStopIsFull(){
    for(int i = 0; i < 10; i++){
      this.busStop.addPassengerToStop(this.passenger);
    }
    assertEquals(true, this.busStop.isBusStopFull());
  }

  @Test
  public void cannotAddPassengerWhenBusStopIsFull(){
    for(int i = 0; i < 15; i++){
      this.busStop.addPassengerToStop(this.passenger);
    }
    assertEquals(10, busStop.stopPassengerCount());
  }

  @Test
  public void busStopEmpties(){
    this.busStop.addPassengerToStop(this.passenger);
    this.busStop.busArrives();
    assertEquals(0, busStop.stopPassengerCount());
  }

}