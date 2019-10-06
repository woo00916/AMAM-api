package com.handmadecode.amam.model;

import lombok.*;
import org.springframework.data.annotation.Id;

//@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
 //   @Id private String id;
    private String email;
    private String pw;
}
