package com.example.challange.repository;

import com.example.challange.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,String> {
    @Query(value = "SELECT * FROM account WHERE id = :id",nativeQuery = true)
    List<Account> findPersonAccounts(@Param("id")int id);
}
