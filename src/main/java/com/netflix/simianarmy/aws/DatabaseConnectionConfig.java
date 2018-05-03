package com.netflix.simianarmy.aws;

public class DatabaseConnectionConfig {
    private final String dbDriver;
    private final String dbPass;
    private final String dbUser;
    private final String dbUrl;
    private final String dbTable;

    /**
     */
    public DatabaseConnectionConfig(String dbDriver, String dbPass, String dbUser, String dbUrl, String dbTable) {
        this.dbDriver = dbDriver;
        this.dbPass = dbPass;
        this.dbUser = dbUser;
        this.dbUrl = dbUrl;
        this.dbTable = dbTable;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public String getDbPass() {
        return dbPass;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbTable() {
        return dbTable;
    }
}
