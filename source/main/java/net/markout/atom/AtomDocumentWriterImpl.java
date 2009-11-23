/*
	AtomDocumentWriterImpl.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom;

import java.io.IOException;

//import net.markout.*;
import net.markout.support.*;
import net.markout.types.*;

import static net.markout.atom.Atom.*;

/**
 * AtomDocumentWriterImpl
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public class AtomDocumentWriterImpl extends BasicDocumentWriter implements AtomDocumentWriter {
	// *** Class Members ***
	

	// *** Constructors ***
	public AtomDocumentWriterImpl(EnhancedXMLOutputContext out) {super(out);}

	// *** Public Methods ***
	
	public AtomContentWriter entry() throws IOException {
		return (AtomContentWriter) rootElement(ENTRY);
	}
	public AtomContentWriter entry(Attribute... attributes) throws IOException {
		return (AtomContentWriter) rootElement(ENTRY, attributes);
	}
	public AtomContentWriter feed() throws IOException {
		return (AtomContentWriter) rootElement(FEED);
	}
	public AtomContentWriter feed(Attribute... attributes) throws IOException {
		return (AtomContentWriter) rootElement(FEED, attributes);
	}

	// *** Protected Methods ***
	protected BasicElementWriter createRootElementWriter(XMLOutputContext out) {
		return new AtomElementWriter((EnhancedXMLOutputContext) out);
	}

	// *** Package Methods ***

	// *** Private Methods ***

	// *** Private Classes ***
}



