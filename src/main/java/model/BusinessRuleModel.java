package model;
// Generated Feb 1, 2017 1:00:28 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * BusinessRule generated by hbm2java
 */
public class BusinessRuleModel  implements java.io.Serializable {


     private long id;
     private BusinessRuleTypeModel businessRuleType;
     private ProjectModel project;
     private String name;
     private String errorMessage;
     private String tableName;
     private String columnName;
     private String columnType;
     private Date createdOn;
     private boolean active;

    public BusinessRuleModel() {
    }

    public BusinessRuleModel(long id, BusinessRuleTypeModel businessRuleType, ProjectModel project, String name, String errorMessage, String tableName, String columnName, String columnType, Date createdOn, boolean active) {
       this.id = id;
       this.businessRuleType = businessRuleType;
       this.project = project;
       this.name = name;
       this.errorMessage = errorMessage;
       this.tableName = tableName;
       this.columnName = columnName;
       this.columnType = columnType;
       this.createdOn = createdOn;
       this.active = active;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public BusinessRuleTypeModel getBusinessRuleType() {
        return this.businessRuleType;
    }
    
    public void setBusinessRuleType(BusinessRuleTypeModel businessRuleType) {
        this.businessRuleType = businessRuleType;
    }
    public ProjectModel getProject() {
        return this.project;
    }
    
    public void setProject(ProjectModel project) {
        this.project = project;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    public String getTableName() {
        return this.tableName;
    }
    
    public String getSmallTableName() {
        return this.tableName.substring(10);
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getColumnName() {
        return this.columnName;
    }
    
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
    public String getColumnType() {
        return this.columnType;
    }
    
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "BusinessRuleModel{" + "id=" + id + ", businessRuleType=" + businessRuleType.getCode() + ", project=" + project.getName() + ", name=" + name + ", errorMessage=" + errorMessage + ", tableName=" + tableName + ", columnName=" + columnName + ", columnType=" + columnType + ", createdOn=" + createdOn + ", active=" + active + '}';
    }


}


