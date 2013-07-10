package ch02.stringLogs;

public class LLStringLog implements StringLogInterface {
	
	private LLStringNode first;
	private LLStringNode current_node;

	
	public LLStringLog(String text) {
		this.first = new LLStringNode(text);
	}
	
	@Override
	//insert at the end
	public void insert(String element) {
		// TODO Auto-generated method stub
		current_node = this.first;
		while (current_node.getLink() != null) {
			current_node = current_node.getLink();
		}
		current_node.setLink(new LLStringNode(element));
	}

	//insert in the beginning
	public void insert_beginning(String element) {
		
		LLStringNode newNode = new LLStringNode(element);
		newNode.setLink(first);
		first = newNode;
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(String element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		String return_string = this.first.getInfo() + "\n";
		if (this.first.getLink() == null) {
			return return_string;
		}
		current_node = this.first.getLink();
		while (current_node != null) {
			return_string += current_node.getInfo() + "\n";
			current_node = current_node.getLink();
		}
		
		return return_string;
	}
	
}
