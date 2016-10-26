package com.javasolutions.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;



public final class TilesDefinitionsConfig implements DefinitionsFactory {
	private static final Map<String, Definition> tilesDefinitions = new HashMap<String, Definition>();
	
	public Definition getDefinition(String name, org.apache.tiles.request.Request tilesContext) {
		return tilesDefinitions.get(name);
		
	}

	/**
	 * @param name
	 *            <code>Name of the view</code>
	 * 
	 * @param title
	 *            <code>Page title</code>
	 * @param body
	 *            <code>Body JSP file path</code>
	 * 
	 *            <code>Adds default layout definitions</code>
	 */
	private static void addDefaultLayoutDef(String name, String body, String header, String footer) {
		Map<String, Attribute> attributes = new HashMap<String, Attribute>();

		
		attributes.put("header", new Attribute(header));
		attributes.put("body", new Attribute(body));
		attributes.put("footer", new Attribute(footer));
		
	}

	}
