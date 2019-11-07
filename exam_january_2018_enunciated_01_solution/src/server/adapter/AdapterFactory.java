package server.adapter;

public class AdapterFactory {
	private AdapterBook books;
	private AdapterCompactDiscs compactDiscs;
	private AdapterMobiles mobiles;

	public AdapterFactory() {
		this.books = new AdapterBook();
		this.compactDiscs = new AdapterCompactDiscs();
		this.mobiles = new AdapterMobiles();
	}

	public AdapterBook getBooks() {
		return books;
	}

	public AdapterCompactDiscs getCompactDiscs() {
		return compactDiscs;
	}

	public AdapterMobiles getMobiles() {
		return mobiles;
	}

}
