package server;

import java.util.List;

import model.File;

public interface ServerI {
	public List<File> download();

	public void upload(List<File> files);
}
