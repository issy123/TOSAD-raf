package model;
// Generated Feb 1, 2017 1:00:28 PM by Hibernate Tools 4.3.1



/**
 * OtherRule generated by hbm2java
 */
public class OtherRuleModel  implements java.io.Serializable {


     private long id;
     private String sqlCode;
     private String beforeOrAfter;
     private String insertUpdateDelete;

    public OtherRuleModel() {
    }

    public OtherRuleModel(long id, String sqlCode, String beforeOrAfter, String insertUpdateDelete) {
       this.id = id;
       this.sqlCode = sqlCode;
       this.beforeOrAfter = beforeOrAfter;
       this.insertUpdateDelete = insertUpdateDelete;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getSqlCode() {
        return this.sqlCode;
    }
    
    public void setSqlCode(String sqlCode) {
        this.sqlCode = sqlCode;
    }
    public String getBeforeOrAfter() {
        return this.beforeOrAfter;
    }
    
    public void setBeforeOrAfter(String beforeOrAfter) {
        this.beforeOrAfter = beforeOrAfter;
    }
    public String getInsertUpdateDelete() {
        return this.insertUpdateDelete;
    }
    
    public void setInsertUpdateDelete(String insertUpdateDelete) {
        this.insertUpdateDelete = insertUpdateDelete;
    }

    @Override
    public String toString() {
        return "OtherRuleModel{" + "id=" + id + ", sqlCode=" + sqlCode + ", beforeOrAfter=" + beforeOrAfter + ", insertUpdateDelete=" + insertUpdateDelete + '}';
    }

}


