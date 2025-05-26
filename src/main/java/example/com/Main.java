package example.com;

import example.com.Controller.TicketController;
import example.com.Repositories.GateRepository;
import example.com.Repositories.ParkingLotRepository;
import example.com.Repositories.TicketRepository;
import example.com.Repositories.VehicleRepository;
import example.com.Services.TicketService;

public class Main {
    public static void main(String[] args) {
        TicketRepository ticketRepository =  new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository, parkingLotRepository,ticketRepository);

        TicketController ticketController = new TicketController(ticketService);
    }
}