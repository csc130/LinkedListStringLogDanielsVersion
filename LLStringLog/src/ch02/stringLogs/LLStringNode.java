package ch02.stringLogs;

public class LLStringNode {
	String info;
	LLStringNode link;
	
	public LLStringNode(String info){
		this.info = info;
		link = null;		
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public LLStringNode getLink() {
		return link;
	}

	public void setLink(LLStringNode link) {
		this.link = link;
	}
	
	
}
