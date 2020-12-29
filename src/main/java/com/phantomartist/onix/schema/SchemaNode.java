package com.phantomartist.onix.schema;

public interface SchemaNode {

    String getName();

    String getDisplayName();

    String getValue();

    String getXPath();

    boolean isRequired();

    boolean isMultiple();

    String getCodeList();
}
