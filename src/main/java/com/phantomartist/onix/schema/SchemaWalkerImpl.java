package com.phantomartist.onix.schema;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

import com.phantomartist.onix.util.StringUtils;

public class SchemaWalkerImpl implements SchemaWalker {

    public SchemaWalkerImpl() {
    }

    public List<SchemaNode> walkObject(final Object object) {

        final List<SchemaNode> nodes = new LinkedList<>();

        for (Field field : object.getClass().getDeclaredFields()) {
            
        }

        return nodes;
    }

    public List<SchemaNode> walkClass(final Class<?> clazz) {

        final List<SchemaNode> nodes = new LinkedList<>();

        final String currentPath = "/" + clazz.getSimpleName();
        nodes.add(convert(clazz, currentPath, false, false));
        walkClazz(clazz, nodes, currentPath);

        return nodes;
    }

    private void walkClazz(final Class<?> clazz, final List<SchemaNode> nodes, final String xpath) {

        final Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(XmlElement.class)) {

                Class<?> fieldType = field.getType();
                boolean isMultiple = false;
                if (fieldType == List.class) {
                    isMultiple = true;

                    // Get generic type if List
                    final ParameterizedType listType = (ParameterizedType) field.getGenericType();
                    fieldType = (Class<?>) listType.getActualTypeArguments()[0];
                }

                final String currentPath = xpath + "/" + fieldType.getSimpleName();
                final XmlElement xmlElement = field.getAnnotation(XmlElement.class);

                nodes.add(convert(fieldType, currentPath, xmlElement.required(), isMultiple));

                walkClazz(fieldType, nodes, currentPath);
            }
        }
    }

    private SchemaNode convert(final Class<?> clazz, final String xpath, final boolean isRequired, final boolean isMultiple) {

        final String name = clazz.getSimpleName();
        final String displayName = StringUtils.splitCamelCase(name);

        return new SchemaNodeImpl(name, displayName, null, xpath, isRequired, isMultiple);
    }
    
    private SchemaNode convert(final Object obj, final String xpath) throws IllegalArgumentException, IllegalAccessException {

        final String name = obj.getClass().getSimpleName();
        final String displayName = StringUtils.splitCamelCase(name);
        String value = null;
        final Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(XmlValue.class)) {
                final Object val = field.get(obj);
                if (val instanceof String) {
                    value = (String)val;
                } else if (val instanceof Enum) {
                    value = ((Enum)val).name();
                }
            }
        }

        return new SchemaNodeImpl(name, displayName, value, xpath, false, false);
    }
}
