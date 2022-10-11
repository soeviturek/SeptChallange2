package com.example.challange.Controller;

import com.example.challange.model.Account;
import com.example.challange.model.Person;
import com.example.challange.service.AccountServiceImpl;
import com.example.challange.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    AccountServiceImpl accountService;

    @PostMapping("/account")
    ResponseEntity<Object> createPerson(@RequestBody Account account){
        Account check = accountService.addAccount(account);
        if(check == null){
            ResponseEntity.badRequest().body("failed creating new account");
        }
        return ResponseEntity.ok("created!"+check);
    }
    @PutMapping("/account")
    ResponseEntity<Object> updatePerson(@RequestBody Account account){
        Account check = accountService.updateAccount(account);
        if(check == null){
            ResponseEntity.badRequest().body("failed updating account");
        }
        return ResponseEntity.ok("Updated!"+check);
    }
    @GetMapping("/account/{accountNumber}")
    ResponseEntity<Object> getAccount(@PathVariable("accountNumber") String accountNumber){
        Account check = accountService.getAccountByAccountNumber(accountNumber);
        if(check == null){
            ResponseEntity.badRequest().body("failed getting account");
        }
        return ResponseEntity.ok(check);
    }
    @GetMapping("/account/person/{id}")
    ResponseEntity<Object> getPersonAccounts(@PathVariable("id") int id){
        List<Account> list = accountService.getPersonAccounts(id);
        return ResponseEntity.ok(list);
    }
    @GetMapping("/account")
    ResponseEntity<Object> getAllAccounts(){
        List<Account> list = accountService.getAllAccounts();
        return ResponseEntity.ok(list);
    }
    @DeleteMapping("/account/{accountNumber}")
    ResponseEntity<Object> deleteAccount(@PathVariable("accountNumber") String accountNumber){
        accountService.deleteAccountByNumber(accountNumber);
        return ResponseEntity.ok("Deleted!");
    }

}
