package util;

import java.util.ArrayList;
import java.util.List;

import entities.PoliticGroup;
import entities.types.PoliticTypes;

public class GeneratePoliticGroup implements Generator<List<PoliticGroup>> {

	@Override
	public List<PoliticGroup> generate() {
		List<PoliticGroup> list = new ArrayList<PoliticGroup>();
		for (PoliticTypes type : PoliticTypes.values()) {
			list.add(new PoliticGroup(type.name()));
		}
		return list;
	}
}
