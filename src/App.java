import service.PerpusService;
import service.PerpusServiceImpl;

public class App {

    public static void main(String[] args)  {
        showListBuku();
    }

    public static void showListBuku() {
        PerpusService perpusService = new PerpusServiceImpl();
        perpusService.showListBuku();
    }

}
