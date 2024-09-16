package org.example.factory.documentprocessorexample;


import org.example.factory.documentprocessorexample.parser.DocumentParser;
import org.example.factory.documentprocessorexample.parser.SpreadsheetDocumentParser;
import org.example.factory.documentprocessorexample.printer.DocumentPrinter;
import org.example.factory.documentprocessorexample.printer.SpreadsheetDocumentPrinter;
import org.example.factory.documentprocessorexample.processor.DocumentProcessor;
import org.example.factory.documentprocessorexample.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}