package com.phantomartist.onix.jaxb;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.xml.bind.JAXBException;

import org.editeur.ns.onix._3_0.reference.Product;
import org.junit.jupiter.api.Test;

import com.phantomartist.onix.schema.SchemaImpl;

class SchemaTest {

    @Test
    void testMarshall() throws JAXBException {

        final Product p = new Product();
        assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Product xmlns=\"http://ns.editeur.org/onix/3.0/reference\"/>", 
            new SchemaImpl().toXML(p));
    }

    @Test
    void testUnmarshall() throws JAXBException {
        
        final String xml = 
            "<Product xmlns=\"http://ns.editeur.org/onix/3.0/reference\">" +
            "</Product>";
        
        assertNotNull(new SchemaImpl().toProduct(xml));
    }
}
