//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.27 at 12:23:29 PM EST 
//


package org.editeur.ns.onix._3_0.reference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pre.content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pre.content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}a"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}br"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}span"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}bdo"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}map"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}tt"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}i"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}b"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}phrase"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}gloss"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pre.content", propOrder = {
    "content"
})
@XmlSeeAlso({
    Pre.class
})
public class PreContent {

    @XmlElementRefs({
        @XmlElementRef(name = "span", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "phrase", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gloss", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Ruby }{@code >}
     * {@link JAXBElement }{@code <}{@link Span }{@code >}
     * {@link JAXBElement }{@code <}{@link Abbr }{@code >}
     * {@link JAXBElement }{@code <}{@link Sup }{@code >}
     * {@link JAXBElement }{@code <}{@link Kbd }{@code >}
     * {@link JAXBElement }{@code <}{@link Var }{@code >}
     * {@link JAXBElement }{@code <}{@link Br }{@code >}
     * {@link JAXBElement }{@code <}{@link Map }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link A }{@code >}
     * {@link JAXBElement }{@code <}{@link Strong }{@code >}
     * {@link JAXBElement }{@code <}{@link Code }{@code >}
     * {@link JAXBElement }{@code <}{@link Q }{@code >}
     * {@link JAXBElement }{@code <}{@link Tt }{@code >}
     * {@link JAXBElement }{@code <}{@link Samp }{@code >}
     * {@link JAXBElement }{@code <}{@link Sub }{@code >}
     * {@link JAXBElement }{@code <}{@link Dfn }{@code >}
     * {@link JAXBElement }{@code <}{@link Cite }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Em }{@code >}
     * {@link JAXBElement }{@code <}{@link I }{@code >}
     * {@link JAXBElement }{@code <}{@link Acronym }{@code >}
     * {@link JAXBElement }{@code <}{@link B }{@code >}
     * {@link JAXBElement }{@code <}{@link Bdo }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
