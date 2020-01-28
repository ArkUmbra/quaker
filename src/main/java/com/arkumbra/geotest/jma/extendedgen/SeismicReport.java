package com.arkumbra.geotest.jma.extendedgen;

import jp.go.kishou.xml.jmaxml1.TypeControl;
import jp.go.kishou.xml.jmaxml1.body.seismology1.TypeBody;
import jp.go.kishou.xml.jmaxml1.informationbasis1.TypeHead;

import javax.xml.bind.annotation.*;

/*
 A modified
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.report", propOrder = {
        "control",
        "head",
        "body"
})
public class SeismicReport {

    @XmlElement(name = "Control", required = true)
    protected TypeControl control;
    @XmlElement(name = "Head", namespace = "http://xml.kishou.go.jp/jmaxml1/informationBasis1/", required = true)
    protected TypeHead head;
    @XmlElement(name = "Body", namespace = "http://xml.kishou.go.jp/jmaxml1/body/seismology1/", required = true)
    protected TypeBody body;


    public TypeControl getControl() {
        return control;
    }

    public TypeHead getHead() {
        return head;
    }

    public TypeBody getBody() {
        return body;
    }

}
