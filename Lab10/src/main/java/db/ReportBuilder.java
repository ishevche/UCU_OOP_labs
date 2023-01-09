package db;

import lombok.Getter;

public class ReportBuilder {
    @Getter
    private final DataBase db;
    public ReportBuilder(DataBase db) {
        this.db = db;
    }
}
