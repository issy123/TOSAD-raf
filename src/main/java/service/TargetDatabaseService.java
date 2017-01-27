/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.dialect.*;

/**
 *
 * @author ismail
 */
public class TargetDatabaseService {

    private final ArrayList<DatabaseDialect> dialects = new ArrayList<>();
    DatabaseDialect dialect;
    Map<String,String> credentials = new HashMap();

    public TargetDatabaseService() {
        this.register(new MysqlDialect());
        this.register(new OracleDialect());
    }

    public void setCredentials(String type, String url, String databaseName, String username, String password){
        
        this.credentials.put("DATABASE_URL", url);
        this.credentials.put("DATABASE_NAME", databaseName);
        this.credentials.put("DATABASE_USERNAME", username);
        this.credentials.put("DATABASE_PASSWORD", username);
        try {
            this.setDialect(type);
        } catch (Exception ex) {
            Logger.getLogger(TargetDatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dialect.setCredentials(this.credentials);
    }
    
    public void register(DatabaseDialect dialect) {
        dialects.add(dialect);
    }

    private void setDialect(String type) throws Exception{
        for(DatabaseDialect currentDialect : dialects){
            if(currentDialect.getType().equals(type)){
                this.dialect = currentDialect;
                return;
            }
        }
        throw new Exception("Dialect '" + type + "' is not supported");
    }
    public List<String> getTables() {
        return this.dialect.getTables();
    }

    public List<Map> getColumns(String tablename) {
        return this.dialect.getColumns(tablename);
    }

    public void insertBusinessRule(String businessRule) {
        this.dialect.insertBusinessRule(businessRule);
    }
    
    public void getBusinessRules() {
        this.dialect.getBusinessRules();
    }
}