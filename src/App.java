import Service.PerpusService;
import Service.PerpusServiceImpl;

public class App {

    public static PerpusService perpusService = new PerpusServiceImpl();

    public static void main(String[] args) {
        perpusService.showListBuku();
        perpusService.pinjamBuku();
    }


}
