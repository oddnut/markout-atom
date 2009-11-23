/*
	AtomElementWriter.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom;

import java.io.IOException;

//import net.markout.*;
import net.markout.support.*;
import net.markout.types.*;
import net.markout.xhtml.HtmlContentWriter;

import static net.markout.atom.Atom.*;

/**
 * AtomElementWriter
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public class AtomElementWriter extends EnhancedElementWriter implements AtomContentWriter{
	// *** Class Members ***
	
	// *** Constructors ***
	public AtomElementWriter(EnhancedXMLOutputContext out) {super(out);}

	// *** AtomContentWriter Methods ***
	
	
	public HtmlContentWriter div() throws IOException {
		return ((AtomElementWriter) element(XHTML_DIV)).as(HtmlContentWriter.class);
	}
	public HtmlContentWriter div(Attribute... attributes) throws IOException {
		return ((AtomElementWriter) element(XHTML_DIV, attributes)).as(HtmlContentWriter.class);
	}
	
	
	
	public AtomContentWriter author() throws IOException {
		return (AtomContentWriter) element(AUTHOR);
	}
	public AtomContentWriter author(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(AUTHOR, attributes);
	}
	
	
	
	public AtomContentWriter category() throws IOException {
		return (AtomContentWriter) element(CATEGORY);
	}
	public AtomContentWriter category(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(CATEGORY, attributes);
	}
	
	
	
	public AtomContentWriter content() throws IOException {
		return (AtomContentWriter) element(CONTENT);
	}
	public AtomContentWriter content(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(CONTENT, attributes);
	}
	
	
	
	public AtomContentWriter contributor() throws IOException {
		return (AtomContentWriter) element(CONTRIBUTOR);
	}
	public AtomContentWriter contributor(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(CONTRIBUTOR, attributes);
	}
	
	
	
	public AtomContentWriter email() throws IOException {
		return (AtomContentWriter) element(EMAIL);
	}
	public AtomContentWriter email(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(EMAIL, attributes);
	}
	
	
	
	public AtomContentWriter entry() throws IOException {
		return (AtomContentWriter) element(ENTRY);
	}
	public AtomContentWriter entry(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(ENTRY, attributes);
	}
	
	
	
	public AtomContentWriter feed() throws IOException {
		return (AtomContentWriter) element(FEED);
	}
	public AtomContentWriter feed(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(FEED, attributes);
	}
	
	
	
	public AtomContentWriter generator() throws IOException {
		return (AtomContentWriter) element(GENERATOR);
	}
	public AtomContentWriter generator(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(GENERATOR, attributes);
	}
	
	
	
	public AtomContentWriter icon() throws IOException {
		return (AtomContentWriter) element(ICON);
	}
	public AtomContentWriter icon(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(ICON, attributes);
	}
	
	
	
	public AtomContentWriter id() throws IOException {
		return (AtomContentWriter) element(ID);
	}
	public AtomContentWriter id(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(ID, attributes);
	}
	
	
	
	public AtomContentWriter link() throws IOException {
		return (AtomContentWriter) element(LINK);
	}
	public AtomContentWriter link(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(LINK, attributes);
	}
	
	
	
	public AtomContentWriter logo() throws IOException {
		return (AtomContentWriter) element(LOGO);
	}
	public AtomContentWriter logo(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(LOGO, attributes);
	}
	
	
	
	public AtomContentWriter name() throws IOException {
		return (AtomContentWriter) element(NAME);
	}
	public AtomContentWriter name(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(NAME, attributes);
	}
	
	
	
	public AtomContentWriter published() throws IOException {
		return (AtomContentWriter) element(PUBLISHED);
	}
	public AtomContentWriter published(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(PUBLISHED, attributes);
	}
	
	
	
	public AtomContentWriter rights() throws IOException {
		return (AtomContentWriter) element(RIGHTS);
	}
	public AtomContentWriter rights(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(RIGHTS, attributes);
	}
	
	
	
	public AtomContentWriter source() throws IOException {
		return (AtomContentWriter) element(SOURCE);
	}
	public AtomContentWriter source(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(SOURCE, attributes);
	}
	
	
	
	public AtomContentWriter subtitle() throws IOException {
		return (AtomContentWriter) element(SUBTITLE);
	}
	public AtomContentWriter subtitle(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(SUBTITLE, attributes);
	}
	
	
	
	public AtomContentWriter summary() throws IOException {
		return (AtomContentWriter) element(SUMMARY);
	}
	public AtomContentWriter summary(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(SUMMARY, attributes);
	}
	
	
	
	public AtomContentWriter title() throws IOException {
		return (AtomContentWriter) element(TITLE);
	}
	public AtomContentWriter title(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(TITLE, attributes);
	}
	
	
	
	public AtomContentWriter updated() throws IOException {
		return (AtomContentWriter) element(UPDATED);
	}
	public AtomContentWriter updated(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(UPDATED, attributes);
	}
	
	
	
	public AtomContentWriter uri() throws IOException {
		return (AtomContentWriter) element(URI);
	}
	public AtomContentWriter uri(Attribute... attributes) throws IOException {
		return (AtomContentWriter) element(URI, attributes);
	}
	

	// *** Protected Methods ***
	protected BasicElementWriter createChildElementWriter(XMLOutputContext out) {
		return new AtomElementWriter((EnhancedXMLOutputContext) out);
	}

	// *** Package Methods ***

	// *** Private Methods ***

	// *** Private Classes ***
}

