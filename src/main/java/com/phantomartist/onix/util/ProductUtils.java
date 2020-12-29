package com.phantomartist.onix.util;

import org.editeur.ns.onix._3_0.reference.Product;
import org.editeur.ns.onix._3_0.reference.ProductIdentifier;

import com.phantomartist.onix.read.ProductSummary;

public class ProductUtils {

    private static final String ISBN13 = "15";
    private static final String EAN = "03";

    public static ProductSummary summarize(final Product product) {
        final ProductSummary summary = new ProductSummary();
        summary.setIdentifier(extractBestIdentifier(product));
        summary.setContributor(extractContributor(product));
        summary.setTitle(extractTitle(product));
        return summary;
    }
    
    private static String extractTitle(final Product product) {

        return null;
    }

    private static String extractContributor(final Product product) {

        return null;
    }

    private static String extractBestIdentifier(final Product product) {
        for (ProductIdentifier pi : product.getProductIdentifier()) {
            if (pi.getProductIDType() != null && 
                ISBN13.contentEquals(pi.getProductIDType().getValue()) &&
                pi.getIDValue() != null) {

                return pi.getIDValue().getValue();
            }
        }
        return null;
    }
}
