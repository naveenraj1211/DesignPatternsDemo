package org.example.factory.documentprocessingexample;

public class DocumentProcessorFactory {

    public static DocumentProcessor createDocumentProcessor(DocumentType documentType, String documentName) {

        return switch (documentType) {
            case TEXT -> new TextDocumentProcessor(documentName);
            case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(documentName);
            case PRESENTATION -> new PresentationDocumentProcessor(documentName);
        };

    }
}
