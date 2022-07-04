package com.cydeo.repository;

import com.cydeo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    //method --- > sql ----- > derive query

    //sql - @Query

    //JPQL - @Query


}
