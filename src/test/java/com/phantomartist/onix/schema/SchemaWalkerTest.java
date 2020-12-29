package com.phantomartist.onix.schema;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.editeur.ns.onix._3_0.reference.Product;
import org.junit.jupiter.api.Test;

class SchemaWalkerTest {

    @Test
    void testWalkObject() {
        fail("Not yet implemented");
    }

    @Test
    void testWalkClass() {
        final List<SchemaNode> nodes = 
            new SchemaWalkerImpl().walkClass(Product.class);
        
        for (SchemaNode node : nodes) {
            System.out.println(node);
        }
    }

}
