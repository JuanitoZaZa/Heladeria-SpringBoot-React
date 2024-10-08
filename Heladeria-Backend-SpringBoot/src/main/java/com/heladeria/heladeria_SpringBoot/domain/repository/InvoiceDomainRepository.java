package com.heladeria.heladeria_SpringBoot.domain.repository;

import com.heladeria.heladeria_SpringBoot.domain.InvoiceDomain;
import com.heladeria.heladeria_SpringBoot.persistence.entity.Invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceDomainRepository {
    List<InvoiceDomain> getAll();
    InvoiceDomain save(InvoiceDomain invoiceDomain);
    Optional<InvoiceDomain> findById(int id);
    void deleteById(int id);
    Optional<List<InvoiceDomain>> findByDate(String date);
    Optional<List<InvoiceDomain>> findByTotalGreaterThan(Double total);
}
