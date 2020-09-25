package com.hib;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class InsertData {
HibernateTemplate ht;

public void setHt(HibernateTemplate ht) {
	this.ht = ht;
}
public void insert(Student s) {
	ht.save(s);
}
}
