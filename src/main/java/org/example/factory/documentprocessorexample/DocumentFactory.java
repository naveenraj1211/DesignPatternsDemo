package org.example.factory.documentprocessorexample;

import org.example.factory.documentprocessorexample.parser.DocumentParser;
import org.example.factory.documentprocessorexample.printer.DocumentPrinter;
import org.example.factory.documentprocessorexample.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentParser createDocumentParser(String path);

    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);

    public abstract DocumentProcessor createDocumentProcessor(String documentName);

    public abstract DocumentType supportsType();
}