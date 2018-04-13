package factoryLib;

public abstract class Component {
	private ComponentType componentType;
	private String content;
	private int height;
	private int width;
	private int topPadding;
	private int leftPadding;
	
	
	public ComponentType getComponentType() {
		return componentType;
	}
	public void setComponentType(ComponentType componentType) {
		this.componentType = componentType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getTopPadding() {
		return topPadding;
	}
	public void setTopPadding(int topPadding) {
		this.topPadding = topPadding;
	}
	public int getLeftPadding() {
		return leftPadding;
	}
	public void setLeftPadding(int leftPadding) {
		this.leftPadding = leftPadding;
	}
	
	public Component(ComponentType cType)
	{
		setComponentType(cType);

	}
}
