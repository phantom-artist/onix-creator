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
 * <p>Java class for List86.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List86"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHR"/&gt;
 *     &lt;enumeration value="CHA"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="STN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "List86")
@XmlEnum
public enum List86 {


    /**
     * A Bible with the text organized in the order in which events are believed to have happened
     * 
     */
    CHR,

    /**
     * A Bible which explores keywords or themes by referring text to preceding or following text
     * 
     */
    CHA,

    /**
     * A Bible or other text in which different versions are printed one line above the other, so that the variations can easily be detected
     * 
     */
    INT,

    /**
     * A Bible with two or more versions printed side by side
     * 
     */
    PAR,

    /**
     * A Bible in which the text is presented in the traditional order
     * 
     */
    STN;

    public String value() {
        return name();
    }

    public static List86 fromValue(String v) {
        return valueOf(v);
    }

}
