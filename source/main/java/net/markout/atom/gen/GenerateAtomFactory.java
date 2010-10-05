/*
	GenerateAtomFactory.java

	Author: David Fogel
	Copyright 2009 David Fogel
	All rights reserved.
*/

package net.markout.atom.gen;

import java.io.File;
import java.io.IOException;

import net.markout.gen.EnhancedFactoryGenerator;
import net.markout.gen.EnhancedFactoryGenerator.EmptyPolicy;
import net.markout.types.NamespaceURI;

import freemarker.template.TemplateException;

/**
 * GenerateAtomFactory
 * 
 * Comment here.
 */
public class GenerateAtomFactory {
	// *** Class Members ***
	static NamespaceURI ATOM = new NamespaceURI("http://www.w3.org/2005/Atom", "atom");
	static NamespaceURI XHTML = new NamespaceURI("http://www.w3.org/1999/xhtml", "xhtml");
	
	static String[] atom_els = {
		"name",
		"uri",
		"email",
		"feed",
		"entry",
		"content",
		"author",
		"category",
		"contributor",
		"generator",
		"icon",
		"id",
		"logo",
		"link",
		"published",
		"rights",
		"source",
		"subtitle",
		"summary",
		"title",
		"updated"
	};
	
	static String[] atom_atts = {
		"type",
		"src",
		"term",
		"scheme",
		"label",
		"uri",
		"version",
		"href",
		"rel",
		"hreflang",
		"title",
		"length"
	};
	
	public static void main(String[] args)  throws IOException, TemplateException {
		
		EnhancedFactoryGenerator gen = 
			new EnhancedFactoryGenerator(ATOM, "net.markout.atom", "Atom", "Atom", EmptyPolicy.any);
		
		gen.addExternalWriter(XHTML, "net.markout.xhtml.HtmlContentWriter", "net.markout.xhtml.HtmlContentWriterProxy");
		
		for (String el : atom_els)
			gen.addElement(ATOM.name(el));
		
		gen.addElement(XHTML.name("div"));
		
		for (String att : atom_atts)
			gen.addAttributeName(ATOM.name(att));
		
		gen.addAttributeName(NamespaceURI.XML_URI.name("base"));
		gen.addAttributeName(NamespaceURI.XML_URI.name("lang"));
		
		gen.addAttribute(ATOM.name("type").att("text"));
		gen.addAttribute(ATOM.name("type").att("html"));
		gen.addAttribute(ATOM.name("type").att("xhtml"));
		gen.addAttribute(ATOM.name("rel").att("alternate"));
		gen.addAttribute(ATOM.name("rel").att("enclosure"));
		gen.addAttribute(ATOM.name("rel").att("related"));
		gen.addAttribute(ATOM.name("rel").att("self"));
		gen.addAttribute(ATOM.name("rel").att("via"));
		
		gen.addRoot(ATOM.name("feed"));
		gen.addRoot(ATOM.name("entry"));
		
		File dir = new File("source/main/java/");
		
		gen.writeTo(dir);
	}
}
