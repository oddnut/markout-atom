/*
	AtomContentWriter.java

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

/**
 * AtomContentWriter
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public interface AtomContentWriter extends EnhancedContentWriter {
	// *** Class Members ***

	// *** Public Methods ***
	public HtmlContentWriter div() throws IOException;
	public HtmlContentWriter div(Attribute... attributes) throws IOException;
	public AtomContentWriter author() throws IOException;
	public AtomContentWriter author(Attribute... attributes) throws IOException;
	public AtomContentWriter category() throws IOException;
	public AtomContentWriter category(Attribute... attributes) throws IOException;
	public AtomContentWriter content() throws IOException;
	public AtomContentWriter content(Attribute... attributes) throws IOException;
	public AtomContentWriter contributor() throws IOException;
	public AtomContentWriter contributor(Attribute... attributes) throws IOException;
	public AtomContentWriter email() throws IOException;
	public AtomContentWriter email(Attribute... attributes) throws IOException;
	public AtomContentWriter entry() throws IOException;
	public AtomContentWriter entry(Attribute... attributes) throws IOException;
	public AtomContentWriter feed() throws IOException;
	public AtomContentWriter feed(Attribute... attributes) throws IOException;
	public AtomContentWriter generator() throws IOException;
	public AtomContentWriter generator(Attribute... attributes) throws IOException;
	public AtomContentWriter icon() throws IOException;
	public AtomContentWriter icon(Attribute... attributes) throws IOException;
	public AtomContentWriter id() throws IOException;
	public AtomContentWriter id(Attribute... attributes) throws IOException;
	public AtomContentWriter link() throws IOException;
	public AtomContentWriter link(Attribute... attributes) throws IOException;
	public AtomContentWriter logo() throws IOException;
	public AtomContentWriter logo(Attribute... attributes) throws IOException;
	public AtomContentWriter name() throws IOException;
	public AtomContentWriter name(Attribute... attributes) throws IOException;
	public AtomContentWriter published() throws IOException;
	public AtomContentWriter published(Attribute... attributes) throws IOException;
	public AtomContentWriter rights() throws IOException;
	public AtomContentWriter rights(Attribute... attributes) throws IOException;
	public AtomContentWriter source() throws IOException;
	public AtomContentWriter source(Attribute... attributes) throws IOException;
	public AtomContentWriter subtitle() throws IOException;
	public AtomContentWriter subtitle(Attribute... attributes) throws IOException;
	public AtomContentWriter summary() throws IOException;
	public AtomContentWriter summary(Attribute... attributes) throws IOException;
	public AtomContentWriter title() throws IOException;
	public AtomContentWriter title(Attribute... attributes) throws IOException;
	public AtomContentWriter updated() throws IOException;
	public AtomContentWriter updated(Attribute... attributes) throws IOException;
	public AtomContentWriter uri() throws IOException;
	public AtomContentWriter uri(Attribute... attributes) throws IOException;
}

