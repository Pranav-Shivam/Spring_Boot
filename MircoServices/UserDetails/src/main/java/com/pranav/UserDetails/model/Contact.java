package com.pranav.UserDetails.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Contact {
    private  String cid,email,contactName;
    private Long userId;
}
