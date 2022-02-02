package org.example;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class JaxbUnknownAdapter extends XmlAdapter<Object, Object> {

    @Override
    public Object marshal(Object obj) throws Exception {
        System.out.println("JaxbUnknownAdapter : marshal");
        return obj;
    }

    @Override
    public Object unmarshal(Object obj) throws Exception {
        System.out.println("JaxbUnknownAdapter : unmarshal");
        return obj;
    }

}
