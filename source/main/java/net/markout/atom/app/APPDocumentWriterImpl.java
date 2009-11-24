/*
	APPDocumentWriterImpl.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom.app;

import java.io.IOException;

//import net.markout.*;
import net.markout.support.*;
import net.markout.types.*;

import static net.markout.atom.app.APP.*;

/**
 * APPDocumentWriterImpl
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public class APPDocumentWriterImpl extends BasicDocumentWriter implements APPDocumentWriter {
	// *** Class Members ***
	

	// *** Constructors ***
	public APPDocumentWriterImpl(EnhancedXMLOutputContext out) {super(out);}

	// *** Public Methods ***
	
	public APPContentWriter categories() throws IOException {
		return (APPContentWriter) rootElement(CATEGORIES);
	}
	public APPContentWriter categories(Attribute... attributes) throws IOException {
		return (APPContentWriter) rootElement(CATEGORIES, attributes);
	}
	public APPContentWriter service() throws IOException {
		return (APPContentWriter) rootElement(SERVICE);
	}
	public APPContentWriter service(Attribute... attributes) throws IOException {
		return (APPContentWriter) rootElement(SERVICE, attributes);
	}

	// *** Protected Methods ***
	protected BasicElementWriter createRootElementWriter(XMLOutputContext out) {
		return new APPElementWriter((EnhancedXMLOutputContext) out);
	}

	// *** Package Methods ***

	// *** Private Methods ***

	// *** Private Classes ***
}



