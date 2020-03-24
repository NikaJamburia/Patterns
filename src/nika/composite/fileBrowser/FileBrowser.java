package nika.composite.fileBrowser;

import nika.composite.Component;

public class FileBrowser {
	private Component root;
	private Component currentComponent;
	private Component previousComponent;

	public FileBrowser(Component root) {
		this.root = root;
		goToRoot();
	}

	public void open(Integer index) {
		Component newComponent = currentComponent.open().get(index);
		newComponent.print();
		progress(newComponent);
	}

	public void goBack() {
		if (previousComponent == null) {
			System.out.println("Can't go further back");
		}
		else {
			previousComponent.print();
			currentComponent = previousComponent;
			previousComponent = null;
		}
	}

	public void goToRoot() {
		root.print();
		previousComponent = null;
		currentComponent = root;
	}

	private void progress(Component newComp) {
		previousComponent = currentComponent;
		currentComponent = newComp;
	}


}
