/*
	APP.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom.app;

import java.io.*;

import net.markout.*;
import net.markout.support.*;
import net.markout.types.*;
import net.markout.atom.AtomContentWriterProxy;
import net.markout.xhtml.HtmlContentWriterProxy;

/**
 * APP
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public class APP extends DocumentWriterFactory {
	// *** Class Members ***
	public static final NamespaceURI NAMESPACE = new NamespaceURI("http://www.w3.org/2007/app");
	public static final NamespaceURI XML_NAMESPACE = new NamespaceURI("http://www.w3.org/XML/1998/namespace", "xml");
	public static final NamespaceURI ATOM_NAMESPACE = new NamespaceURI("http://www.w3.org/2005/Atom", "atom");
	public static final NamespaceURI XHTML_NAMESPACE = new NamespaceURI("http://www.w3.org/1999/xhtml", "xhtml");
	
	public static final Name XHTML_DIV = XHTML_NAMESPACE.name("div");
	public static final Name ATOM_CATEGORY = ATOM_NAMESPACE.name("category");
	public static final Name ATOM_TITLE = ATOM_NAMESPACE.name("title");
	public static final Name ACCEPT = NAMESPACE.name("accept");
	public static final Name CATEGORIES = NAMESPACE.name("categories");
	public static final Name COLLECTION = NAMESPACE.name("collection");
	public static final Name FIXED = NAMESPACE.name("fixed");
	public static final Name HREF = NAMESPACE.name("href");
	public static final Name SCHEME = NAMESPACE.name("scheme");
	public static final Name SERVICE = NAMESPACE.name("service");
	public static final Name WORKSPACE = NAMESPACE.name("workspace");
	public static final Name XML_BASE = XML_NAMESPACE.name("base");
	public static final Name XML_LANG = XML_NAMESPACE.name("lang");
	public static final Name XML_SPACE = XML_NAMESPACE.name("space");
	
	public static final Attribute FIXED_NO = FIXED.att("no");
	public static final Attribute FIXED_YES = FIXED.att("yes");
	public static final Attribute XML_SPACE_DEFAULT = XML_SPACE.att("default");
	public static final Attribute XML_SPACE_PRESERVE = XML_SPACE.att("preserve");
	
	
	public static final EmptyElementPolicy EMPTY_ELEMENT_POLICY = 
		EmptyElementPolicy.DEFAULT;

	// *** Public Methods ***
	
	public static APPDocumentWriterImpl appDocumentWriter(OutputStream out) throws IOException {
		return appDocumentWriter(out, "UTF-8");
	}
	
	public static APPDocumentWriterImpl appDocumentWriter(OutputStream out, String charset) throws IOException {
		return appDocumentWriter(new OSXMLChunkWriter(out, charset));
	}
	
	public static APPDocumentWriterImpl appDocumentWriter(Writer out) throws IOException {
		return appDocumentWriter(new WriterXMLChunkWriter(out));
	}
	
	public static APPDocumentWriterImpl appDocumentWriter(XMLChunkWriter out) throws IOException {
	
		EnhancedXMLOutputContext oc = new EnhancedXMLOutputContext(out);
		
		oc.registerEnhancedProxyType(AtomContentWriterProxy.class);
		oc.registerEnhancedProxyType(HtmlContentWriterProxy.class);
		
		oc.setEmptyElementPolicy(EMPTY_ELEMENT_POLICY);
		
		APPDocumentWriterImpl dw = new APPDocumentWriterImpl(oc);
		
		dw.defaultNamespace(NAMESPACE);
		
		return dw;
	}
	
}



