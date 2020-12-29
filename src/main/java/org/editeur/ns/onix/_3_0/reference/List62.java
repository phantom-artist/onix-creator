//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.27 at 12:23:29 PM EST 
//


package org.editeur.ns.onix._3_0.reference;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List62.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List62"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "List62")
@XmlEnum
public enum List62 {


    /**
     * Specifies that tax is applied at a higher rate than standard
     * 
     */
    H,

    /**
     * Under Italian tax rules, VAT on books may be paid at source by the publisher, and subsequent transactions through the supply chain are tax-exempt
     * 
     */
    P,

    /**
     * Specifies that tax is applied at a lower rate than standard. In the EU, use code R for ‘Reduced rates’, and for rates lower than 5%, use code T (‘Super-reduced’) or Z (Zero-rated)
     * 
     */
    R,
    S,

    /**
     * Specifies that tax is applied at a rate lower than the Lower rate(s). In the EU, use code T for ‘Super-reduced rates’, and for Reduced rates (5% or above) use code R (Lower rate). For use in ONIX 3.0 only
     * 
     */
    T,
    Z;

    public String value() {
        return name();
    }

    public static List62 fromValue(String v) {
        return valueOf(v);
    }

}