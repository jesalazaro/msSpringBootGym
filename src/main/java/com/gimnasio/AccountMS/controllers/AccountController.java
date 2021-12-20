package com.gimnasio.AccountMS.controllers;

import com.gimnasio.AccountMS.models.Account;
import com.gimnasio.AccountMS.repositories.AccountRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class AccountController {
    private final AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/accounts/{username}")
    public Optional<Account> getAccount(@PathVariable String username){

        return this.repository.findById(username);
    }

    @PostMapping("/accounts")
    public Account newAccount(@RequestBody Account account){

        return this.repository.save(account);
    }

    @DeleteMapping("/accounts/{username}")
    public void deleteAccount(@PathVariable String username){
        repository.deleteById(username);
    }

    @PutMapping("accounts/{username}")
    public Account updateAccount(@PathVariable String username, @RequestBody Account new_account){
        Account old_account = repository.findById(username).orElse(null);

        old_account.setPlan((new_account.getPlan()));
        old_account.setPurchaseDate(new_account.getPurchaseDate());

        return repository.save(old_account);
    }
}
