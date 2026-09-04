package com.example.credit_card.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Entity
public class UserEntity {
    @Id
    private String custId;
    private String username;
    private String panNo;
    private String mobileNo;
    private String resiAddress;
    private String permAddress;
    private Date dateOfBirth;
    private String employmentType;
    private long salary;
}
