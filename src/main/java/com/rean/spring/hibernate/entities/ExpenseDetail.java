package com.rean.spring.hibernate.entities;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="expense_detail")
public class ExpenseDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="exp_det_seq_id")
	@SequenceGenerator(name="exp_det_seq_id", sequenceName="exp_det_seq_id", allocationSize=1, initialValue=1)
	
	private int expDetId;
	//private int expId;
	private BigDecimal expQty;
	private String descrition;
	private BigDecimal unitPrice;
	private Boolean currentcy;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="expId")
	private Expense expense;
	
	public Expense getExpense() {
		return expense;
	}
	public void setExpense(Expense expense) {
		this.expense = expense;
	}
	public BigDecimal getExpQty() {
		return expQty;
	}
	public void setExpQty(BigDecimal expQty) {
		this.expQty = expQty;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getExpDetId() {
		return expDetId;
	}
	public void setExpDetId(int expDetId) {
		this.expDetId = expDetId;
	}
	public Boolean getCurrentcy() {
		return currentcy;
	}
	public void setCurrentcy(Boolean currentcy) {
		this.currentcy = currentcy;
	}
	
	
}
