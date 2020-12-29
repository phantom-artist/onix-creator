package com.phantomartist.onix.schema;

import java.util.List;

public interface SchemaWalker {

    List<SchemaNode> walkClass(Class<?> clazz);

    List<SchemaNode> walkObject(Object obj);
}