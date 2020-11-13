package dmacc.repository;

import org.springframework.stereotype.Repository;

import dmacc.beans.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

	
}
