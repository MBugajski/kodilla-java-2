package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product = new Product("Apple");
        Product product1 = new Product("Orange");
        Product product2 = new Product("Banana");
        Item item = new Item(product, new BigDecimal(10), 3);
        Item item1 = new Item(product1, new BigDecimal(15), 1);
        Item item2 = new Item(product2, new BigDecimal(6), 2);
        Item item3 = new Item(product, new BigDecimal(7.5), 5);
//        product.getItems().add(item);
//        product.getItems().add(item3);
//        product1.getItems().add(item1);
//        product2.getItems().add(item2);
        Invoice invoice = new Invoice("1/08/2018");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }

    @Test
    public void testInvoiceDaoSaveWithHelperMethods(){
        //Given
        Product product = new Product("Apple");
        Product product1 = new Product("Orange");
        Product product2 = new Product("Banana");
        Item item = new Item(product, new BigDecimal(10), 3);
        Item item1 = new Item(product1, new BigDecimal(15), 1);
        Item item2 = new Item(product2, new BigDecimal(6), 2);
        Item item3 = new Item(product, new BigDecimal(7.5), 5);
//        product.addItem(item);
//        product.addItem(item3);
//        product1.addItem(item1);
//        product2.addItem(item2);
        Invoice invoice = new Invoice("1/08/2018");
        invoice.addItem(item);
        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
