/*
	GenerateAPPFactory.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom.gen;

import java.io.File;
import java.io.IOException;

import net.markout.gen.EnhancedFactoryGenerator;
import net.markout.gen.EnhancedFactoryGenerator.EmptyPolicy;
import net.markout.types.Attribute;
import net.markout.types.Name;
import net.markout.types.NamespaceURI;

import freemarker.template.TemplateException;

/**
 * GenerateAPPFactory.java
 * 
 * Comment here.
 */
public class GenerateAPPFactory {
	// *** Class Members ***
	static NamespaceURI APP = new NamespaceURI("http://www.w3.org/2007/app");
	static NamespaceURI ATOM = new NamespaceURI("http://www.w3.org/2005/Atom", "atom");
	static NamespaceURI XHTML = new NamespaceURI("http://www.w3.org/1999/xhtml", "xhtml");
	
	// element names
	static Name SERVICE = APP.name("service");
	static Name WORKSPACE = APP.name("workspace");
	static Name COLLECTION = APP.name("collection");
	static Name CATEGORIES = APP.name("categories");
	static Name ACCEPT = APP.name("accept");
	
	static Name TITLE = ATOM.name("title");
	static Name CATEGORY = ATOM.name("category");
	
	static Name BASE = NamespaceURI.XML_URI.name("base");
	static Name LANG = NamespaceURI.XML_URI.name("lang");
	static Name SPACE = NamespaceURI.XML_URI.name("space");
	
	// attribute names
	static Name HREF = APP.name("href");
	static Name FIXED = APP.name("fixed");
	static Name SCHEME = APP.name("scheme");
	
	// attribute values
	static Attribute SPACE_DEFAULT = SPACE.att("default");
	static Attribute SPACE_PRESERVE = SPACE.att("preserve");
	
	static Attribute FIXED_YES = FIXED.att("yes");
	static Attribute FIXED_NO = FIXED.att("no");
	
	public static void main(String[] args)  throws IOException, TemplateException {
		
		EnhancedFactoryGenerator gen = 
			new EnhancedFactoryGenerator(APP, "net.markout.atom.app", "APP", "APP", EmptyPolicy.any);
		
		gen.addExternalWriter(ATOM, "net.markout.atom.AtomContentWriter", "net.markout.atom.AtomContentWriterProxy");
		gen.addExternalWriter(XHTML, "net.markout.xhtml.HtmlContentWriter", "net.markout.xhtml.HtmlContentWriterProxy");
		
		gen.addElement(SERVICE);
		gen.addElement(WORKSPACE);
		gen.addElement(COLLECTION);
		gen.addElement(CATEGORIES);
		gen.addElement(ACCEPT);
		
		gen.addElement(TITLE);
		gen.addElement(CATEGORY);
		
		gen.addElement(XHTML.name("div"));
		
		gen.addAttributeName(HREF);
		gen.addAttributeName(FIXED);
		gen.addAttributeName(SCHEME);
		
		gen.addAttributeName(BASE);
		gen.addAttributeName(LANG);
		gen.addAttributeName(SPACE);
		
		gen.addAttribute(SPACE_DEFAULT);
		gen.addAttribute(SPACE_PRESERVE);
		
		gen.addAttribute(FIXED_YES);
		gen.addAttribute(FIXED_NO);
		
		gen.addRoot(SERVICE);
		gen.addRoot(CATEGORIES);
		
		File dir = new File("source/main/java/");
		
		gen.writeTo(dir);
	}
}
