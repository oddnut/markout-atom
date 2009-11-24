/*
	APPDocumentWriter.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom.app;

import java.io.IOException;

import net.markout.*;
import net.markout.types.*;

/**
 * APPDocumentWriter
 * 
 * THIS IS A GENERATED FILE, DO NOT EDIT!
 */
public interface APPDocumentWriter extends DocumentWriter {
	// *** Class Members ***

	// *** Public Methods ***
	
	public APPContentWriter categories() throws IOException;
	public APPContentWriter categories(Attribute... attributes) throws IOException;
	public APPContentWriter service() throws IOException;
	public APPContentWriter service(Attribute... attributes) throws IOException;
	
}



