package com.axonivy.connector.telsearch;

import java.util.List;

import org.w3c.dom.Element;

import cz.jirutka.atom.jaxb.Entry;

public class TelSearchApiHelper {

  public static List<String> createMatchList(List<Entry<?>> entries) {
    return entries.stream()
            .map(Entry<?>::getContent)
            .map(Element.class::cast)
            .map(Element::getTextContent)
            .toList();
  }

}
