package model;
// Generated Jan 24, 2017 3:08:17 PM by Hibernate Tools 4.3.1

/**
 * AttributeListRuleItem generated by hbm2java
 */
public class AttributeListRuleItemModel implements java.io.Serializable {

    private long id;
    private AttributeListRuleModel attributeListRule;
    private String value;

    public AttributeListRuleItemModel() {
    }

    public AttributeListRuleItemModel(long id, AttributeListRuleModel attributeListRule, String value) {
        this.id = id;
        this.attributeListRule = attributeListRule;
        this.value = value;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AttributeListRuleModel getAttributeListRule() {
        return this.attributeListRule;
    }

    public void setAttributeListRule(AttributeListRuleModel attributeListRule) {
        this.attributeListRule = attributeListRule;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
