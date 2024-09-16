package org.example.adapter.languagetranslation;

import org.example.adapter.languagetranslation.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslationApiAdapter implements TranslationProviderAdapter {

    //composition
    private final MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        return microsoftTranslateApi.translate(translationRequest.getText(),
                translationRequest.getSourceLanguage(),
                translationRequest.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}
