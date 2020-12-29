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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}NameType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}NameIdentifier" maxOccurs="unbounded"/&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;sequence&gt;
 *                 &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.unstructured_name"/&gt;
 *                 &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.structured_name" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Gender" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;sequence&gt;
 *                 &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.structured_name"/&gt;
 *                 &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Gender" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.corporate_name"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;choice&gt;
 *               &lt;sequence&gt;
 *                 &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.unstructured_name"/&gt;
 *                 &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.structured_name" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Gender" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;sequence&gt;
 *                 &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.structured_name"/&gt;
 *                 &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Gender" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.corporate_name"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}AlternativeName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}SubjectDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ProfessionalAffiliation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/reference}generalAttributes"/&gt;
 *       &lt;attribute name="refname"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="NameAsSubject"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="shortname"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="nameassubject"/&gt;
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
@XmlRootElement(name = "NameAsSubject")
public class NameAsSubject {

    @XmlElementRefs({
        @XmlElementRef(name = "PersonNameInverted", namespace = "http://ns.editeur.org/onix/3.0/reference", type = PersonNameInverted.class, required = false),
        @XmlElementRef(name = "TitlesBeforeNames", namespace = "http://ns.editeur.org/onix/3.0/reference", type = TitlesBeforeNames.class, required = false),
        @XmlElementRef(name = "TitlesAfterNames", namespace = "http://ns.editeur.org/onix/3.0/reference", type = TitlesAfterNames.class, required = false),
        @XmlElementRef(name = "CorporateNameInverted", namespace = "http://ns.editeur.org/onix/3.0/reference", type = CorporateNameInverted.class, required = false),
        @XmlElementRef(name = "KeyNames", namespace = "http://ns.editeur.org/onix/3.0/reference", type = KeyNames.class, required = false),
        @XmlElementRef(name = "SuffixToKey", namespace = "http://ns.editeur.org/onix/3.0/reference", type = SuffixToKey.class, required = false),
        @XmlElementRef(name = "ProfessionalAffiliation", namespace = "http://ns.editeur.org/onix/3.0/reference", type = ProfessionalAffiliation.class, required = false),
        @XmlElementRef(name = "PersonName", namespace = "http://ns.editeur.org/onix/3.0/reference", type = PersonName.class, required = false),
        @XmlElementRef(name = "Gender", namespace = "http://ns.editeur.org/onix/3.0/reference", type = Gender.class, required = false),
        @XmlElementRef(name = "NamesAfterKey", namespace = "http://ns.editeur.org/onix/3.0/reference", type = NamesAfterKey.class, required = false),
        @XmlElementRef(name = "NameIdentifier", namespace = "http://ns.editeur.org/onix/3.0/reference", type = NameIdentifier.class, required = false),
        @XmlElementRef(name = "NamesBeforeKey", namespace = "http://ns.editeur.org/onix/3.0/reference", type = NamesBeforeKey.class, required = false),
        @XmlElementRef(name = "SubjectDate", namespace = "http://ns.editeur.org/onix/3.0/reference", type = SubjectDate.class, required = false),
        @XmlElementRef(name = "AlternativeName", namespace = "http://ns.editeur.org/onix/3.0/reference", type = AlternativeName.class, required = false),
        @XmlElementRef(name = "LettersAfterNames", namespace = "http://ns.editeur.org/onix/3.0/reference", type = LettersAfterNames.class, required = false),
        @XmlElementRef(name = "PrefixToKey", namespace = "http://ns.editeur.org/onix/3.0/reference", type = PrefixToKey.class, required = false),
        @XmlElementRef(name = "NameType", namespace = "http://ns.editeur.org/onix/3.0/reference", type = NameType.class, required = false),
        @XmlElementRef(name = "CorporateName", namespace = "http://ns.editeur.org/onix/3.0/reference", type = CorporateName.class, required = false)
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
     * The field name "PersonNameInverted" is used by two different parts of a schema. See: 
     * line 12802 of file:/C:/git/onix-creator/src/main/resources/v307/ONIX_BookProduct_3.0_reference.xsd
     * line 12800 of file:/C:/git/onix-creator/src/main/resources/v307/ONIX_BookProduct_3.0_reference.xsd
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
     * {@link PersonNameInverted }
     * {@link TitlesBeforeNames }
     * {@link TitlesAfterNames }
     * {@link CorporateNameInverted }
     * {@link KeyNames }
     * {@link SuffixToKey }
     * {@link ProfessionalAffiliation }
     * {@link PersonName }
     * {@link Gender }
     * {@link NamesAfterKey }
     * {@link NameIdentifier }
     * {@link NamesBeforeKey }
     * {@link SubjectDate }
     * {@link AlternativeName }
     * {@link LettersAfterNames }
     * {@link PrefixToKey }
     * {@link NameType }
     * {@link CorporateName }
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
