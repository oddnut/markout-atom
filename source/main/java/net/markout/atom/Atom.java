/*
	Atom.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom;

import java.io.*;

import net.markout.*;
import net.markout.support.*;
import net.markout.types.*;
import net.markout.xhtml.HtmlContentWriterProxy;

/**
 * Atom
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public class Atom extends DocumentWriterFactory {
	// *** Class Members ***
	public static final NamespaceURI NAMESPACE = new NamespaceURI("http://www.w3.org/2005/Atom");
	public static final NamespaceURI XML_NAMESPACE = new NamespaceURI("http://www.w3.org/XML/1998/namespace", "xml");
	public static final NamespaceURI XHTML_NAMESPACE = new NamespaceURI("http://www.w3.org/1999/xhtml", "xhtml");
	
	public static final Name XHTML_DIV = XHTML_NAMESPACE.name("div");
	public static final Name AUTHOR = NAMESPACE.name("author");
	public static final Name CATEGORY = NAMESPACE.name("category");
	public static final Name CONTENT = NAMESPACE.name("content");
	public static final Name CONTRIBUTOR = NAMESPACE.name("contributor");
	public static final Name EMAIL = NAMESPACE.name("email");
	public static final Name ENTRY = NAMESPACE.name("entry");
	public static final Name FEED = NAMESPACE.name("feed");
	public static final Name GENERATOR = NAMESPACE.name("generator");
	public static final Name HREF = NAMESPACE.name("href");
	public static final Name HREFLANG = NAMESPACE.name("hreflang");
	public static final Name ICON = NAMESPACE.name("icon");
	public static final Name ID = NAMESPACE.name("id");
	public static final Name LABEL = NAMESPACE.name("label");
	public static final Name LENGTH = NAMESPACE.name("length");
	public static final Name LINK = NAMESPACE.name("link");
	public static final Name LOGO = NAMESPACE.name("logo");
	public static final Name NAME = NAMESPACE.name("name");
	public static final Name PUBLISHED = NAMESPACE.name("published");
	public static final Name REL = NAMESPACE.name("rel");
	public static final Name RIGHTS = NAMESPACE.name("rights");
	public static final Name SCHEME = NAMESPACE.name("scheme");
	public static final Name SOURCE = NAMESPACE.name("source");
	public static final Name SRC = NAMESPACE.name("src");
	public static final Name SUBTITLE = NAMESPACE.name("subtitle");
	public static final Name SUMMARY = NAMESPACE.name("summary");
	public static final Name TERM = NAMESPACE.name("term");
	public static final Name TITLE = NAMESPACE.name("title");
	public static final Name TYPE = NAMESPACE.name("type");
	public static final Name UPDATED = NAMESPACE.name("updated");
	public static final Name URI = NAMESPACE.name("uri");
	public static final Name VERSION = NAMESPACE.name("version");
	public static final Name XML_BASE = XML_NAMESPACE.name("base");
	public static final Name XML_LANG = XML_NAMESPACE.name("lang");
	
	public static final Attribute REL_ALTERNATE = REL.att("alternate");
	public static final Attribute REL_ENCLOSURE = REL.att("enclosure");
	public static final Attribute REL_RELATED = REL.att("related");
	public static final Attribute REL_SELF = REL.att("self");
	public static final Attribute REL_VIA = REL.att("via");
	public static final Attribute TYPE_HTML = TYPE.att("html");
	public static final Attribute TYPE_TEXT = TYPE.att("text");
	public static final Attribute TYPE_XHTML = TYPE.att("xhtml");
	
	
	public static final EmptyElementPolicy EMPTY_ELEMENT_POLICY = 
		EmptyElementPolicy.DEFAULT;

	// *** Public Methods ***
	
	public static AtomDocumentWriterImpl atomDocumentWriter(OutputStream out) throws IOException {
		return atomDocumentWriter(out, "UTF-8");
	}
	
	public static AtomDocumentWriterImpl atomDocumentWriter(OutputStream out, String charset) throws IOException {
		return atomDocumentWriter(new OSXMLChunkWriter(out, charset));
	}
	
	public static AtomDocumentWriterImpl atomDocumentWriter(Writer out) throws IOException {
		return atomDocumentWriter(new WriterXMLChunkWriter(out));
	}
	
	public static AtomDocumentWriterImpl atomDocumentWriter(XMLChunkWriter out) throws IOException {
	
		EnhancedXMLOutputContext oc = new EnhancedXMLOutputContext(out);
		
		oc.registerEnhancedProxyType(HtmlContentWriterProxy.class);
		
		oc.setEmptyElementPolicy(EMPTY_ELEMENT_POLICY);
		
		AtomDocumentWriterImpl dw = new AtomDocumentWriterImpl(oc);
		
		dw.defaultNamespace(NAMESPACE);
		
		return dw;
	}
	
}



