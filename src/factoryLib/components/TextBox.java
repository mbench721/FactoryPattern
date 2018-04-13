package factoryLib.components;

import factoryLib.Component;
import factoryLib.ComponentType;
import factoryLib.TargetSource;

public class TextBox extends Component {
	
	public TextBox(TargetSource s)
	{
		super(ComponentType.TextBox);
	}
}
