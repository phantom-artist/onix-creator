//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.27 at 12:23:29 PM EST 
//


package org.editeur.ns.onix._3_0.reference;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}AgentRole"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}AgentIdentifier" maxOccurs="unbounded"/&gt;
 *             &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}AgentName" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}AgentName"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}TelephoneNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}FaxNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}EmailAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Website" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/reference}generalAttributes"/&gt;
 *       &lt;attribute name="refname"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="PublisherRepresentative"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="shortname"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="publisherrepresentative"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "PublisherRepresentative")
public class PublisherRepresentative {

    @XmlElementRefs({
        @XmlElementRef(name = "TelephoneNumber", namespace = "http://ns.editeur.org/onix/3.0/reference", type = TelephoneNumber.class, required = false),
        @XmlElementRef(name = "EmailAddress", namespace = "http://ns.editeur.org/onix/3.0/reference", type = EmailAddress.class, required = false),
        @XmlElementRef(name = "FaxNumber", namespace = "http://ns.editeur.org/onix/3.0/reference", type = FaxNumber.class, required = false),
        @XmlElementRef(name = "AgentRole", namespace = "http://ns.editeur.org/onix/3.0/reference", type = AgentRole.class, required = false),
        @XmlElementRef(name = "AgentName", namespace = "http://ns.editeur.org/onix/3.0/reference", type = AgentName.class, required = false),
        @XmlElementRef(name = "AgentIdentifier", namespace = "http://ns.editeur.org/onix/3.0/reference", type = AgentIdentifier.class, required = false),
        @XmlElementRef(name = "Website", namespace = "http://ns.editeur.org/onix/3.0/reference", type = Website.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shortname;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    protected String sourcename;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "AgentName" is used by two different parts of a schema. See: 
     * line 8678 of file:/C:/git/onix-creator/src/main/resources/v307/ONIX_BookProduct_3.0_reference.xsd
     * line 8676 of file:/C:/git/onix-creator/src/main/resources/v307/ONIX_BookProduct_3.0_reference.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
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
     * {@link TelephoneNumber }
     * {@link EmailAddress }
     * {@link FaxNumber }
     * {@link AgentRole }
     * {@link AgentName }
     * {@link AgentIdentifier }
     * {@link Website }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the refname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefname() {
        return refname;
    }

    /**
     * Sets the value of the refname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefname(String value) {
        this.refname = value;
    }

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the datestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestamp() {
        return datestamp;
    }

    /**
     * Sets the value of the datestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestamp(String value) {
        this.datestamp = value;
    }

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcetype() {
        return sourcetype;
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcetype(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the sourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcename() {
        return sourcename;
    }

    /**
     * Sets the value of the sourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcename(String value) {
        this.sourcename = value;
    }

}
