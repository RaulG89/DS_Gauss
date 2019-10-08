package server.servers;

import java.util.ArrayList;
import java.util.List;

import model.File;
import model.Mobile;
import server.ServerI;

public class ServerMobiles implements ServerI {
	private List<File> mobiles;

	@Override
	public List<File> download() {
		System.out.println("Bajando móviles del servidor...");
		if (mobiles == null) {
			mobiles = new ArrayList<>();
			mobiles.add(new Mobile("Samsung", "Galaxy S8"));
			mobiles.add(new Mobile("Apple", "iPhone 8"));
		}
		return mobiles;
	}

	@Override
	public void upload(List<File> files) {
		System.out.println("Enviando móviles al servidor...");
		this.mobiles = files;
	}

}
