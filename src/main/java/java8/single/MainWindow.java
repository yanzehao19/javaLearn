package java8.single;

public class MainWindow {
   private static MainWindow instance=new MainWindow();

    private MainWindow() {
    }
    public static MainWindow getInstance(){
        return instance;
    }

    public static void main(String[] args){
        MainWindow object = MainWindow.getInstance();

    }
}
