/*
	APPContentWriterProxy.java

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
 * APPContentWriterProxy
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public class APPContentWriterProxy extends EnhancedContentWriterProxy implements APPContentWriter{
	// *** Class Members ***
	
	// *** Constructors ***
	public APPContentWriterProxy(EnhancedElementWriter out) {super(out);}

	// *** APPContentWriter Methods ***
	
	public HtmlContentWriter div() throws IOException {
		return ((EnhancedElementWriter) target.element(XHTML_DIV)).as(HtmlContentWriter.class);
	}
	public HtmlContentWriter div(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(XHTML_DIV, attributes)).as(HtmlContentWriter.class);
	}
	
	public AtomContentWriter category() throws IOException {
		return ((EnhancedElementWriter) target.element(ATOM_CATEGORY)).as(AtomContentWriter.class);
	}
	public AtomContentWriter category(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(ATOM_CATEGORY, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter title() throws IOException {
		return ((EnhancedElementWriter) target.element(ATOM_TITLE)).as(AtomContentWriter.class);
	}
	public AtomContentWriter title(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(ATOM_TITLE, attributes)).as(AtomContentWriter.class);
	}
	
	public APPContentWriter accept() throws IOException {
		return ((EnhancedElementWriter) target.element(ACCEPT)).as(APPContentWriter.class);
	}
	public APPContentWriter accept(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(ACCEPT, attributes)).as(APPContentWriter.class);
	}
	
	public APPContentWriter categories() throws IOException {
		return ((EnhancedElementWriter) target.element(CATEGORIES)).as(APPContentWriter.class);
	}
	public APPContentWriter categories(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(CATEGORIES, attributes)).as(APPContentWriter.class);
	}
	
	public APPContentWriter collection() throws IOException {
		return ((EnhancedElementWriter) target.element(COLLECTION)).as(APPContentWriter.class);
	}
	public APPContentWriter collection(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(COLLECTION, attributes)).as(APPContentWriter.class);
	}
	
	public APPContentWriter service() throws IOException {
		return ((EnhancedElementWriter) target.element(SERVICE)).as(APPContentWriter.class);
	}
	public APPContentWriter service(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(SERVICE, attributes)).as(APPContentWriter.class);
	}
	
	public APPContentWriter workspace() throws IOException {
		return ((EnhancedElementWriter) target.element(WORKSPACE)).as(APPContentWriter.class);
	}
	public APPContentWriter workspace(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(WORKSPACE, attributes)).as(APPContentWriter.class);
	}

	// *** Protected Methods ***

	// *** Package Methods ***

	// *** Private Methods ***

	// *** Private Classes ***
}

