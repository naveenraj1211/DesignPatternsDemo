package org.example.factory.documentprocessorexample;

import org.example.factory.documentprocessorexample.parser.DocumentParser;
import org.example.factory.documentprocessorexample.parser.TextDocumentParser;
import org.example.factory.documentprocessorexample.printer.DocumentPrinter;
import org.example.factory.documentprocessorexample.printer.TextDocumentPrinter;
import org.example.factory.documentprocessorexample.processor.DocumentProcessor;
import org.example.factory.documentprocessorexample.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}