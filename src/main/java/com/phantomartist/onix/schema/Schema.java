package com.phantomartist.onix.schema;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import org.editeur.ns.onix._3_0.reference.ONIXMessage;
import org.editeur.ns.onix._3_0.reference.Product;

public interface Schema {

    ONIXMessage toONIXMessage(final File file) throws JAXBException;

    Product toProduct(final String xml) throws JAXBException;

    String toXML(final Product product) throws JAXBException;

}
