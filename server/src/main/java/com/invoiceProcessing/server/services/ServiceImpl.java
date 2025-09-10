package com.invoiceProcessing.server.services;

import com.invoiceProcessing.server.dao.InvoiceDao;
import com.invoiceProcessing.server.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements  Service{
    @Autowired
    InvoiceDao invoiceDao;

    @Override
    public Invoice addInvoice(Invoice invoice) {
        invoiceDao.save(invoice);
        return invoice;
    }

    @Override
    public List<Invoice> getInvoices(){
        return invoiceDao.findAll();
    }

    @Override
    public Invoice deleteInvoices(long id) {
        Invoice invoice;
        invoice = invoiceDao.findById(id).get();
        invoiceDao.delete(invoice);
        return invoice;
    }

}
