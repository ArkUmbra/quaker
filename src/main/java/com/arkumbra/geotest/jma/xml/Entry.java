package com.arkumbra.geotest.jma.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="entry", namespace="http://www.w3.org/2005/Atom")
public class Entry {
    @XmlElement(name="title", namespace="http://www.w3.org/2005/Atom", required = true)
    public String title;

    @XmlElement(name="id", namespace="http://www.w3.org/2005/Atom", required = true)
    public String id;

    @Override
    public String toString() {
        return "Entry{" +
                "title='" + title + '\'' +
                '}';
    }
}
