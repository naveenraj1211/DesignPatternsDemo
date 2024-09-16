package org.example.factory.documentprocessorexample.printer;


import org.example.factory.documentprocessorexample.DocumentType;
import org.example.factory.documentprocessorexample.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}