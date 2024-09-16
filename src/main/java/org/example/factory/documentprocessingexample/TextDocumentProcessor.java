package org.example.factory.documentprocessingexample;

public class TextDocumentProcessor extends DocumentProcessor {

    // Constructor for the TextDocumentProcessor class
    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    // Method for processing the text document
    @Override
    public void processDocument() {
        System.out.println("Processing a text document: " + getDocumentName());
    }

    // Method for getting the type of document the processor supports
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
