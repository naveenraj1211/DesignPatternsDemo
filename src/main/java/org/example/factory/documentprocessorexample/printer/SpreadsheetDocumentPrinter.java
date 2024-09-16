package org.example.factory.documentprocessorexample.printer;


import org.example.factory.documentprocessorexample.DocumentType;
import org.example.factory.documentprocessorexample.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}