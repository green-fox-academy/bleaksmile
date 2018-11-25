package Reservations;

public class Main {
    public static void main(String[] args) {
        Reservation reserv1 = new Reservation();
        Reservation reserv2 = new Reservation();
        Reservation reserv3 = new Reservation();
        Reservation reserv4 = new Reservation();
        Reservation reserv5 = new Reservation();

        reserv1.getBooked();
        reserv2.getBooked();
        reserv3.getBooked();
        reserv4.getBooked();
        reserv5.getBooked();

        System.out.println(reserv1.getDowBooking());
        System.out.println(reserv1.getDays());
    }
}
