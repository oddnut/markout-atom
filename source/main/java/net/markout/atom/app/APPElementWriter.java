/*
	APPElementWriter.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom.app;

import java.io.IOException;

//import net.markout.*;
import net.markout.support.*;
import net.markout.types.*;
import net.markout.atom.AtomContentWriter;
import net.markout.xhtml.HtmlContentWriter;

import static net.markout.atom.app.APP.*;

/**
 * APPElementWriter
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public class APPElementWriter extends EnhancedElementWriter implements APPContentWriter{
	// *** Class Members ***
	
	// *** Constructors ***
	public APPElementWriter(EnhancedXMLOutputContext out) {super(out);}

	// *** APPContentWriter Methods ***
	
	
	public HtmlContentWriter div() throws IOException {
		return ((APPElementWriter) element(XHTML_DIV)).as(HtmlContentWriter.class);
	}
	public HtmlContentWriter div(Attribute... attributes) throws IOException {
		return ((APPElementWriter) element(XHTML_DIV, attributes)).as(HtmlContentWriter.class);
	}
	
	
	
	public AtomContentWriter category() throws IOException {
		return ((APPElementWriter) element(ATOM_CATEGORY)).as(AtomContentWriter.class);
	}
	public AtomContentWriter category(Attribute... attributes) throws IOException {
		return ((APPElementWriter) element(ATOM_CATEGORY, attributes)).as(AtomContentWriter.class);
	}
	
	
	
	public AtomContentWriter title() throws IOException {
		return ((APPElementWriter) element(ATOM_TITLE)).as(AtomContentWriter.class);
	}
	public AtomContentWriter title(Attribute... attributes) throws IOException {
		return ((APPElementWriter) element(ATOM_TITLE, attributes)).as(AtomContentWriter.class);
	}
	
	
	
	public APPContentWriter accept() throws IOException {
		return (APPContentWriter) element(ACCEPT);
	}
	public APPContentWriter accept(Attribute... attributes) throws IOException {
		return (APPContentWriter) element(ACCEPT, attributes);
	}
	
	
	
	public APPContentWriter categories() throws IOException {
		return (APPContentWriter) element(CATEGORIES);
	}
	public APPContentWriter categories(Attribute... attributes) throws IOException {
		return (APPContentWriter) element(CATEGORIES, attributes);
	}
	
	
	
	public APPContentWriter collection() throws IOException {
		return (APPContentWriter) element(COLLECTION);
	}
	public APPContentWriter collection(Attribute... attributes) throws IOException {
		return (APPContentWriter) element(COLLECTION, attributes);
	}
	
	
	
	public APPContentWriter service() throws IOException {
		return (APPContentWriter) element(SERVICE);
	}
	public APPContentWriter service(Attribute... attributes) throws IOException {
		return (APPContentWriter) element(SERVICE, attributes);
	}
	
	
	
	public APPContentWriter workspace() throws IOException {
		return (APPContentWriter) element(WORKSPACE);
	}
	public APPContentWriter workspace(Attribute... attributes) throws IOException {
		return (APPContentWriter) element(WORKSPACE, attributes);
	}
	

	// *** Protected Methods ***
	protected BasicElementWriter createChildElementWriter(XMLOutputContext out) {
		return new APPElementWriter((EnhancedXMLOutputContext) out);
	}

	// *** Package Methods ***

	// *** Private Methods ***

	// *** Private Classes ***
}

