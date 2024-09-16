package org.example.prototype.invoice;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry{

    private final Map<InvoiceType,Invoice> map = new HashMap<>();

    @Override
    public void addPrototype(Invoice user) {
        map.put(user.getType(),user);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return map.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return map.get(type).cloneObject();
    }
}
