package org.example.factory.documentprocessorexample.printer;

import org.example.factory.documentprocessorexample.DocumentType;
import org.example.factory.documentprocessorexample.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}