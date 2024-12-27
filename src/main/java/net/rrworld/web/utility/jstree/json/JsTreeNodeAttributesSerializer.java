/**
 * 
 */
package net.rrworld.web.utility.jstree.json;

import java.io.IOException;

import net.rrworld.web.utility.jstree.JsTreeNodeAttributes;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * JsTreeNodeAttributesSerializer is used to write JSON representation of
 * <code>JsTreeNodeAttributes</code>. This objects holds a map of attributes
 * with key/values. The map is written in JSON with standard representation but
 * its name ("attributes") is not written, only the attributes entries.
 * 
 * @author LRI
 * 
 */
public class JsTreeNodeAttributesSerializer extends StdSerializer<JsTreeNodeAttributes> {

	/**
	 * 
	 * Build a new instance of JsTreeSerializer.java.
	 */
	public JsTreeNodeAttributesSerializer() {
		super(JsTreeNodeAttributes.class);
	}

	/**
	 * 
	 * @see org.codehaus.jackson.map.ser.std.SerializerBase#serialize(java.lang.Object,
	 *      org.codehaus.jackson.JsonGenerator,
	 *      org.codehaus.jackson.map.SerializerProvider)
	 */
	@Override
	public void serialize(final JsTreeNodeAttributes value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonGenerationException {
		jgen.writeObject(value.getAttributes());
	}

}
