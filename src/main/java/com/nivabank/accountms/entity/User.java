package com.nivabank.accountms.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
@Id
  private  String id;
  @NotEmpty(message = "Name may not be empty")
  @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
  private String name;
  @NotEmpty(message = "Email may not be empty")
  @Email(message = "Email cant be empty")
  private String email;
  @NotEmpty(message = "Password may not be empty")
  @Size(min = 8, max = 32, message = "Password must be between 8 and 32 characters long")

  private String password;
  @NotEmpty(message = "Address may not be empty")
  @Size(min = 3, max = 32, message = "Address must be between 3 and 32 characters long")
  private String address;

  private  long accountno;
  private UserStatus userStatus;


}
