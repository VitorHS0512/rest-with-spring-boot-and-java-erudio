package br.com.erudio;

public class Greetings {

	private final long id;
	private final String content;
	
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public Greetings(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
}
