package org.delivery;


import org.invoicing.services.InvoiceService;

public class DeliveryService {

    private InvoiceService service;

    public DeliveryService() {
        this.service = InvoiceService.create() ;
    }

    public void delivery() {
        service.createInvoice();
    }
}
