package hu.nive.ujratervezes.io.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class Phonebook {

	public void exportPhonebook(Map<String, String> contacts, String output) {
		if (contacts == null || output == null) {
			throw new IllegalArgumentException("Some of the parameters is null!");
		}
		Path path = Paths.get(output);
		clean(path);
		String prefix = "";
		for (Map.Entry<String, String> entry: contacts.entrySet()) {
			try {
				Files.write(path, 
						(prefix + entry.getKey() + ": " + entry.getValue())
							.getBytes(),
							StandardOpenOption.APPEND);
				prefix = "\n";
			} catch (IOException e) {
			}
		}
	}

	private void clean(Path path) {
		try {
			Files.delete(path);
		} catch (IOException e1) {
		}
		try {
			Files.createFile(path);
		} catch (IOException e1) {
		}
	}

	
}