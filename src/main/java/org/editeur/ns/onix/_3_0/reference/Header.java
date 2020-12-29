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
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Sender"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Addressee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}MessageNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}MessageRepeat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}SentDateTime"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}MessageNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}DefaultLanguageOfText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}DefaultPriceType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}DefaultCurrencyCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/reference}generalAttributes"/&gt;
 *       &lt;attribute name="refname"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Header"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="shortname"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="header"/&gt;
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
    "sender",
    "addressee",
    "messageNumber",
    "messageRepeat",
    "sentDateTime",
    "messageNote",
    "defaultLanguageOfText",
    "defaultPriceType",
    "defaultCurrencyCode"
})
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(name = "Sender", required = true)
    protected Sender sender;
    @XmlElement(name = "Addressee")
    protected List<Addressee> addressee;
    @XmlElement(name = "MessageNumber")
    protected MessageNumber messageNumber;
    @XmlElement(name = "MessageRepeat")
    protected MessageRepeat messageRepeat;
    @XmlElement(name = "SentDateTime", required = true)
    protected SentDateTime sentDateTime;
    @XmlElement(name = "MessageNote")
    protected List<MessageNote> messageNote;
    @XmlElement(name = "DefaultLanguageOfText")
    protected DefaultLanguageOfText defaultLanguageOfText;
    @XmlElement(name = "DefaultPriceType")
    protected DefaultPriceType defaultPriceType;
    @XmlElement(name = "DefaultCurrencyCode")
    protected DefaultCurrencyCode defaultCurrencyCode;
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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addressee }
     * 
     * 
     */
    public List<Addressee> getAddressee() {
        if (addressee == null) {
            addressee = new ArrayList<Addressee>();
        }
        return this.addressee;
    }

    /**
     * Gets the value of the messageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MessageNumber }
     *     
     */
    public MessageNumber getMessageNumber() {
        return messageNumber;
    }

    /**
     * Sets the value of the messageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageNumber }
     *     
     */
    public void setMessageNumber(MessageNumber value) {
        this.messageNumber = value;
    }

    /**
     * Gets the value of the messageRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link MessageRepeat }
     *     
     */
    public MessageRepeat getMessageRepeat() {
        return messageRepeat;
    }

    /**
     * Sets the value of the messageRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRepeat }
     *     
     */
    public void setMessageRepeat(MessageRepeat value) {
        this.messageRepeat = value;
    }

    /**
     * Gets the value of the sentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link SentDateTime }
     *     
     */
    public SentDateTime getSentDateTime() {
        return sentDateTime;
    }

    /**
     * Sets the value of the sentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SentDateTime }
     *     
     */
    public void setSentDateTime(SentDateTime value) {
        this.sentDateTime = value;
    }

    /**
     * Gets the value of the messageNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageNote }
     * 
     * 
     */
    public List<MessageNote> getMessageNote() {
        if (messageNote == null) {
            messageNote = new ArrayList<MessageNote>();
        }
        return this.messageNote;
    }

    /**
     * Gets the value of the defaultLanguageOfText property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultLanguageOfText }
     *     
     */
    public DefaultLanguageOfText getDefaultLanguageOfText() {
        return defaultLanguageOfText;
    }

    /**
     * Sets the value of the defaultLanguageOfText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultLanguageOfText }
     *     
     */
    public void setDefaultLanguageOfText(DefaultLanguageOfText value) {
        this.defaultLanguageOfText = value;
    }

    /**
     * Gets the value of the defaultPriceType property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultPriceType }
     *     
     */
    public DefaultPriceType getDefaultPriceType() {
        return defaultPriceType;
    }

    /**
     * Sets the value of the defaultPriceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultPriceType }
     *     
     */
    public void setDefaultPriceType(DefaultPriceType value) {
        this.defaultPriceType = value;
    }

    /**
     * Gets the value of the defaultCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultCurrencyCode }
     *     
     */
    public DefaultCurrencyCode getDefaultCurrencyCode() {
        return defaultCurrencyCode;
    }

    /**
     * Sets the value of the defaultCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultCurrencyCode }
     *     
     */
    public void setDefaultCurrencyCode(DefaultCurrencyCode value) {
        this.defaultCurrencyCode = value;
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
