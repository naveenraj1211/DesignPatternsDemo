package org.example.factory.documentprocessorexample.parser;

import org.example.factory.documentprocessorexample.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}