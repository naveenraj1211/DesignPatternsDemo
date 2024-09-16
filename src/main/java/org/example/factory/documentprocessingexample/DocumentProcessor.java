package org.example.factory.documentprocessingexample;

public abstract class DocumentProcessor {

    private String documentName;

    // Constructor for the DocumentProcessor class
    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    // Getter for the document name
    public String getDocumentName() {
        return documentName;
    }

    // Abstract method for processing the document
    public abstract void processDocument();

    // Abstract method for getting the type of document the processor supports
    public abstract DocumentType supportsType();
}
