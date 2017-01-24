package model;
// Generated Jan 24, 2017 3:08:17 PM by Hibernate Tools 4.3.1



/**
 * CompareRule generated by hbm2java
 */
public class CompareRule  implements java.io.Serializable {


     private long id;
     private String type;
     private String tableName2;
     private String columnName2;
     private String columnType2;
     private String comparison;
     private String value;
     private String valueType;

    public CompareRule() {
    }

	
    public CompareRule(long id, String type, String comparison, String valueType) {
        this.id = id;
        this.type = type;
        this.comparison = comparison;
        this.valueType = valueType;
    }
    public CompareRule(long id, String type, String tableName2, String columnName2, String columnType2, String comparison, String value, String valueType) {
       this.id = id;
       this.type = type;
       this.tableName2 = tableName2;
       this.columnName2 = columnName2;
       this.columnType2 = columnType2;
       this.comparison = comparison;
       this.value = value;
       this.valueType = valueType;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getTableName2() {
        return this.tableName2;
    }
    
    public void setTableName2(String tableName2) {
        this.tableName2 = tableName2;
    }
    public String getColumnName2() {
        return this.columnName2;
    }
    
    public void setColumnName2(String columnName2) {
        this.columnName2 = columnName2;
    }
    public String getColumnType2() {
        return this.columnType2;
    }
    
    public void setColumnType2(String columnType2) {
        this.columnType2 = columnType2;
    }
    public String getComparison() {
        return this.comparison;
    }
    
    public void setComparison(String comparison) {
        this.comparison = comparison;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public String getValueType() {
        return this.valueType;
    }
    
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }




}


