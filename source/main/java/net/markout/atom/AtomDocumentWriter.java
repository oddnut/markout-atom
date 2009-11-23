/*
	AtomDocumentWriter.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom;

import java.io.IOException;

import net.markout.*;
import net.markout.types.*;

/**
 * AtomDocumentWriter
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public interface AtomDocumentWriter extends DocumentWriter {
	// *** Class Members ***

	// *** Public Methods ***
	
	public AtomContentWriter entry() throws IOException;
	public AtomContentWriter entry(Attribute... attributes) throws IOException;
	public AtomContentWriter feed() throws IOException;
	public AtomContentWriter feed(Attribute... attributes) throws IOException;
	
}



