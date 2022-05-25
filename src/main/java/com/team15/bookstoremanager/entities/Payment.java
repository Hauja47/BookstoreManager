package com.team15.bookstoremanager.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "receiver_type", nullable = false, length = 191)
    private String receiverType;

    @Column(name = "receiver_id", nullable = false)
    private Long receiverId;

    @Column(name = "payable_type", length = 191)
    private String payableType;

    @Column(name = "payable_id")
    private Long payableId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "money", nullable = false)
    private Integer money;

    @Column(name = "can_edit_note", nullable = false)
    private Boolean canEditNote = false;

    @Column(name = "can_delete", nullable = false)
    private Boolean canDelete = false;

    @Lob
    @Column(name = "note")
    private String note;

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

    public String getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(String receiverType) {
        this.receiverType = receiverType;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getPayableType() {
        return payableType;
    }

    public void setPayableType(String payableType) {
        this.payableType = payableType;
    }

    public Long getPayableId() {
        return payableId;
    }

    public void setPayableId(Long payableId) {
        this.payableId = payableId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Boolean getCanEditNote() {
        return canEditNote;
    }

    public void setCanEditNote(Boolean canEditNote) {
        this.canEditNote = canEditNote;
    }

    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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