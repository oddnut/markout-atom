/*
	UseTest.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom;

import java.io.*;

import net.markout.support.IndentedWhitespacePolicy;

import static net.markout.atom.Atom.*;

/**
 * UseTest
 * 
 * Comment here.
 */
public class UseTest {
	// *** Class Members ***
	
	public static void main(String[] args) throws IOException {
		
		StringWriter sw = new StringWriter();
		
		AtomDocumentWriter dw = Atom.atomDocumentWriter(sw);
		dw.setWhitespacePolicy(new IndentedWhitespacePolicy());
		dw.xmlVersion();
		
		AtomContentWriter feed = dw.feed();
		
		feed.title().text("Example Feed");
		feed.link(HREF.att("http://example.org/"));
		feed.updated().text("2003-12-13T18:30:02Z"); // should be DateTime?
		feed.author().name().text("John Doe");
		feed.id().text("urn:uuid:60a76c80-d399-11d9-b93C-0003939e0af6");
		
		AtomContentWriter entry = feed.entry();
		
		entry.title().text("Atom-Powered Robots Run Amok");
		entry.link(HREF.att("http://example.org/2003/12/13/atom03"));
		entry.id().text("urn:uuid:1225c695-cfb8-4ebb-aaaa-80da344efa6a");
		entry.updated().text("2003-12-13T18:30:02Z");
		entry.summary().text("Some text.");
		AtomContentWriter content = entry.content(TYPE_XHTML, XML_LANG.att("en"));
		//content.defaultNamespace(XHTML_NAMESPACE);
		content.div().p().i().text("Here's the content!");
		
		dw.close();
		
		System.out.println(sw.toString());
	}

	// *** Instance Members ***

	// *** Constructors ***

	// *** Interface Methods ***

	// *** Public Methods ***

	// *** Protected Methods ***

	// *** Package Methods ***

	// *** Private Methods ***

	// *** Private Classes ***
}
