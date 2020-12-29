package com.phantomartist.onix.schema;

public class SchemaNodeImpl implements SchemaNode {

    private String name;
    private String displayName;
    private String value;
    private String xpath;
    private boolean isRequired;
    private boolean isMultiple;

    public SchemaNodeImpl(final String name, final String displayName, final String value, final String xpath, final boolean isRequired, final boolean isMultiple) {
        this.name = name;
        this.displayName = displayName;
        this.value = value;
        this.xpath = xpath;
        this.isRequired = isRequired;
        this.isMultiple = isMultiple;
    }
    
    @Override
    public String getName() {

        return name;
    }

    @Override
    public String getDisplayName() {

        return displayName;
    }

    @Override
    public String getValue() {

        return value;
    }

    @Override
    public String getXPath() {

        return xpath;
    }

    @Override
    public boolean isRequired() {

        return isRequired;
    }

    @Override
    public boolean isMultiple() {

        return isMultiple;
    }

    @Override
    public String getCodeList() {

        return null;
    }

    @Override
    public String toString() {
        return "SchemaNodeImpl [name=" + name + ", displayName=" + displayName + ", value=" + value + ", xpath=" + xpath
                + ", isRequired=" + isRequired + ", isMultiple=" + isMultiple + "]";
    }

}
