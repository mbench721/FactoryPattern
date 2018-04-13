package factoryLib;

import factoryLib.components.Label;
import factoryLib.components.ListBox;
import factoryLib.components.MultiLineTextBox;
import factoryLib.components.TextBox;

public class ComponentFactory {
	static Component InitializeComponent(ComponentType c)
	{
		Component cTemp = null;
		
		switch(c)
		{
		case Label:
			cTemp = new Label(ComponentType.Label);
		case ListBox:
			cTemp = new ListBox(ComponentType.ListBox);
		case MultiTextBox:
			cTemp = new MultiLineTextBox(ComponentType.MultiTextBox);
		case TextBox:
			cTemp = new TextBox(ComponentType.TextBox);
		}
		
		return cTemp;
	}
}
