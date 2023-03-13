package com.pranav.ContactDetails.model;

import lombok.*;

@AllArgsConstructor
@Builder
@Setter
@Getter
@NoArgsConstructor
public class Contact {
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;
}
