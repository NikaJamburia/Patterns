package nika.facade;

import nika.composite.Component;
import nika.composite.Directory;
import nika.composite.File;
import nika.composite.fileBrowser.FileBrowser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeFacade implements Facade {
	@Override
	public void compose() {
		FileBrowser fileBrowser = new FileBrowser(buildUpRoot());
		fileBrowser.open(0);
		fileBrowser.open(2);
		fileBrowser.open(0);
		fileBrowser.goBack();
		fileBrowser.goToRoot();
		fileBrowser.open(1);
		fileBrowser.open(1);
		fileBrowser.goToRoot();

	}

	private Component buildUpRoot() {
		List<Component> aboutUsFolderContent = new ArrayList<>();
		aboutUsFolderContent.add(new File("contact.html", "<h1> Contact us: </h1>"));
		Component aboutUsFolder = new Directory("about_us", aboutUsFolderContent);

		List<Component> htmlFolderContents = Arrays.asList(
				new File("index.html", "<h1> index page </h1>"),
				new File("catalog.html", "<h1> Catalog page </h1>"),
				aboutUsFolder
		);
		Component htmlFolder = new Directory("html", htmlFolderContents);

		List<Component> cssFolderContents = Arrays.asList(
				new File("main.css", "{main css file ...}"),
				new File("catalog.css", "{catalog css file ...}"),
				new File("headings.css", "{headings css file ...}")
		);
		Component cssFolder = new Directory("css", cssFolderContents);

		List<Component> rootContents = new ArrayList<>();
		rootContents.add(htmlFolder);
		rootContents.add(cssFolder);
		Component fileSystemRoot = new Directory("root", rootContents);

		return fileSystemRoot;
	}
}
