/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.templates;

import java.util.Map;
import model.BusinessRuleModel;
import org.hibernate.Session;
import template.Template;

/**
 * @author ismail
 */
public class TupleOtherRule implements Template {

    @Override
    public Map<String, String> parse(BusinessRuleModel rule, Session session) {

        return null;
    }

    @Override
    public String code() {
        return "TOTH";
    }
}
