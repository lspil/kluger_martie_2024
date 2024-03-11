package org.invoicing.services;

import org.invoicing.services.impl.FastInvoiceService;

public sealed interface InvoiceService permits FastInvoiceService {

    void createInvoice();

    static InvoiceService create() {
        return new FastInvoiceService();
    }
}
