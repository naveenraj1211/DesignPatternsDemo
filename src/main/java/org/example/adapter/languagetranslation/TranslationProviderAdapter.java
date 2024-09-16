package org.example.adapter.languagetranslation;

import java.util.List;

public interface TranslationProviderAdapter {

    public String translate(TranslationRequest request);
    public List<String> getSupportedLanguages();
}