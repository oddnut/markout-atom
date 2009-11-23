/*
	AtomContentWriterProxy.java

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
 * AtomContentWriterProxy
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public class AtomContentWriterProxy extends EnhancedContentWriterProxy implements AtomContentWriter{
	// *** Class Members ***
	
	// *** Constructors ***
	public AtomContentWriterProxy(EnhancedElementWriter out) {super(out);}

	// *** AtomContentWriter Methods ***
	
	public HtmlContentWriter div() throws IOException {
		return ((EnhancedElementWriter) target.element(XHTML_DIV)).as(HtmlContentWriter.class);
	}
	public HtmlContentWriter div(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(XHTML_DIV, attributes)).as(HtmlContentWriter.class);
	}
	
	public AtomContentWriter author() throws IOException {
		return ((EnhancedElementWriter) target.element(AUTHOR)).as(AtomContentWriter.class);
	}
	public AtomContentWriter author(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(AUTHOR, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter category() throws IOException {
		return ((EnhancedElementWriter) target.element(CATEGORY)).as(AtomContentWriter.class);
	}
	public AtomContentWriter category(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(CATEGORY, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter content() throws IOException {
		return ((EnhancedElementWriter) target.element(CONTENT)).as(AtomContentWriter.class);
	}
	public AtomContentWriter content(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(CONTENT, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter contributor() throws IOException {
		return ((EnhancedElementWriter) target.element(CONTRIBUTOR)).as(AtomContentWriter.class);
	}
	public AtomContentWriter contributor(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(CONTRIBUTOR, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter email() throws IOException {
		return ((EnhancedElementWriter) target.element(EMAIL)).as(AtomContentWriter.class);
	}
	public AtomContentWriter email(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(EMAIL, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter entry() throws IOException {
		return ((EnhancedElementWriter) target.element(ENTRY)).as(AtomContentWriter.class);
	}
	public AtomContentWriter entry(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(ENTRY, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter feed() throws IOException {
		return ((EnhancedElementWriter) target.element(FEED)).as(AtomContentWriter.class);
	}
	public AtomContentWriter feed(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(FEED, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter generator() throws IOException {
		return ((EnhancedElementWriter) target.element(GENERATOR)).as(AtomContentWriter.class);
	}
	public AtomContentWriter generator(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(GENERATOR, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter icon() throws IOException {
		return ((EnhancedElementWriter) target.element(ICON)).as(AtomContentWriter.class);
	}
	public AtomContentWriter icon(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(ICON, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter id() throws IOException {
		return ((EnhancedElementWriter) target.element(ID)).as(AtomContentWriter.class);
	}
	public AtomContentWriter id(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(ID, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter link() throws IOException {
		return ((EnhancedElementWriter) target.element(LINK)).as(AtomContentWriter.class);
	}
	public AtomContentWriter link(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(LINK, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter logo() throws IOException {
		return ((EnhancedElementWriter) target.element(LOGO)).as(AtomContentWriter.class);
	}
	public AtomContentWriter logo(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(LOGO, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter name() throws IOException {
		return ((EnhancedElementWriter) target.element(NAME)).as(AtomContentWriter.class);
	}
	public AtomContentWriter name(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(NAME, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter published() throws IOException {
		return ((EnhancedElementWriter) target.element(PUBLISHED)).as(AtomContentWriter.class);
	}
	public AtomContentWriter published(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(PUBLISHED, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter rights() throws IOException {
		return ((EnhancedElementWriter) target.element(RIGHTS)).as(AtomContentWriter.class);
	}
	public AtomContentWriter rights(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(RIGHTS, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter source() throws IOException {
		return ((EnhancedElementWriter) target.element(SOURCE)).as(AtomContentWriter.class);
	}
	public AtomContentWriter source(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(SOURCE, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter subtitle() throws IOException {
		return ((EnhancedElementWriter) target.element(SUBTITLE)).as(AtomContentWriter.class);
	}
	public AtomContentWriter subtitle(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(SUBTITLE, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter summary() throws IOException {
		return ((EnhancedElementWriter) target.element(SUMMARY)).as(AtomContentWriter.class);
	}
	public AtomContentWriter summary(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(SUMMARY, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter title() throws IOException {
		return ((EnhancedElementWriter) target.element(TITLE)).as(AtomContentWriter.class);
	}
	public AtomContentWriter title(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(TITLE, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter updated() throws IOException {
		return ((EnhancedElementWriter) target.element(UPDATED)).as(AtomContentWriter.class);
	}
	public AtomContentWriter updated(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(UPDATED, attributes)).as(AtomContentWriter.class);
	}
	
	public AtomContentWriter uri() throws IOException {
		return ((EnhancedElementWriter) target.element(URI)).as(AtomContentWriter.class);
	}
	public AtomContentWriter uri(Attribute... attributes) throws IOException {
		return ((EnhancedElementWriter) target.element(URI, attributes)).as(AtomContentWriter.class);
	}

	// *** Protected Methods ***

	// *** Package Methods ***

	// *** Private Methods ***

	// *** Private Classes ***
}

