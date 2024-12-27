/**
 * 
 */
package net.rrworld.web.utility.jstree.json;

import java.io.IOException;

import net.rrworld.web.utility.jstree.JsTree;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * JsTreeSerializer is used to write a JsTree JSON representation. No matter the
 * number of root node, the JSON representation is a an array of each JsTreeNode
 * from {@link JsTree#getRoots()} collections. The "roots" name attribute
 * shouldn't not be written is the JSON.
 * 
 * @author LRI
 * 
 */
public class JsTreeSerializer extends StdSerializer<JsTree> {

	/**
	 * 
	 * Build a new instance of JsTreeSerializer.java.
	 */
	public JsTreeSerializer() {
		super(JsTree.class);
	}

	/**
	 * 
	 * @see org.codehaus.jackson.map.ser.std.SerializerBase#serialize(java.lang.Object,
	 *      org.codehaus.jackson.JsonGenerator,
	 *      org.codehaus.jackson.map.SerializerProvider)
	 */
	@Override
	public void serialize(final JsTree value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonGenerationException {
		jgen.writeObject(value.getRoots());
	}

}
