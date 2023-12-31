package org.java.es1.main.gift;

public class Gift {
	
	private String name;
	private String recipient;
	
	public Gift(String name, String recipient) {
		setName(name);
		setRecipietn(recipient);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setRecipietn(String recipient) {
		this.recipient = recipient;
	}

	public String toString() {
		return "Regalo: " + name + ", destinatario: " + recipient;
	}
}