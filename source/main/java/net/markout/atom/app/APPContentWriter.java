/*
	APPContentWriter.java

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

/**
 * APPContentWriter
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public interface APPContentWriter extends EnhancedContentWriter {
	// *** Class Members ***

	// *** Public Methods ***
	public HtmlContentWriter div() throws IOException;
	public HtmlContentWriter div(Attribute... attributes) throws IOException;
	public AtomContentWriter category() throws IOException;
	public AtomContentWriter category(Attribute... attributes) throws IOException;
	public AtomContentWriter title() throws IOException;
	public AtomContentWriter title(Attribute... attributes) throws IOException;
	public APPContentWriter accept() throws IOException;
	public APPContentWriter accept(Attribute... attributes) throws IOException;
	public APPContentWriter categories() throws IOException;
	public APPContentWriter categories(Attribute... attributes) throws IOException;
	public APPContentWriter collection() throws IOException;
	public APPContentWriter collection(Attribute... attributes) throws IOException;
	public APPContentWriter service() throws IOException;
	public APPContentWriter service(Attribute... attributes) throws IOException;
	public APPContentWriter workspace() throws IOException;
	public APPContentWriter workspace(Attribute... attributes) throws IOException;
}

