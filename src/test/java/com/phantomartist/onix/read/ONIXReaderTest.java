package com.phantomartist.onix.read;

import javax.xml.bind.JAXBException;

import org.dom4j.DocumentException;
import org.junit.jupiter.api.Test;

import com.phantomartist.onix.schema.SchemaImpl;

class ONIXReaderTest {

    @Test
    void testSummarize() throws DocumentException, JAXBException {
        final ONIXReader or = new ONIXReaderImpl(new SchemaImpl(), "src/test/resources/onix_test.xml");
        for (ProductSummary ps : or.summarize()) {
            System.out.println(ps);
        }
    }

}
