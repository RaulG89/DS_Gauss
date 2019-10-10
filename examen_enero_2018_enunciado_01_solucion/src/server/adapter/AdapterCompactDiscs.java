package server.adapter;

import java.util.ArrayList;
import java.util.List;

import model.CompactDisc;
import model.File;

public class AdapterCompactDiscs {
	public CompactDisc getCompactDisk(File file) {
		String title = file.getString1();
		String artist = file.getString2();
		return new CompactDisc(title, artist);
	}

	public List<CompactDisc> getCompactDisks(List<File> files) {
		List<CompactDisc> books = new ArrayList<CompactDisc>();
		for (File file : files) {
			books.add(getCompactDisk(file));
		}
		return books;
	}
}
