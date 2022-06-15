package com.instagramproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.instagramproject.Model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer> {
	@Query("SELECT s FROM Status s WHERE s.statusId=:Id")
    public Status find(int Id);
}
