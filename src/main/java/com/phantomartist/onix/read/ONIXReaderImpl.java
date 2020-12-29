package com.phantomartist.onix.read;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.dom4j.DocumentException;
import org.editeur.ns.onix._3_0.reference.ONIXMessage;
import org.editeur.ns.onix._3_0.reference.Product;

import com.phantomartist.onix.ONIXException;
import com.phantomartist.onix.schema.Schema;
import com.phantomartist.onix.util.ProductUtils;

public class ONIXReaderImpl implements ONIXReader, AutoCloseable {

    private Schema schema;
    private File onixFile;

    public ONIXReaderImpl(final Schema schema, final String filename) throws DocumentException {
        this(schema, new File(filename));
    }

    public ONIXReaderImpl(final Schema schema, final File file) throws DocumentException {
        this.onixFile = file;
        this.schema = schema;
    }

    @Override
    public List<ProductSummary> summarize() throws ONIXException {

        final List<ProductSummary> summaries = new LinkedList<>();

        try {
            final ONIXMessage msg = schema.toONIXMessage(onixFile);
            int recordNumber = 0;
            for (Product product : msg.getProduct()) {
                final ProductSummary summary = ProductUtils.summarize(product);
                summary.setRecordNumber(++recordNumber);
                summaries.add(summary);
            }
        } catch (JAXBException e) {
            throw new ONIXException(e.getMessage(), e);
        }

        return summaries;
    }

    @Override
    public void close() {
        
    }
}
