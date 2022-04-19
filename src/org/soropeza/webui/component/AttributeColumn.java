package org.soropeza.webui.component;

import org.compiere.model.GridField;
import org.compiere.model.GridTab;

import com.ingeint.form.WPAttributeEditor;

public class AttributeColumn extends WPAttributeEditor implements IColumnGrid{
	
	public int line_id;

	public AttributeColumn(GridTab gridTab, GridField gridField) {
		super(gridTab, gridField);
	}	
	
	public void setLine_ID(int line_id) {
		if (line_id > 0)
			this.line_id = line_id;
	}
	
	public int getLine_ID() {
		return this.line_id;
	}

}
