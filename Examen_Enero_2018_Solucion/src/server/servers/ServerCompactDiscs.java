package server.servers;

import java.util.ArrayList;
import java.util.List;

import model.CompactDisc;
import model.File;
import server.ServerI;

public class ServerCompactDiscs implements ServerI {
	private List<File> cds;

	@Override
	public List<File> download() {
		System.out.println("Bajando discos del servidor...");
		if (cds == null) {
			cds = new ArrayList<>();
			cds.add(new CompactDisc("Despacito", "Luis Fonsi"));
			cds.add(new CompactDisc("Dragon's Kiss", "Marty Friedman"));
		}
		return cds;
	}

	@Override
	public void upload(List<File> files) {
		System.out.println("Enviando discos al servidor...");
		this.cds = files;
	}
}
