package factoryLib;

public abstract class Component {
	private TargetSource source;
	private ComponentType type;
	private String content;
	private int height;
	private int width;
	private int yPosition;
	private int xPosition;
	
	
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
	public TargetSource getSource() {
		return source;
	}
	public void setSource(TargetSource source) {
		this.source = source;
	}
	public ComponentType getType() {
		return type;
	}
	public void setType(ComponentType type) {
		this.type = type;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getXPosition() {
		return xPosition;
	}
	public void setXPosition(int xposition) {
		this.xPosition = xposition;
	}
	
	public Component(ComponentType cType)
	{
		setType(cType);
	}
	
	public Component(ComponentType cType, TargetSource source)
	{
		setType(cType);
		setSource(source);

	}
}
