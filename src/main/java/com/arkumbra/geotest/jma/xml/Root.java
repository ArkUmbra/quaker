package com.arkumbra.geotest.jma.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="feed", namespace="http://www.w3.org/2005/Atom")
public class Root {

    @XmlElement
    Feed feed;

    @Override
    public String toString() {
        return "Root{" +
                "feed=" + feed +
                '}';
    }
}
