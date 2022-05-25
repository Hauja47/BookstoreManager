package com.team15.bookstoremanager.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "return_goods_receipt_details")
public class ReturnGoodsReceiptDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "return_goods_receipt_id", nullable = false)
    private ReturnGoodsReceipt returnGoodsReceipt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "invoice_detail_id", nullable = false)
    private InvoiceDetail invoiceDetail;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "cost", nullable = false)
    private Integer cost;

    @Column(name = "total", nullable = false)
    private Integer total;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReturnGoodsReceipt getReturnGoodsReceipt() {
        return returnGoodsReceipt;
    }

    public void setReturnGoodsReceipt(ReturnGoodsReceipt returnGoodsReceipt) {
        this.returnGoodsReceipt = returnGoodsReceipt;
    }

    public InvoiceDetail getInvoiceDetail() {
        return invoiceDetail;
    }

    public void setInvoiceDetail(InvoiceDetail invoiceDetail) {
        this.invoiceDetail = invoiceDetail;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}