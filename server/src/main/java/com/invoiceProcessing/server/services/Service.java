package com.invoiceProcessing.server.services;

import com.invoiceProcessing.server.model.Invoice;

import java.util.List;

public interface Service {
    public Invoice addInvoice(Invoice invoice);
    public List<Invoice> getInvoices();
    public Invoice deleteInvoices(long l);
}
