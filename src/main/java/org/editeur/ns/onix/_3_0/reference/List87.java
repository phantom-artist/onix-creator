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
 * <p>Java class for List87.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List87"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CCL"/&gt;
 *     &lt;enumeration value="PGE"/&gt;
 *     &lt;enumeration value="SID"/&gt;
 *     &lt;enumeration value="VER"/&gt;
 *     &lt;enumeration value="UNK"/&gt;
 *     &lt;enumeration value="ZZZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "List87")
@XmlEnum
public enum List87 {


    /**
     * References are printed in a narrow column in the center of the page between two columns of text
     * 
     */
    CCL,

    /**
     * References are printed at the foot of the page
     * 
     */
    PGE,

    /**
     * References are printed in a column to the side of the scripture
     * 
     */
    SID,

    /**
     * References are printed at the end of the applicable verse
     * 
     */
    VER,

    /**
     * The person creating the ONIX record does not know where the references are located
     * 
     */
    UNK,

    /**
     * Other locations not otherwise identified
     * 
     */
    ZZZ;

    public String value() {
        return name();
    }

    public static List87 fromValue(String v) {
        return valueOf(v);
    }

}
