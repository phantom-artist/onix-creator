package com.phantomartist.onix.schema;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.editeur.ns.onix._3_0.reference.ONIXMessage;
import org.editeur.ns.onix._3_0.reference.Product;

public class SchemaImpl implements Schema {

    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public SchemaImpl() throws JAXBException {
        JAXBContext contextObj = JAXBContext.newInstance(Product.class);  
        
        marshaller = contextObj.createMarshaller();
        unmarshaller = contextObj.createUnmarshaller();
    }

    @Override
    public ONIXMessage toONIXMessage(final File file) throws JAXBException {

        return (ONIXMessage)unmarshaller.unmarshal(file);
    }

    @Override
    public Product toProduct(String xml) throws JAXBException {

        return (Product)unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes()));
    }

    @Override
    public String toXML(Product product) throws JAXBException {

        final StringWriter sw = new StringWriter();
        marshaller.marshal(product, sw);
        return sw.toString();
    }

}
