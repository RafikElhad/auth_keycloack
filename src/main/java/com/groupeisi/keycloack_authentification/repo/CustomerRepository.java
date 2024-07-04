package com.groupeisi.keycloack_authentification.repo;

import com.groupeisi.keycloack_authentification.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
