package lab5.ex5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SupportedProjectItem extends ProjectDecorator {

	private List<File> supportingDocuments = new ArrayList<File>();

	public SupportedProjectItem() {
	}

	public SupportedProjectItem(File newSupportingDocuments) {
		super();
		addSupportingDocument(newSupportingDocuments);
	}

	public void addSupportingDocument(File document) {
		supportingDocuments.add(document);

	}

	public void removeSupportingDocument(File document) {
		supportingDocuments.remove(document);

	}

	public String toString() {
		return getProjectItem().toString() + EOL_STRING + "\tSupporting Documents: " + supportingDocuments;
	}
}
