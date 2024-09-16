package org.example.adapter.languagetranslation;

import org.example.adapter.languagetranslation.external.GoogleTranslateApi;
import org.example.adapter.languagetranslation.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslateApiAdapter implements TranslationProviderAdapter {

    private final GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        GoogleTranslationRequest googleTranslationRequest
                = new GoogleTranslationRequest(translationRequest.getText(), translationRequest.getSourceLanguage(),
                translationRequest.getTargetLanguage(),
                translationRequest.getConfidenceThreshold());
        return googleTranslateApi.convert(googleTranslationRequest);
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
