package com.example.challange.repository;

import com.example.challange.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {
    @Query(value = "SELECT * FROM account WHERE id = :id",nativeQuery = true)
    List<Account> findPersonAccounts(@Param("id")int id);
}
