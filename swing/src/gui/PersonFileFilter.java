package gui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class PersonFileFilter extends FileFilter {

	public boolean accept(File file) {
		
		if(file.isDirectory()) {
			return true;
		}
		
		String name = file.getName();
		
		String extension = Utils.getFileExtention(name);
		
		if(extension == null) {
			
			return false;
		}
		if(extension.equals("per")){
			return true;
		}
		
		return false;
	}

	public String getDescription() {
		return "Person database files (*.per)";
	}

}
