package server.adapter;

import java.util.ArrayList;
import java.util.List;

import model.File;
import model.Mobile;

public class AdapterMobiles {

	public Mobile getMobile(File file) {
		String brand = file.getString1();
		String model = file.getString2();
		return new Mobile(brand, model);
	}

	public List<Mobile> getMobiles(List<File> files) {
		List<Mobile> books = new ArrayList<Mobile>();
		for (File file : files) {
			books.add(getMobile(file));
		}
		return books;
	}
}
