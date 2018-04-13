package factoryLib;

import factoryLib.components.Label;
import factoryLib.components.ListBox;
import factoryLib.components.MultiLineTextBox;
import factoryLib.components.TextBox;

public class ComponentFactory {
	static Component InitializeComponent(ComponentType c, TargetSource s)
	{
		Component cTemp = null;
		
		switch(c)
		{
		case Label:
			cTemp = new Label(s);
		case ListBox:
			cTemp = new ListBox(s);
		case MultiTextBox:
			cTemp = new MultiLineTextBox(s);
		case TextBox:
			cTemp = new TextBox(s);
		}
		
		return cTemp;
	}
}
