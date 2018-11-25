package Reservations;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reservation implements Reservations {
  private String code;
  private String days;

  public String getDays() {
    return days;
  }

  @Override
  public String getDowBooking() {
    String[] daysArray = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int random = (int) (Math.random() * 7);
    days = daysArray[random];
    return days;
  }

  @Override
  public String getCodeBooking() {
    String sourceCode = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < 8; i++) {
      int random = (int) (Math.random() * sourceCode.length());
      code += sourceCode.charAt(random);
    }
    return code;
  }

  public void getBooked() {
    System.out.printf("Booking# %s for %s%n", getCodeBooking(), getDowBooking());
  }
}
