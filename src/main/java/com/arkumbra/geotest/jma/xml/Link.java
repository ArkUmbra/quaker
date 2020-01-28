package com.arkumbra.geotest.jma.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="link", namespace="http://www.w3.org/2005/Atom")
public class Link {

    @XmlAttribute(name = "href")
    private String href;

    public String getHref() {
        return href;
    }

    @Override
    public String toString() {
        return "Link{" +
                "href='" + href + '\'' +
                '}';
    }
}
