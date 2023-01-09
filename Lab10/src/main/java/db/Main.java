package db;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Login loginInstance = new Login();
        if (loginInstance.login(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
