package model;
// Generated Jan 24, 2017 3:08:17 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Project generated by hbm2java
 */
public class ProjectModel implements java.io.Serializable {

    private long id;
    private String databaseUrl;
    private String databaseUsername;
    private String databasePassword;
    private String databaseType;
    private String databaseName;
    private Set users = new HashSet(0);
    private Set businessRules = new HashSet(0);

    public ProjectModel() {
    }

    public ProjectModel(long id, String databaseUrl, String databaseUsername, String databasePassword, String databaseName) {
        this.id = id;
        this.databaseUrl = databaseUrl;
        this.databaseUsername = databaseUsername;
        this.databasePassword = databasePassword;
        this.databaseName = databaseName;
    }

    public ProjectModel(long id, String databaseUrl, String databaseUsername, String databasePassword, String databaseName, String databaseType) {
        this.id = id;
        this.databaseUrl = databaseUrl;
        this.databaseUsername = databaseUsername;
        this.databasePassword = databasePassword;
        this.databaseName = databaseName;
        this.databaseType = databaseType;
    }

    public ProjectModel(long id, String databaseUrl, String databaseUsername, String databasePassword, String databaseName, Set users, Set businessRules) {
        this.id = id;
        this.databaseUrl = databaseUrl;
        this.databaseUsername = databaseUsername;
        this.databasePassword = databasePassword;
        this.databaseName = databaseName;
        this.users = users;
        this.businessRules = businessRules;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getDatabaseUsername() {
        return this.databaseUsername;
    }

    public void setDatabaseUsername(String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public String getDatabaseType() {
        return this.databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Set getUsers() {
        return this.users;
    }

    public void setUsers(Set users) {
        this.users = users;
    }

    public Set getBusinessRules() {
        return this.businessRules;
    }

    public void setBusinessRules(Set businessRules) {
        this.businessRules = businessRules;
    }

    @Override
    public String toString() {
        return "ProjectModel{" + "id=" + id + ", databaseUrl=" + databaseUrl + ", databaseUsername=" + databaseUsername + ", databasePassword=" + databasePassword + ", databaseType=" + databaseType + ", databaseName=" + databaseName + '}';
    }

}
