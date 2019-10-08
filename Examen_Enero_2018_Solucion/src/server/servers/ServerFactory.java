package server.servers;

public class ServerFactory {
	private ServerBooks books;
	private ServerCompactDiscs compactDiscs;
	private ServerMobiles mobiles;

	public ServerFactory() {
		this.books = new ServerBooks();
		this.compactDiscs = new ServerCompactDiscs();
		this.mobiles = new ServerMobiles();
	}

	public ServerBooks getBooks() {
		return books;
	}

	public ServerCompactDiscs getCompactDiscs() {
		return compactDiscs;
	}

	public ServerMobiles getMobiles() {
		return mobiles;
	}

}
