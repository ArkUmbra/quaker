package com.arkumbra.geotest.jma.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(namespace="http://abr.business.gov.au/ABRXMLSearch/", name="Feed")
@XmlRootElement(name="feed", namespace="http://www.w3.org/2005/Atom")
//@XmlRootElement
//@XmlType(propOrder = { "title", "subtitle", "entry"})
public class Feed {


    @XmlElement(name="title", namespace="http://www.w3.org/2005/Atom")
    private String title;

    @XmlElement(name="subtitle", namespace="http://www.w3.org/2005/Atom")
    private String subtitle;

    @XmlElement(name="entry", namespace="http://www.w3.org/2005/Atom")
    public List<Entry> entry;


    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }


    @Override
    public String toString() {
        return "Feed{" +
                "title=" + title +
                ", subtitle=" + subtitle +
                ", entry=" + entry +
                '}';
    }
}
