import service.PerpusService;
import service.PerpusServiceImpl;

public class App {

    public static PerpusService perpusService = new PerpusServiceImpl();

    public static void main(String[] args) {
        perpusService.showListBuku();
        perpusService.pinjamBuku();
    }


}
