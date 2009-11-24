/*
	UseTest.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom;

import java.io.*;

import net.markout.support.IndentedWhitespacePolicy;

import static net.markout.atom.app.APP.*;
import net.markout.atom.app.APP;
import net.markout.atom.app.APPContentWriter;
import net.markout.atom.app.APPDocumentWriter;

/**
 * UseTest
 * 
 * Comment here.
 */
public class APPTest {
	// *** Class Members ***
	
	public static void main(String[] args) throws IOException {
		
		StringWriter sw = new StringWriter();
		
		APPDocumentWriter dw = APP.appDocumentWriter(sw);
		dw.setWhitespacePolicy(new IndentedWhitespacePolicy());
		dw.xmlVersion();
		
		dw.namespace(ATOM_NAMESPACE);
		
		APPContentWriter cats = dw.categories(FIXED_YES, SCHEME.att("http://example.com/cats/big3"));
		cats.category(Atom.TERM.att("animal"));
		cats.category(Atom.TERM.att("vegetable"));
		cats.category(Atom.TERM.att("mineral"));
		
		dw.close();
		
		System.out.println(sw.toString());
		
		// service test:
		
		sw = new StringWriter();
		
		dw = APP.appDocumentWriter(sw);
		dw.setWhitespacePolicy(new IndentedWhitespacePolicy());
		dw.xmlVersion();
		
		dw.namespace(ATOM_NAMESPACE);
		
		APPContentWriter service, ws, col;
		service = dw.service();
		
		ws = service.workspace();
		ws.title().text("Main Site");
		
		col = ws.collection(HREF.att("http://example.org/blog/main"));
		col.title().text("My Blog Entries");
		col.categories(HREF.att("http://example.com/cats/forMain.cats"));
		
		col = ws.collection(HREF.att("http://example.org/blog/pic"));
		col.title().text("Pictures");
		col.accept().text("image/png");
		col.accept().text("image/jpeg");
		col.accept().text("image/gif");
		
		ws = service.workspace();
		ws.title().text("Sidebar Blog");
		
		col = ws.collection(HREF.att("http://example.org/sidebar/list"));
		col.title().text("Remaindered Links");
		col.accept().text("application/atom+xml;type=entry");
		cats = col.categories(FIXED_YES);
		cats.category(Atom.SCHEME.att("http://example.org/extra-cats/"), Atom.TERM.att("joke"));
		cats.category(Atom.SCHEME.att("http://example.org/extra-cats/"), Atom.TERM.att("serious"));
		
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
