package mc.model;

public class Entry {
	private final long id;
	private final String title;
	private final String date;
	private final String body;
	
	public Entry(long id, String title, String date, String body) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.body = body;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDate() {
		return date;
	}

	public String getBody() {
		return body;
	}
}
